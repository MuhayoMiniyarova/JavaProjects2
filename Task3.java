package JavaProjects2;

public class Task3 {
    public static void main(String[] args) {
        //Check if a String is Palindrome: Determine whether a
        // given string is a palindrome, which means it reads the same forwards and
        //backward. For example, "madam" is a palindrome.
        String str="radar";
        String str1="";
        int strLength=str.length();
        for (int i =(strLength-1); i>=0; i--) {
            str1=str1+str.charAt(i);
        }
        if (str.equals(str1)) {
            System.out.println(str+" is a Palindrome");
        }else {
            System.out.println(str + " is not a Palindrome");
        }
    }
}
