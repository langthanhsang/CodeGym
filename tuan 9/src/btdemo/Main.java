package btdemo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static String getPassWord() {
        Scanner sc = new Scanner(System.in);
        String password = "";
        while (true) {
            System.out.println("input password");
            password = sc.nextLine();
            Pattern pUpper = Pattern.compile("^.*[A-Z]+.*$");
            Pattern pLower = Pattern.compile("^.*[a-z]+.*$");
            Pattern pDigit = Pattern.compile("^.*[0-9]+.*$");
            Pattern PSpecial = Pattern.compile("^.*[#?!@$%^&*-]+.*$");
            Pattern pLength = Pattern.compile("^.{8}$");

            if (pUpper.matcher(password).find() && pLower.matcher(password).find() && pDigit.matcher(password).find()
                    && PSpecial.matcher(password).find() && pLength.matcher(password).find()) {
                System.out.println(password);

            } else {
                System.err.println("password is not ok");
            }
        }

    }

    public static void main(String[] args) {
        getPassWord();


    }
}
