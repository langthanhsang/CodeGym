package th4;

import java.util.*;

public class th4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> stringList = new ArrayList<>();
        stringList.add("monday");
        stringList.add("twoday");
        stringList.add("wednesday");
        stringList.add("thusday");
        stringList.add("friday");
        stringList.add("sturdday");
        stringList.add("sunday");
        Iterator<String> iterator = stringList.iterator();

        System.out.println("hiển thị phần thử sủ dụng iterat");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//        System.out.println("hiển thị tứ dưới lên");
//        while (iterator.h) {
//            System.out.println(iterator.);
//        }
        ListIterator<String> str = null;
        str = (ListIterator<String>) iterator;
        System.out.println(str.hasPrevious());
    }

}
