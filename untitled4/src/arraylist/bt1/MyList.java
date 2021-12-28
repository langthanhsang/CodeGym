package arraylist.bt1;

import java.util.Arrays;

public class MyList <E>{
    private int size;
    private static final int DEFAULT_CAPACCITY = 10;
    private E[] data = (E[]) new Object[DEFAULT_CAPACCITY];
    private Object elements[];
    public  MyList() {
        elements = new Object[DEFAULT_CAPACCITY];

    }
//
//    public MyList(int capacity) {
//        elements = new Object[capacity];
//    }
//
//    private void ensureCapa() {
//        int newSize = elements.length*2;
//        elements = Arrays.copyOf(elements,newSize);
//    }
//
//    public void add(E e){
//        if(size == elements.length) {
//          ensureCapa();
//        }
//        elements[size++] = e;
//    }
//
//    public void checkIndex (int index) {
//        if( index < 0 || index >= size) {
//            throw new IndexOutOfBoundsException("index" + i)
//        }
//    }
//    public E remove(int index) {
//        CheckIndex(index);
//    }

}
