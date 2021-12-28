package btCandy;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerCandy {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Candy> candies = new ArrayList<>();


    public void displayAll() {
        System.out.println(candies);
    }

    public void addACandy() {
        System.out.println("nhập màu : ");
        String color = scanner.nextLine();
        System.out.println("nhập tính chất");
        String property = scanner.nextLine();
        System.out.println("nhập số lượng :");
        int amount = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập giá: ");
        int price = scanner.nextInt();
        scanner.nextLine();
        Candy candy = new Candy(color, property, amount, price);
        candies.add(candy);

    }
//    public void deleteById(Scanner sc){
//        int id = sc.nextInt();
//        candies.removeIf(candy -> candy.getId()== id);
//
//    }

    public void deleteACandyById(Scanner sc) {
        System.out.println("nhập id muốn xoá :");
        int id = sc.nextInt();
//        for (Candy candy: candies) {
//            if (id == candy.getId()) {
//                candies.remove(candy);
//            }
//        }
        for (int i = 0; i < candies.size(); i++) {
            if (id == candies.get(i).getId()) {
                candies.remove(candies.get(i));
            }
        }

    }

    public void deleteByColor() {
        String color =scanner.nextLine();
        for (int i = 0; i < candies.size(); i++) {
            if (candies.get(i).getColor().equals(color)){
                candies.remove(i);
            }
        }
    }

    public void editACandyById(int id, Scanner scanner1) {

        Candy candyedit = null;
        for (Candy candy : candies) {
            candyedit = candy;
            if (id == candy.getId()) {
                System.out.println("nhập màu sắc : ");
                candyedit.setColor(scanner.nextLine());
                System.out.println("nhập tính chất mới: ");
                candyedit.setProperty(scanner.nextLine());
                System.out.println("nhập số lượng mới");
                candyedit.setAmount(scanner.nextInt());
                System.out.println("nhập giá mới : ");
                candyedit.setPrice(scanner.nextInt());

            }

        }

    }

    public void displayCandyByColor() {
        ArrayList<Candy>candy = new ArrayList<>();
        String color = scanner.nextLine();
        for (Candy c: candies) {
           if (c.getColor().equals(color)) {
               candy.add(c);
           }
        }
        System.out.println(candy);

    }

    public void searchCandyById() {
        int id = scanner.nextInt();
        for (Candy candy : candies) {
            if (candy.getId() == id) {
                System.out.println(candy);
            }

        }
    }

    public void findMaxCandy() {
        int max = candies.get(0).getPrice();
        for (Candy candy : candies) {
            if (candy.getPrice() > max) {
                max = candy.getPrice();

            }
        }
        System.out.println("viên kẹo có giá cao nhất là: " + max);

    }

    public void totalPrice() {
        int total = 0;
        for (Candy candy : candies) {
            total = total + (candy.getPrice() * candy.getAmount());

        }
        System.out.println("tổng giá là:" + total);
    }
}
