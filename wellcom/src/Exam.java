import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        int arr[];
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        Random random = new Random();
        arr = new int[n];
        int count = 0;
        while (count < n) {
            arr[count++] = random.nextInt();
        }
        int [] brr = new int[n];
        int bSize = 0;
        boolean isExit = false;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < count; j++) {
               if( arr[i] == brr[j]){
                  isExit = true;
                  break;
               }
            }
            if (!isExit) {
                brr[bSize++] = arr[i];
            }
        }
        System.out.println("truoc khi sap xe");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(brr);
        System.out.println("sau khi sap xep");
        System.out.println(Arrays.toString(arr));

        System.out.println("phan tu xuat hien duy nhat");
        System.out.println(Arrays.toString(brr));
    }
}
