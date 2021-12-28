package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class tn {
    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("nhập số lượng phần tử :");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("nhập vào phần tử thư " + i);
            number = scanner.nextInt();
            integerArrayList.add(number);
        }

        ArrayList<Integer>temp = new ArrayList<>();
        for (int i = 0; i < integerArrayList.size(); i++) {
            if(!temp.contains(integerArrayList.get(i))) {
                temp.add(integerArrayList.get(i));
            }
        }
        integerArrayList.clear();

        integerArrayList.addAll(temp);
        System.out.println(integerArrayList);
    }

}

