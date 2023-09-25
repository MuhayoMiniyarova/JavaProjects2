package JavaProjects2;



public class Task7 {
    /*You have a list of strings and you want to keep only
    those that start with “A” and
     you want to return them in lower case*/
    public static void main(String[] args) {
        String [] city={"Annandale","Fairfax","Centreville","Arlington","Ashburn"};
        for (int i = 0; i <city.length; i++) {
            if (city[i].startsWith("A"))
            {
                System.out.println(city[i].toLowerCase());
            }
        }}}