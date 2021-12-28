package thsinhvien;

public class Main {
    public static void main(String[] args) {
        Student nam = new Student("sdsv", "name", "lang son", "langthanhsangls@gmail.com", "353509230920");
        nam.payFee("math", 2575337);
        nam.doHomeWork("math");
        nam.doFinalTest("math");
        System.out.println(nam);
        nam.setId("1");
        System.out.println(nam);
    }
}
