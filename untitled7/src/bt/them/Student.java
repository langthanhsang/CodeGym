package bt.them;

public class Student {
    private static int VALUE = 1;
    private int id;
    private String name;
    private int age ;
    private String gender;
    private String address;
    private double avagePoint;

    public Student(String name1) {
    }

    public Student(String name, int age, String gender, String address, double avagePoint) {
        this.id = VALUE;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.avagePoint = avagePoint;
    }

    public static int getVALUE() {
        return VALUE;
    }

    public static void setVALUE(int VALUE) {
        Student.VALUE = VALUE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAvagePoint() {
        return avagePoint;
    }

    public void setAvagePoint(double avagePoint) {
        this.avagePoint = avagePoint;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", avagePoint=" + avagePoint +
                '}';
    }
}
