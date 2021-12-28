package th;

public class selectionSort {
    static int[]array = {2,5,1,6,8,9,53,1,8,};
    public static void selectionSort(int[]array) {
        int min;
        for (int i = 0; i < array.length -1 ; i++) {
            min = i;
            for (int j = i + 1;  j < array.length ; j++) {
                if(array[j] < array[min]) {
                    min= j;
                    if(min != i){
                        int temp = array[i];
                        array[min] = array[i];
                        array[i] = temp;
                    }
                }

            }
        }
    }

    public static void main(String[] args) {

        selectionSort(array);
        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i] + " ");

        }
    }
}
