package JavaProjects2;

public class RegistrationTester {

    public static void main(String[] args) {
        Registration r = new Registration("muhayo@gmail.com", "Muhayo00", "pass123");
        r.setEmail("muhayo@yahoo.com");
        r.setUserName("Muhayo123");
        r.setPassword("pass1234");

        System.out.println(r.getEmail());
        System.out.println(r.getUserName());
        System.out.println(r.getPassword());
    }
}
