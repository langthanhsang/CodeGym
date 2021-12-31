package minitest5;

import java.io.Serializable;

public class Student extends Human  {
    private double math;
    private double phy;
    private double che;

    public Student() {
    }

    public Student(double math, double phy, double che) {
        this.math = math;
        this.phy = phy;
        this.che = che;
    }

    public Student(String name, int age, double math, double phy, double che) {
        super(name, age);
        this.math = math;
        this.phy = phy;
        this.che = che;
    }
    public double avg(){
       return  (math + phy + che)/3;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhy() {
        return phy;
    }

    public void setPhy(double phy) {
        this.phy = phy;
    }

    public double getChe() {
        return che;
    }

    public void setChe(double che) {
        this.che = che;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "math=" + math +
                ", phy=" + phy +
                ", che=" + che +
                '}';
    }
}
