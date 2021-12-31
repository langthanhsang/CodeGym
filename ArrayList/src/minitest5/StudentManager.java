package minitest5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManager {
    public static final String PATH_NAME = "/Volumes/WorkSpace/Codegym/ArrayList/src/minitest5/saveFile.csv";
    private ArrayList<Student> students = new ArrayList<>();

public StudentManager(){
    this.students = readFile(PATH_NAME);
}
    public ArrayList<Student> getStudents() {
        return students;
    }

    public void createStudent(Scanner scanner) {
        scanner.nextLine();
        System.out.println("nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("nhập tuổi");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập điểm toán:");
        double math = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("nhập đểm lý: ");
        double phy = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("nhập điểm hoá: ");
        double che = scanner.nextDouble();
        Human student = new Student(name, age, math, phy, che);
        students.add((Student) student);
        writeToFile(PATH_NAME);


    }



    public void displayAll() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void displaySearchById(int id) {
        System.out.println("nhập id bạn muốn tìm: ");
        for (Student student : students) {
            if (id == student.getId()) {
                System.out.println(student);
            }
        }
    }

    public void deleteById(Scanner scanner) {

        System.out.println("nhập id bạn muốn xoá: ");
        int id = scanner.nextInt();
        Student studentDelete = null;
        for (Student student : students) {
            if (id == student.getId()) {
                studentDelete = student;
            }
        }
        if (students != null) {
            students.remove(studentDelete);
            writeToFile(PATH_NAME);
        }

    }
    public void searById(Scanner scanner) {
        System.out.println("nhập id muốn tìm: ");
        int id = scanner.nextInt();
        for (Student student: students) {
            if (id == student.getId()){
                System.out.println(student);
            }
        }
    }

    public void editStudentById(Scanner scanner) {
        System.out.println("nhập id muốn sửa: ");
        Student studentEdit = null;
        int id = scanner.nextInt();
        for (Student student : students) {
            if (id == student.getId()) {
                studentEdit = student;
                System.out.println("nhâp tên mới");
                studentEdit.setName(scanner.nextLine());
                scanner.nextLine();
                System.out.println("nhập tuổi mới: ");
                studentEdit.setMath(scanner.nextDouble());
                scanner.nextLine();
                System.out.println("nhập điểm toán mới: ");
                studentEdit.setMath(scanner.nextDouble());
                System.out.println("nhập điểm lý mới: ");
                studentEdit.setPhy(scanner.nextDouble());
                System.out.println("nhập điểm hoá mới: ");
                studentEdit.setChe(scanner.nextDouble());
                writeToFile(PATH_NAME);
            }
        }

    }

    public void sortByAvgPointIncrease() {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.avg() > o2.avg()) {
                    return 1;
                } else if (o1.avg() < o2.avg()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        displayAll();
    }

    public void sortByAvgPointdecrease() {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.avg() < o2.avg()) {
                    return 1;
                } else if (o1.avg() > o2.avg()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        displayAll();
    }

    public void getMaxPoint() {
        double max = students.get(0).getAge();
        for (Student student : students) {
            if (max < student.avg()) {
                max = student.avg();
                System.out.println(student);
            }
        }
    }

    public void writeToFile(String PATH_NAME)  {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(PATH_NAME));
            for (Student student : students) {
                bw.write(student.getName() + "," + student.getAge() + "," + student.getMath() + "," + student.getPhy() + "," + student.getChe() + "\n");
            }
            bw.flush();
            bw.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());

        }

    }

    public ArrayList<Student> readFile(String path) {
        ArrayList<Student> students = new ArrayList<>();
        File file = new File(PATH_NAME);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] strings = line.split(",");
                students.add(new Student(strings[0], Integer.parseInt(strings[1]), Double.parseDouble(strings[2]), Double.parseDouble(strings[3]), Double.parseDouble(strings[4])));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return students;
    }
}