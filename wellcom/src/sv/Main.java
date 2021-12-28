package sv;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Student[] students = new Student[10];
     students[0] = getStudentInfo();
     students[0].fee("dong hoc");
        System.out.println(students[0]);

    }
    public static Student getStudentInfo() {
       Student s = null;
       String id = new Scanner(System.in).nextLine();
        System.out.println("id");
       String name = new Scanner(System.in).nextLine();
        System.out.println("name");
       String address = new Scanner(System.in).nextLine();
        System.out.println("address");
       String email = new Scanner(System.in).nextLine();
        System.out.println("email");
       String phone= new Scanner(System.in).nextLine();
        System.out.println("phone");
       float fee = new Scanner(System.in).nextFloat();
        System.out.println("fee");
       s = new Student();
       return s;
    }

}
