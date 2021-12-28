package exam1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerHotel managerHotel = new ManagerHotel();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.nhập thông tin khách hàng :");
            System.out.println("2.hiển thị tất cả thông tin khách hàng: ");
            System.out.println("3.xoá thông tin 1 khác hàng");
            System.out.println("4.khách hàng cần tính tiền : ");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("nhập thông tin khách hàng :");
                    managerHotel.addInfor();
                    break;
                case 2:
                    System.out.println("hiển thị tất cả thông tin khách hàng: ");
                    managerHotel.displayInfor();
                    break;
                case 3:
                    System.out.println("nhập id khác hàng muốn xoá : ");
                    managerHotel.deleteInfor();
                    break;
            }

        } while (choice != 0);
    }
}
