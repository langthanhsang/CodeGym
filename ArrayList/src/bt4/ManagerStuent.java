package bt4;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerStuent {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Student> students = new ArrayList<>();

    public Student createStudent() {
        System.out.println("nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("nhập tuổi: ");
        int age = scanner.nextInt();
        System.out.println("nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.println("nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("nhập điểm : ");
        double averagePoint = scanner.nextDouble();
        return new Student(name, age, gender, address, averagePoint);
    }

    public boolean addStuent(Student student) {
        return students.add(student);
    }

    public void deleteStudent(String name) {
        for (Student s : students) {
            if (s.getName().equals(name)) {
                students.remove(s);
            }
        }
    }

    public void updatebByName(String name, Scanner sc) {
        Student student = null;
        for (Student s : students) {
            student = s;
            if (student.getName().equals(name)) {
                System.out.println("nhập tuổi mói :");
                student.setAge(sc.nextInt());
                System.out.println("nhập gới tính mới :");
                student.setGender(sc.nextLine());
                System.out.println("nhập địa chỉ mới:");
                student.setAddress(sc.nextLine());
                System.out.println("nhập điểm mới");
                student.setAveragePoint(sc.nextDouble());

                Student student1 = new Student(s.getName(), s.getAge(), s.getGender(), s.getAddress(), s.getAveragePoint());
                students.set(Integer.parseInt(name), student1);
            }
        }

    }

    public void displayAll() {
        for (Student stundet : students) {
            System.out.println(stundet);
        }
    }

    public ArrayList<Student> hocSinhDiemTBtrenbayphaynam() {
        ArrayList<Student> Diem = new ArrayList<>();
        for (Student student : students) {
            if (student.getAveragePoint() > 7.5) {
                Diem.add(student);
            }
        }
        for (Student student: Diem) {
            System.out.println(student);
        }
        return Diem;
    }
    public void displayStudent() {
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getAveragePoint() >= 8) {
                System.out.println(students.get(i).getName() + " - " + students.get(i).getAveragePoint() + " - "+ "Loại Giỏi");
            } else if (students.get(i).getAveragePoint() < 8 && students.get(i).getAveragePoint() >= 6) {
                System.out.println(students.get(i).getName() + " - " + students.get(i).getAveragePoint() + " - "+ "Loại Khá");
            } else if (students.get(i).getAveragePoint() < 6 && students.get(i).getAveragePoint() >= 4.5) {
                System.out.println(students.get(i).getName() + " - " + students.get(i).getAveragePoint() + " - " + "Loại Trung Bình");
            } else if (students.get(i).getAveragePoint() < 4.5) {
                System.out.println(students.get(i).getName() + " - " + students.get(i).getAveragePoint() + " - " + "Loại Yếu");
            }
        }
    }

    
}
