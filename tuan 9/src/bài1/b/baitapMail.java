package bài1.b;

import java.lang.ref.WeakReference;
import java.util.Scanner;
import java.util.regex.Pattern;

public class baitapMail {
    public static String getMail(){
        Scanner scanner = new Scanner(System.in);
        String mail = "";
        while (true){
            System.out.println("input mail: ");
            mail = scanner.nextLine();
            Pattern pattern = Pattern.compile("^[a-zA-Z][a-zA-Z0-9]+@[a-zA-z]+(\\.[a-zA-Z]+)+$");
            if(pattern.matcher(mail).find()){
                break;
            }else{
                System.out.println("invalid mail, please input again : ");
            }
        }
return mail;

    }

    public static void main(String[] args) {
        String mail = getMail();
        System.out.println("mail: " + mail);
    }
}
