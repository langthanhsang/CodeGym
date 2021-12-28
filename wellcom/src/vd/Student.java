package vd;

public class Student {
    private  String name ;
    private  String id;
    private  String email;
    private int age ;
    private float mark;
    private boolean isMarried;
    public Student(String id) {
        this.id = id;
        this.showM();
    }

    public Student(String name, String id) {
        this(id);
        this.name = name;
    }

    public Student(String name, String id, String email) {
        this(name,id);
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public void showM() {
       TestStudent.showStudentInfo(this);
    }
    public Student getCuurentStudent() {
        return this;
    }

}
