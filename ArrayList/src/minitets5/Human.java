package minitets5;

public class Human {
    public static int VALUE;
    private int  id;
    private String name;
    private int age;

    public Human() {
    }

    public Human( String name, int age) {
        this.id = VALUE;
        this.name = name;
        this.age = age;
    }

    public static int getVALUE() {
        return VALUE;
    }

    public static void setVALUE(int VALUE) {
        Human.VALUE = VALUE;
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

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
