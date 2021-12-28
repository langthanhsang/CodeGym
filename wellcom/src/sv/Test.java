package sv;

public class Test {
    public static void main(String[] args) {
      Subject math = new Subject("M001","sang", "math", 4,4,4);
        System.out.println("so tin chi " + math.getAmountofInfo());
        System.out.println(math);
    }
}
