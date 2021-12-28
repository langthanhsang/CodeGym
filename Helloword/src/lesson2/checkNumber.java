package lesson2;

import java.util.Scanner;

public class checkNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println(number + " is not prime");

        } else{
                int i = 2;
                boolean check = true;
                while (i <= Math.sqrt(number)) {
                    if (number % i == 0) {
                        check = false;
                        break;
                    }
                    i++;
                }
            if (check)
                System.out.println(number + " is prime");
            else
                System.out.println(number + " is not prime");
            }
        }
    }

