package bt4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       ManagerStuent managerStuent = new ManagerStuent();
       Scanner scanner = new Scanner(System.in);
       int choice;
       do {
           System.out.println("********MENU***********");
           System.out.println("1.thêm sinh viên: ");
           System.out.println("2.xoá sinh viên theo tên: ");
           System.out.println("3.sửa sinh viên theo tên: ");
           System.out.println("4.hiển thị tất cả sinh viên: ");
           System.out.println("5.hiển thị tất cả sinh viên có dtb trên 7.5");
           System.out.println("6. hiển thị tất cả sinh viên theo cứ pháp");
           System.out.println("nhập sự lựa chon của bạn ");
           choice = scanner.nextInt();
           switch (choice){
               case 1:
                   System.out.println("1.thêm sinh viên: ");
                   break;
               case 2:
                   System.out.println("2.xoá sinh viên theo tên: ");
                   break;
               case 3:
                   System.out.println("3.sửa sinh viên theo tên: ");
                   break;
               case 4:
                   System.out.println("4.hiển thị tất cả sinh viên: ");
                   break;
               case 5:
                   System.out.println("5.hiển thị tất cả sinh viên có dtb trên 7.5");
                   break;
               case 6:
                   System.out.println("6. hiển thị tất cả sinh viên theo cứ pháp");
                   break;
               case 7:
               case 8:
               case 9:


           }


       }while (choice!=0);

    }
}
