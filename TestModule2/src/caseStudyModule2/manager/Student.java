package caseStudyModule2.manager;

public class Student {
    private String id;
    private String name;
    private String age;
    private String gender;
    private String phone;
    private String mail;
    private String address;
    private String pointAVG;

    public Student() {
    }

    public Student(String id, String name, String age, String gender, String phone, String mail, String address, String pointAVG) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.mail = mail;
        this.address = address;
        this.pointAVG = pointAVG;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPointAVG() {
        return pointAVG;
    }

    public void setPointAVG(String pointAVG) {
        this.pointAVG = pointAVG;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", mail='" + mail + '\'' +
                ", address='" + address + '\'' +
                ", pointAVG='" + pointAVG + '\'' +
                '}';
    }
    public String display(){
        return  id + ',' + name + ',' + age + ',' + gender + ',' + phone + ',' + mail + ',' + address + ',' + pointAVG;
    }
}
