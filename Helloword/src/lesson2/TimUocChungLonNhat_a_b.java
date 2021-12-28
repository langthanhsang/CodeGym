package lesson2;

import java.util.Scanner;

public class TimUocChungLonNhat_a_b {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a = sc.nextInt();
        System.out.println("Enter number b: ");
        int b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if(a == 0 || b == 0) {
            System.out.println("No grest common factor");
        }
        else {
            while ( a != b) {
                if( a > b)
                    a = a -b;
                else
                    b = b -a;
            }
            System.out.println("greatest common factor:" + a);
        }
    }
}
