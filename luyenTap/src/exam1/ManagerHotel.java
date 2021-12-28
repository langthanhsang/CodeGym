package exam1;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerHotel {
    ArrayList<Hotel> hotels = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addInfor() {
        System.out.println("nhập họ và tên");
        String fullName = scanner.nextLine();
        System.out.println("nhâp ngay sinh: ");
        int birthday = scanner.nextInt();
        System.out.println("nhập số cmnd: ");
        int id = scanner.nextInt();
        Customer customer = new Customer(fullName,birthday, id );
        System.out.println("nhập số ngày trọ: ");
        int numberOfday = scanner.nextInt();
        System.out.println("nhập loại phòng : ");
        String type = scanner.nextLine();
        scanner.nextLine();
        System.out.println("nhập giá phòng : ");
        int price = scanner.nextInt();
      Hotel hotel = new Hotel(customer, numberOfday, type,price);
      hotels.add(hotel);

    }

    public void displayInfor() {
        for (Hotel hotel: hotels) {
            System.out.println(hotel);
        }
    }
    public void deleteInfor() {
        int id = scanner.nextInt();
        for (int i = 0; i < hotels.size(); i++) {

        }
    }

 }
