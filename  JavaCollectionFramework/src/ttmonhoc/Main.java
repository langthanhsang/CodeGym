package ttmonhoc;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject("1","math","sang",1,1,3);

        System.out.println(subject);
        subject.setSubjectName("hjyhdfhjhgfh");
        System.out.println(subject.getSubjectName());
    }
}
