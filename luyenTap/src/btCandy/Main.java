package btCandy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerCandy managerCandy = new ManagerCandy();
        int choice;

        do {
            System.out.println("********menu********");
            System.out.println("1.hiển thị tất cả kẹo");
            System.out.println("2.thêm 1 viên kẹo");
            System.out.println("3.xoá 1 viên kẹo");
            System.out.println("4.sửa 1 viên kẹo");
            System.out.println("5.hiển thị 1 viên kẹo theo id");
            System.out.println("6.hiển thị tất cả các viên kẹo theo  màu");
            System.out.println("7.hiển thị màu muốn xoá");
            System.out.println("8.viên kẹo có đơn giá cao nhất");
            System.out.println("9. tổng giá thành của viên kẹo");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("tất cả các viên kẹo là:  ");
                    managerCandy.displayAll();
                    break;


                case 2:
                    System.out.println("thêm vào 1 viên  kẹo :");
                    managerCandy.addACandy();
                    break;

                case 3:
                    managerCandy.deleteACandyById(scanner);
                    break;

                case 4:
                    System.out.println("nhập id muốn sửa");
                    int id = scanner.nextInt();
                    managerCandy.editACandyById(id, scanner);
                    break;

                case 5:
                    System.out.println("nhâp id viên kẹo mà bạn muốn hiển thị: ");
                    managerCandy.searchCandyById();
                    break;

                case 6:
                    System.out.println("nhập màu viên kẹo bạn muốn hiển thi: ");
                    managerCandy.displayCandyByColor();
                    break;

                case 7:
                    System.out.println("nhập màu muốn xoá: ");
                    managerCandy.deleteByColor();
                    break;
                case 8:
                    System.out.println("viên kẹo có đơn giá cao nhất là: ");
                    managerCandy.findMaxCandy();
                    break;
                case 9:
                    System.out.println("tồn giá cửa tất cả viên kẹo");
                    managerCandy.totalPrice();
                    break;


            }

        } while (choice != 0);
    }
}
