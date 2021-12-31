package th1.a;

import th1.a.EmailExample;

public class EmailExampleTest {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[]{"a@gmail.com","ab@yahoo.com","abc@hotmai;.com"};
    public static final String[] invaliEmail = new String[]{"@gmail.com","ab@gmail.","@#abc@gmail.com"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email: validEmail) {
          boolean isvalid = emailExample.validate(email);
            System.out.println("Email is" + email + "is valid : " + isvalid);
        }

        for (String email: invaliEmail) {
          boolean isvalid = emailExample.validate(email);
            System.out.println("Email is" + email + "is valid : " + isvalid);
        }
    }
}
