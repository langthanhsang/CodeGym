package lesson2;

import java.util.Scanner;

public class checkSNT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhâp n = ");
        int num = sc.nextInt();
        int count = 0;
        int N = 2;
        while (count < num) {
            boolean check = true;
            for (int j = 2; j < N; j++) {
                if (N % j == 0) {
                    check = false;
                    break;
                }
            }

            if (check) {
                System.out.println(N + " ");
                count++;
            }
            N++;
        }
    }
}
