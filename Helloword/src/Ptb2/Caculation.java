package Ptb2;

import java.util.Scanner;

public class Caculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A,B,C");
        double numberA = scanner.nextDouble();
        double numberB = scanner.nextDouble();
        double numberC = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(numberA,numberB,numberC);
        if(quadraticEquation.delta() > 0) {
            System.out.println(" pt có hai ngiệm phân biệt" + quadraticEquation.getRoot1() +"; " + quadraticEquation.getRoot2());
        }
        else if(quadraticEquation.delta() == 0) {
            System.out.println("pt có 1ngiêm kép" + quadraticEquation.getRoot2() );
        }
        else {
            System.out.println("The equation has no roots");
        }
    }
}
