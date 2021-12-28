package th2;


import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("f");
        stringLinkedList.add("A");
        stringLinkedList.add("C");
        stringLinkedList.add("H");
        stringLinkedList.add("B");


        LinkedList<Integer> integerLinkedList = new LinkedList<>();

        integerLinkedList.add(1);
        integerLinkedList.add(8);
        integerLinkedList.add(0);
        integerLinkedList.add(32);
        integerLinkedList.add(3);
        integerLinkedList.add(12);
        integerLinkedList.set(2,1000000);

//        Collections.sort(stringLinkedList);
//        for (String str: stringLinkedList) {
//
//            System.out.println(str);
//        }

//        if(stringLinkedList.contains("two")) {
//            System.out.println("cos two");
//        }
//        else {
//            System.out.println("khong");
//        }
//        int firstIndex = stringLinkedList.indexOf("two");
//
//        System.out.println(firstIndex);

//        String str = stringLinkedList.get(2);
//        System.out.println(str);

//        int number = integerLinkedList.get(4);
//        System.out.println(number);

//        integerLinkedList.remove(2);
//
//
//        for (Integer integer: integerLinkedList) {
//            System.out.println(integer);
//        }
//
//        stringLinkedList.remove("two");
//        for (String string: stringLinkedList) {
//            System.out.println(string);
//        }
    }
}
