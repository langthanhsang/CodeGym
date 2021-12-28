package sv;

public class Subject {
    private  String id;
    private  String teacher;
    private String SubjectName;
    private  int lesson;
    private int numberOfTest;
    private int amountofInfo;

    public Subject () {
    }

    public Subject(String id, String teacher, String subjectName, int lesson, int numberOfTest, int amountofInfo) {
        this.id = id;
        this.teacher = teacher;
        SubjectName = subjectName;
        this.lesson = lesson;
        this.numberOfTest = numberOfTest;
        this.amountofInfo = amountofInfo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String subjectName) {
        SubjectName = subjectName;
    }

    public int getLesson() {
        return lesson;
    }

    public void setLesson(int lesson) {
        this.lesson = lesson;
    }

    public int getNumberOfTest() {
        return numberOfTest;
    }

    public void setNumberOfTest(int numberOfTest) {
        this.numberOfTest = numberOfTest;
    }

    public int getAmountofInfo() {
        return amountofInfo;
    }

    public void setAmountofInfo(int amountofInfo) {
        this.amountofInfo = amountofInfo;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id='" + id + '\'' +
                ", teacher='" + teacher + '\'' +
                ", SubjectName='" + SubjectName + '\'' +
                ", lesson='" + lesson + '\'' +
                ", numberOfTest=" + numberOfTest +
                ", amountofInfo=" + amountofInfo +
                '}';
    }
}
