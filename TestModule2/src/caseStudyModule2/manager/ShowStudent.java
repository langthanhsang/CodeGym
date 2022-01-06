package caseStudyModule2.manager;

import java.util.Scanner;

public class ShowStudent {
    static Scanner scanner = new Scanner(System.in);

    public static void show() {
        System.out.println("********************************************************");
        System.out.println("*                         MENU                          *");
        System.out.println("* 1. hiển thị toàn bộ danh sách!                        *");
        System.out.println("* 2. hiển thị học sinh giỏi !                           *");
        System.out.println("* 3. hiển thị học sinh khá                              *");
        System.out.println("* 4. hiển thị học sinh trung bình                       *");
        System.out.println("* 0. thoát!                                             *");
        System.out.println("* mời bạn chon!                                         * ");
        System.out.println("*********************************************************");
        int choice = Integer.parseInt(scanner.nextLine());
        if(choice == 0){
            return;
        }
        switch (choice){
            case 1:
                StudentManager.displayAll();
                break;
            case 2:
                StudentManager.displayHSG();
                break;
            case 3:
                StudentManager.displayHSk();
                break;
            case 4:
                StudentManager.displayHSKe();
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("vui lòng nhập đúng!");
        }
    }
}
