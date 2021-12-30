package bt4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       ManagerStuent managerStuent = new ManagerStuent();
       Scanner scanner = new Scanner(System.in);
       int choice;
       do {
           System.out.println("❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖MENU❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖");
           System.out.println("1.thêm sinh viên: ");
           System.out.println("2.xoá sinh viên theo tên: ");
           System.out.println("3.sửa sinh viên theo tên: ");
           System.out.println("4.hiển thị tất cả sinh viên: ");
           System.out.println("5.hiển thị tất cả sinh viên có dtb trên 7.5");
           System.out.println("6. hiển thị tất cả sinh viên theo cứ pháp");
           System.out.println("nghi file xuông: ");
           System.out.println("đọc file lên");
           System.out.println("nhập sự lựa chon của bạn ");
           choice = scanner.nextInt();
           switch (choice){
               case 1:
                   System.out.println("1.thêm sinh viên: ");
                   managerStuent.createStudent(scanner);
                   break;
               case 2:
                   System.out.println("2.xoá sinh viên theo tên: ");
                   String name = scanner.nextLine();
                  managerStuent.deleteStudent(name);
                   break;
               case 3:
                   System.out.println("3.sửa sinh viên theo tên: ");
                   managerStuent.updatebByName(scanner);
                   break;
               case 4:
                   System.out.println("4.hiển thị tất cả sinh viên: ");
                   managerStuent.displayAll();
                   break;
               case 5:
                   System.out.println("5.hiển thị tất cả sinh viên có dtb trên 7.5");
                   managerStuent.hocSinhDiemTBtrenbayphaynam();
                   break;
               case 6:
                   System.out.println("6. hiển thị tất cả sinh viên theo cứ pháp");
                   managerStuent.displayStudentBXH();
                   break;
               case 7:
                   try {
                       ArrayList<String> strings = managerStuent.nameList();
                       managerStuent.writeListStudent(strings,"/Volumes/WorkSpace/Codegym/ArrayList/src/bt4/student.text");
                       System.out.println("Write is successfully!");
                   } catch (IOException e) {
                       e.printStackTrace();
                   }
                   break;
               case 8:
                   try{
                       System.out.println("read file successfully");
                       managerStuent.readStudent("/Volumes/WorkSpace/Codegym/ArrayList/src/bt4/student.text");
                   } catch (IOException e) {
                       e.printStackTrace();
                   }
                   break;

           }
       }while (choice!=0);

    }
}
