package lesson2;

public class HienThiSoNTnhoHon100 {
    public static void main(String[] args) {
      int N = 2;
      boolean check = true;
      while (N < 100) {
          for (int i = 2; i < N; i++) {
              if( N % i == 0) {
                  check = false;
                  break;
              }
          }
          if(check) {
              System.out.println(N);
          }
          check = true;
          N++;
      }
    }
}
