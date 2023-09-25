package JavaProjects2;

public class Task4 {
    public static void main(String[] args) {
        /*Count the Number of Words in a String: Write a function to count the
        number of words in a given string. Words are separated by spaces or
        punctuation. For example, the input "Hello, world!" should return 2.*/


        String str="Java is a Programing Language";
        int strCount=str.split("\\s").length;
        System.out.println(strCount);

    }
}
