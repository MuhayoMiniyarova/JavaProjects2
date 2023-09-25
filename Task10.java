package JavaProjects2;

/*We have to calculate the average of marks obtained
     in three subjects by student A and by student B.
      Create class 'Marks' with an abstract method 'getPercentage'
       that will be returning the average percentage of marks.
       Provide implementation of abstract method in classes 'A'
        and 'B'. The constructor of student A takes the marks in
         three subjects as its parameters and the marks in four
          subjects as its parameters for student B. Test your code*/
// abstract class with abstract method
abstract class Marks{
    abstract double getPercentage();
}
class A extends Marks{
    private float sub1, sub2, sub3;

    public A(float s1, float s2, float s3) {
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
    }
    double getPercentage() {
        return (sub1 + sub2 + sub3)/300.0 * 100;
    }
}
class B extends Marks{
    private float sub1, sub2, sub3, sub4;

    public B(float s1, float s2, float s3, float s4) {
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
        sub4 = s4;
    }
    double getPercentage() {
        return (sub1 + sub2 + sub3 +sub4)/400.0 * 100;
    }
}
class Tester1 {
    public static void main(String[] args){

        A a = new A(80,55,76);
        B b = new B(74,90,86,95);

        double p1 = a.getPercentage();
        double p2 = b.getPercentage();

        System.out.println("Percentage of student A : " + p1);
        System.out.println("Percentage of student B : " + p2);
    }
}