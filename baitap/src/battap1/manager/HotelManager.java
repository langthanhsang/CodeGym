package battap1.manager;

import battap1.model.Hotel;
import battap1.model.Human;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class HotelManager {

    Scanner scanner = new Scanner(System.in);
    ArrayList<Hotel> hotels = new ArrayList<>();

    public Hotel creatHotel(Human human) {
        System.out.println("nhập vào ngày bắt đầu trọ :");
        String date = scanner.nextLine();
        LocalDate startDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-ll-yyyy"));
        System.out.println("nhập vào loai phòng : ");
        String kind = scanner.nextLine();
        System.out.println("nhập vào giá phong : ");
        double price = scanner.nextDouble();
        Hotel hotel = new Hotel(startDate, kind, price, human);
        hotels.add(hotel);
        return hotel;
    }

    public void displayRooTenants() {
        HashSet<Human> humanHashSet = new HashSet<>();
        for (Hotel hotel : hotels) {
            humanHashSet.add(hotel.getHuman());
        }
        System.out.println(humanHashSet);

    }

    public void displayRoomOfHuman(String idCard) {

        for (Hotel hotel : hotels) {
            if (hotel.getHuman().getIdCard().equals(idCard)) {
                System.out.println(hotel);
            }
        }
    }

    public double payforRoom(String idCard) {
        ArrayList<Hotel> hotelPay = new ArrayList<>();
        double sumPrice = 0;
        for (Hotel hotel: hotels) {
          if( hotel.getHuman().getIdCard().equals(idCard)) {
              sumPrice += hotel.getPrice()* (LocalDate.now().getYear() - hotel.getStartDate().getYear());
              hotelPay.add(hotel);
          }
        }
        hotels.removeAll(hotelPay);
        return sumPrice;
    }
}
