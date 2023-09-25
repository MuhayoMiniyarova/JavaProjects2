package JavaProjects2;
/*9. Create an Interface 'Shape' with undefined methods as calculateArea
and calculate Perimeter. Create 2 classes Circle & Square that
implements functionality defined in the Shape Interface. Test your
code.*/
public class ShapeTester{
    public static void main(String[] args) {
      Shape[] arr={new Circle(),new Square()};
      for(Shape a:arr){
          a.calculateArea();
          a.calculatePerimeter();
      }
    }
}

interface Shape {
    void calculateArea();
    void calculatePerimeter();
}
class Circle implements Shape{
    double radius=2.5;
    double area;
    double perimeter;

    @Override
    public void calculateArea() {
        area=radius*radius*Math.PI;
        System.out.println("Circle Area is: "+area);
    }

    @Override
    public void calculatePerimeter() {
        perimeter=2*Math.PI*radius;
        System.out.println("Circle Perimeter is: "+perimeter);
    }
}
class Square implements Shape{
    double side=4;
    double area;
    double perimeter;
    @Override
    public void calculateArea() {
        area=side*side;
        System.out.println("Square area is: "+area);
    }
    @Override
    public void calculatePerimeter() {
        perimeter=4*side;
        System.out.println("Square perimeter is: "+perimeter);

    }
}