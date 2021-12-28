package Ptb2;

public class QuadraticEquation {
    double a,b,c;
    public QuadraticEquation (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double delta() {
        return this.b*2- 4*this.a*this.c;
    }
    public double getRoot1() {
        return (-b + Math.pow(this.delta(),0.5))/2*this.a;
    }
    public double getRoot2() {
        return (-b - Math.pow(this.delta(),0.5))/2*this.a;
    }

}
