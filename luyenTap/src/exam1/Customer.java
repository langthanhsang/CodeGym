package exam1;

public class Customer {
    private String fullName;
    private int birthday;
    private int id;


    public Customer(String fullName, int birthday, int id, int numberOfday, String type, int price) {
    }

    public Customer(String fullName, int birthday, int id) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.id = id;

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "fullName='" + fullName + '\'' +
                ", birthday=" + birthday +
                ", id=" + id +
                '}';
    }
}
