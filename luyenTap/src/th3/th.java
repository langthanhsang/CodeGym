package th3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class th {
    public static void main(String[] args) {



        List<Integer>integerList =new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerList.add(i);
        }
        System.out.println(integerList);
        Collections.shuffle(integerList);
        System.out.println(integerList);
        Collections.shuffle(integerList);
        System.out.println(integerList);

//        ArrayList<String> listsource = new ArrayList<>();
//        listsource.add("A");
//        listsource.add("B");
//        listsource.add("C");
////        listsource.add("D");
////        listsource.add("E");
//
//        List<String>listSource1 = new ArrayList<>();
//
//        listSource1.add("F");
//        listSource1.add("G");
//        listSource1.add("H");
//        listSource1.add("T");
//
//        Collections.copy(listSource1,listsource);
//
//        for (String str: listSource1) {
//            System.out.println(str);
//        }
    }
}
