package minitest;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("nhập số lượng sản phẩm" + "");
        int n = input.nextInt();
        Product[] productList = new Product[n];
        for (int i = 0; i < productList.length; i++) {

            System.out.println("nhập mã sản phẩm ");
            System.out.println("Nhập mã:");
            String id = input.nextLine();
            input.nextLine();
            System.out.println("Nhap name");
            String name = input.nextLine();
            System.out.println("Nhập giá");
            double price = input.nextDouble();
            input.nextLine();
            System.out.println("Nhập loại");
            String type = input.nextLine();
            System.out.println("Nhập loại tiền");
            String usd = input.nextLine();
     productList[i] = new Product(id,name,price,type,usd);
        }
        for (Product product : productList) {
            System.out.println(product);
        }

    }
}
