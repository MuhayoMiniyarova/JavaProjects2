package JavaProjects2;

public class Task2 {
    public static void main(String[] args) {
        //Reverse a String: Write a function to reverse a given string. For
        //example, given the input "Hello", the output should be "olleH".
        String str="Hello";
        System.out.println("Before: "+str);
        StringBuilder str1=new StringBuilder();
        str1.append(str);
        str1.reverse();
        System.out.println("After: "+str1);
    }
}
