package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class tinhtong {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int number, sum = 0;
        System.out.println("nhập số lượng phần tử");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("nhập phàn tử thứ " + i);
            number = scanner.nextInt();
            arrayList.add(number);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
        }

        System.out.println(sum);
    }
}

