package minitest;

import java.util.Arrays;
import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[3];
        Product product3 = new Product("a", "sizuki", 10, "band","usd");
        Product product1 = new Product("b", "hond", 10, "siconhand","usd");
        Product product2 = new Product("c", "yamaha", 10, "new","usd");
        products[0] = product3;
        products[1] = product1;
        products[2] = product2;
        for (Product product: products) {
            System.out.println(product);
        }
        System.out.println("nhập tên sp muốn tìm");
        String findName = scanner.nextLine();
        for (int i = 0; i < products.length; i++) {
            if(findName.equals(products[i].getName())) {
                System.out.println(products[i]);
            }
        }
        System.out.println(Arrays.toString(products));
//        System.out.println("tổng giá là" + Product.total);
    }

}
