package minitets5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class StudentManager {
    public static final String PATH_NAME = "/Volumes/WorkSpace/Codegym/ArrayList/src/minitets5/file.text";
    private final ArrayList<Student> students = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public StudentManager() {
//        this.students = readFile(PATH_NAME);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void createStudent(Scanner scanner) {
        scanner.nextLine();
        System.out.println("nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("nhập tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập điểm toán");
        int math = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập điểm lý");
        int phy = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập điểm hoá");
        int che = scanner.nextInt();
        Human student = new Student(name, age, math, phy, che);
        students.add((Student)student);
    }

    public Student deleteStudent(int id) {
        Student deleteStudent = null;
        for (Student s : students) {
            if (s.getId() == id) {
                deleteStudent = s;
            }
        }
        if (deleteStudent != null) {
            students.remove(deleteStudent);
        }
        return deleteStudent;
    }

    public void updatebByName(Scanner sc) {
        Student student = null;
        int id = scanner.nextInt();
        for (Student studentUpdate : students) {

            if (studentUpdate.getId() == id) {
                studentUpdate = student;

                scanner.nextLine();

                System.out.println("nhập tên mới");
                studentUpdate.setName(sc.nextLine());
                System.out.println("nhập tuổi mới:");
                sc.nextLine();
                studentUpdate.setAge(sc.nextInt());
                System.out.println("nhập điểm toán mới:");
                scanner.nextLine();
                studentUpdate.setMath(sc.nextInt());
                System.out.println("nhập điểm lý mới");
                studentUpdate.setPhy(sc.nextInt());
                scanner.nextLine();
                System.out.println("nhập điểm hoá mới:");
                studentUpdate.setChemical(sc.nextInt());
            }
        }
    }

    public void displayAll() {
        for (Student student : students) {
            System.out.println(student);
        }
    }


    public void sortByAvgPointIncrease() {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.avgPoint() > o2.avgPoint()) {
                    return 1;
                } else if (o1.avgPoint() < o2.avgPoint()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        displayAll();
    }

    public void searchStudent(Scanner sc) {
        System.out.println("input id you want to edit");
        int id = sc.nextInt();
        for (Student student : students) {
            if (id == student.getId()) {
                System.out.println(student);
            }
        }
    }

    public void highestPoint() {
        double max = students.get(0).avgPoint();
        for (Student student : students) {
            if (max < student.avgPoint()) {
                max = student.avgPoint();
                System.out.println(student);
            }
        }
    }

    public void writeToFile(ArrayList<Student> students, String path) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            for (Student student : this.students) {
                bw.write(student.getId() + "," + student.getName() + "," + student.getAge() + ","
                        + "," + student.getMath() + "," + student.getPhy()
                        + student.getChemical() + "," + "\n");
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }


    public ArrayList<Student> readFile(String path){
        File file = new File(path);
        try{
            if(!file.exists()){
                file.createNewFile();
            }
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = "";
            while ((line = br.readLine())!=null){
                String[] strings = line.split(",");
                students.add(new Student(strings[0], Integer.parseInt(strings[1]), Integer.parseInt(strings[2]), Integer.parseInt(strings[3]), Integer.parseInt(strings[4])));
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
        return students;
    }

}

