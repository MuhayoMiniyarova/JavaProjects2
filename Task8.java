package JavaProjects2;

public class Task8 {
    /*Write a Java Function that increments a string,
    It should take the string of unknown length. Don't use regular expressions.
    Examples:
    123 -> 124
    53456 -> 53457
    29 -> 30
    Function signature:
    string Increment (string str)*/
    public static String Increment(String str){
        int num=Integer.valueOf(str);
        num++;
        return Integer.toString(num);
    }
    public static void main(String[] args) {
        String input1 = "222";
        String input2 = "333";
        String input3 = "444";
        System.out.println("Before: 222, After: "+Increment(input1));
        System.out.println("Before: 333, After: "+Increment(input2));
        System.out.println("Before: 444, After: "+Increment(input3));
    }
}

