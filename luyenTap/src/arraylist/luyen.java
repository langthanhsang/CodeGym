package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class luyen {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số lương phần tủ :");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("nhập vào số phần tủ thứ " + i + ":");
            int number = scanner.nextInt();
            integerArrayList.add(number);
        }
        for (Number abc:integerArrayList) {
            System.out.println(abc);
        }
        int max = integerArrayList.get(0);
        for (int i = 0; i < integerArrayList.size(); i++) {
            if(max < integerArrayList.get(i)) {
                max = integerArrayList.get(i);
            }
        }
        System.out.println("giá trị lớn nhất là :" + max);

    }
}
