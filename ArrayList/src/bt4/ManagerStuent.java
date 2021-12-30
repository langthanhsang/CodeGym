package bt4;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerStuent {
public static final String PATH_NAME = "/Volumes/WorkSpace/Codegym/ArrayList/src/bt4/students.csv";
    Scanner scanner = new Scanner(System.in);
    ArrayList<Student> students = new ArrayList<>();

    public void studentManager(){
    }
    public ManagerStuent(){
        this.students = readFile(PATH_NAME);
    }

    private ArrayList<Student> readFile(String pathName) {
        return students;
    }

    public void createStudent(Scanner scanner) {
        scanner.nextLine();
        System.out.println("nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("nhập tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.println("nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("nhập điểm : ");
        double averagePoint = scanner.nextDouble();
        scanner.nextLine();
        Human student = new Student(name,age,gender,address,averagePoint);
        students.add((Student)student);
    }


    public Student deleteStudent(String name) {
        Student student = null;
        for (Student s : students) {
            if (s.getName().equals(name)) {
                student = s;
            }
        }
        if(student != null) {
            students.remove(student);
        }
        return student;
    }

    public void updatebByName(Scanner sc) {
        Student student = null;
        String name = scanner.nextLine();
        for (Student studentUpdate : students) {

            if (student.getName().equals(name)) {
                studentUpdate = student;
                scanner.nextLine();
                System.out.println("nhập tuổi mói :");
                studentUpdate.setAge(sc.nextInt());

                scanner.nextLine();
                System.out.println("nhập gới tính mới :");
                studentUpdate.setGender(sc.nextLine());

                System.out.println("nhập địa chỉ mới:");
                studentUpdate.setAddress(sc.nextLine());

                System.out.println("nhập điểm mới");
                studentUpdate.setAveragePoint(sc.nextDouble());


            }
        }

    }

    public void displayAll() {
        for (Student stundent : students) {
            System.out.println(stundent);
        }
    }

    public ArrayList<Student> hocSinhDiemTBtrenbayphaynam() {
        ArrayList<Student> Diem = new ArrayList<>();
        for (Student student : students) {
            if (student.getAveragePoint() > 7.5) {
                Diem.add(student);
            }
        }
        for (Student student : Diem) {
            System.out.println(student);
        }
        return Diem;
    }

    public void displayStudentBXH() {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAveragePoint() >= 8) {
                System.out.println(students.get(i).getName() + " - " + students.get(i).getAveragePoint() + " - " + "Loại Giỏi");
            } else if (students.get(i).getAveragePoint() < 8 && students.get(i).getAveragePoint() >= 6) {
                System.out.println(students.get(i).getName() + " - " + students.get(i).getAveragePoint() + " - " + "Loại Khá");
            } else if (students.get(i).getAveragePoint() < 6 && students.get(i).getAveragePoint() >= 4.5) {
                System.out.println(students.get(i).getName() + " - " + students.get(i).getAveragePoint() + " - " + "Loại Trung Bình");
            } else if (students.get(i).getAveragePoint() < 4.5) {
                System.out.println(students.get(i).getName() + " - " + students.get(i).getAveragePoint() + " - " + "Loại Yếu");
            }
        }
    }

    public void writeListStudent(ArrayList<String> nameList, String PathName) throws IOException {
        Writer out;
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PathName));
        for (String string : nameList) {
            bufferedWriter.write(string + "\n");
        }
        bufferedWriter.close();
    }

    public void readStudent(String pathName) throws IOException {
        File file;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(pathName));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }

    public ArrayList<String> nameList() {
        ArrayList<String> strings = new ArrayList<>();
        for (Student student : students) {
            strings.add(student.getName());
        }
        return strings;
    }
}
