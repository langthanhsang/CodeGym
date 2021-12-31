package bai1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
       String regex = "^[a-zA-Z]+\\d+[a-z0-9]*@{1}\\w+mail.com$";
       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher(input);
       if(matcher.find()){
           System.out.println("ok");
       }else{
           System.out.println("vui long nhap lai");
       }
    }
}
