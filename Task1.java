package JavaProjects2;

public class Task1 {
    public static void main(String[] args) {
       // 1. Write a program to swap
        // 2 String without a temporary variable?

        String s1="Hello";
        String s2="World";
        s1=s1+s2;
        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());
        System.out.println("Hello="+s1+" World="+s2);
    }
}
