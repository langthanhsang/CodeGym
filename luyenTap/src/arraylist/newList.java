package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class newList {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("nhập số lượng phàn tử :");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("nhập số lương phần tủ :");
            number = scanner.nextInt();
            list.add(number);

        }

        ArrayList<Integer>list1 = new ArrayList<>();
        for(int str : list) {
            if(!list1.contains(str)) {
                list1.add(str);
            }
        }
        System.out.println(list);
        System.out.println(list1);
        }

    }



