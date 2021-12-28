package lesson2;

import java.util.Scanner;

public class HienThi20SoNTDauTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int N = 2;
        int num = sc.nextInt();
        while (count < num) {
            boolean check = true;
            for (int i = 2; i < num; i++) {
                if( N % i == 0) {
                  check = false;
                  break;
                }
            }
            if(check) {
                System.out.println(N);
                check = true;
                count++;
            }
           N++;
        }

    }
}


