package student;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String address;
    private String gender;
    private  float point;

    public Student() {
    }

    public Student(String name, int age, String address, String gender, float point) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }


    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên");
        name = scanner.nextLine();
        System.out.println("nhập tuổi");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập đia chỉ");
        address = scanner.nextLine();
        System.out.println("nhập giới tính");
        gender = scanner.nextLine();
        System.out.println("nhập điểm");
        point = scanner.nextFloat();

    }


    public void displayAllStudent() {
        System.out.println("ten" + name + "tuoi" + address + "gioi tinh" + gender +"diem" + point) ;
    }

    public void displayStudent() {
    }
}
