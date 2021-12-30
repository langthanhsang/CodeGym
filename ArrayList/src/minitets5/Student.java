package minitets5;

import java.io.Serializable;

public class Student extends Human implements Serializable {
    private int math;
    private int phy;
    private int chemical;



    public Student() {
        this.math = math;
        this.phy = phy;
        this.chemical = chemical;
    }

    public Student(String name, int age, int math, int phy, int chemical) {
        super(name, age);
        this.math = math;
        this.phy = phy;
        this.chemical = chemical;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getPhy() {
        return phy;
    }

    public void setPhy(int phy) {
        this.phy = phy;
    }

    public int getChemical() {
        return chemical;
    }

    public void setChemical(int chemical) {
        this.chemical = chemical;
    }
    public int avgPoint(){

        return math + phy + chemical;
    }

    @Override
    public String toString() {
        return "Student{" +super.toString()+
                "math=" + math +
                ", phy=" + phy +
                ", chemical=" + chemical +
                '}';
    }
}
