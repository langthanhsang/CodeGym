package caseStudyModule2.manager;

import java.util.Scanner;

public class SortStudent {
   static Scanner scanner = new Scanner(System.in);
    public static void sort(){
        while ( true ){
            System.out.println("*************************************************");
            System.out.println("*                  MENU                          *");
            System.out.println("*  1. sắp xếp theo tên                           *");
            System.out.println("*  2. sắp sếp theo điểm trung bình               *");
            System.out.println("*  3. sắp xếp theo tuổi                          *");
            System.out.println("*  0. thoát                                      *");
            System.out.println("* mời bạn chon                                   *");
            System.out.println("***************************************************");
            int choice = Integer.parseInt(scanner.nextLine());
            if(choice == 0){
                return;
            }
            switch (choice){
                case 1:
                    StudentManager.sortByname();
                case 2:
                    StudentManager.sortByAvg();
                case 3:
                    StudentManager.sortByAge();
                case 0:
                    System.exit(0);
                default:
                    System.out.println("nhập cho chuẩn");
            }
        }
    }
}
