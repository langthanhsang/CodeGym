package vd;

public class Overloading {
    int a;
    int b;
    int c;
    int d;
    public static int total( int a, int b) {
        return a + b;
    }
    public static int total(int a, short b ) {
        return a + b;
    }
    public static float total(float a, float b) {
        return  a + b;
    }
    public static double total(double a, double b) {
        return a + b;

    }
    public static void main(String[] args) {
        int sumInt =total(100,200);
        double sumDouble = total(2.0,3.4);
        System.out.println(sumInt + "   " + sumDouble);

    }

}
