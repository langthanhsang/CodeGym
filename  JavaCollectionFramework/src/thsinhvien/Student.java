package thsinhvien;

import java.util.Locale;

public class Student {
    private String id;
    private String fullName;
    private String address;
    private String email;
    private String phone;

    public Student() {
    }

    public Student(String id, String fullName, String address, String email, String phone) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void gotoScchool() {
        System.out.println("i am going to school");
    }

    public void doHomeWork(String subject) {
        System.out.println("i doing my" + subject + " home work");
    }

    public void payFee(String subject, float amout) {
        System.out.println("pay fee for" + amout + ",fee: " + amout);
    }

    public boolean doFinalTest(String subject) {
        if (subject != null && subject.toLowerCase().compareTo("math") == 0) {
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
