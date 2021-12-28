package lesson2;

import java.util.Scanner;

public  class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;

        while (choice != 0) {
            Scanner menu = new Scanner(System.in);
            System.out.println("nhap chieu cao");
            int height = menu.nextInt();
            System.out.println("nhap chieu rong");
            int width = menu.nextInt();
            System.out.println("menu");
            System.out.println("1. hinh chu nhat :");
            System.out.println("2. hinh tam giac vuong : ");
            System.out.println("3. tam giac vuong : ");
            System.out.println("Exit");
            System.out.println("Enter your choice");
            choice = menu.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 1; i < height; i++) {
                        for( int j = 1; j < width ; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    for (int i = height; i >= 1; i--) {

                        for( int j = 1; j < i; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    for (int i = 0; i <= height; i++) {
                       for( int j = 1; j <= i; j++) {
                           System.out.print("*");
                       }
                        System.out.println(" ");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
