package caseStudyModule2.manager;

import caseStudyModule2.IOOFile.IOOFile;
import caseStudyModule2.Regex.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManager {
    public static ArrayList<Student> students = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public StudentManager() {

    }

    public static void add() {
        String id = getId();
        String name = getName();
        String age = getAge();
        String gender = getGender();
        String phone = getPhone();
        String mail = getMail();
        String address = getAddress();
        String avg = getAVG();
        students.add(new Student(id, name, age, gender, phone, mail, address, avg));
        IOOFile.writeFile();
    }

    public static void displayAll() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void displayHSG() {
        for (Student student : students) {
            if (Integer.parseInt(student.getPointAVG()) >= 8) {
                System.out.println(student);
            }
        }
    }

    public static void displayHSk() {
        for (Student student : students) {
            if (Integer.parseInt(student.getPointAVG()) < 8 && Integer.parseInt(student.getPointAVG()) > 6.5) {
                System.out.println(student);
            }
        }
    }

    public static void displayHSTB() {
        for (Student student : students) {
            if (Integer.parseInt(student.getPointAVG()) < 6.5 && Integer.parseInt(student.getPointAVG()) > 5) {
                System.out.println(student);
            }
        }
    }

    public static void displayHSKe() {
        for (Student student : students) {
            if (Integer.parseInt(student.getPointAVG()) < 5) {
                System.out.println(student);
            }
        }
    }

    private static String getId() {
        while ( true ) {
            try {
                System.out.println("input iD");
                String id = scanner.nextLine();
                if (Validate.validateId(id)) {
                    boolean check = true;
                    for (Student student : students) {
                        if (student.getId().equals(id)) {
                            check = false;
                            break;
                        }
                    }
                    if (check) {
                        return id;
                    } else {
                        System.out.println("id đã tồn tại nhập lại id");
                    }
                } else throw new Exception();
            } catch (Exception e) {
                System.out.println("mã học sinh phải bắt đầu 'HS' và theo sau 6 số");
            }
        }
    }

    private static String getPhone() {
        while ( true ) {
            try {
                System.out.println("nhập số điện thoai");
                String number = scanner.nextLine();
                if (Validate.validateNumber(number)) {
                    boolean check = true;
                    for (Student student : students) {
                        if (student.getPhone().equals(number)) {
                            check = false;
                            break;
                        }
                    }
                    if (check) {
                        return number;
                    } else {
                        System.out.println("SDT đã tồn tại nhâp lại số điên thoại!");
                    }
                } else throw new Exception();
            } catch (Exception e) {
                System.out.println("số điện thoại phải bắt đâu từ số 0 và theo sau là 9 số!");
            }
        }
    }

    private static String getName() {
        while ( true ) {
            try {
                System.out.println("nhập họ và tên");
                String name = scanner.nextLine();
                if
                (NameRegex.validate(name)) {
                    return name;
                }
            } catch (Exception e) {
                System.out.println("tên không được là số và không được để trống!");
            }
        }
    }

    private static String getAge() {
        while ( true ) {
            try {
                System.out.println("nhập tuổi");
                String age = scanner.nextLine();
                if (Validate.validateAge(age)) {
                    if (Integer.parseInt(age) < 18 || Integer.parseInt(age) > 100) {
                        throw new Exception();
                    } else {
                        return age;
                    }

                } else {
                    throw new Exception();
                }
            } catch (Exception age) {
                System.out.println("người này quá già hay quá trẻ để đi học!");
            }
        }
    }

    public static String getGender() {
        while ( true ) {
            try {
                System.out.println("nhập giới tính của bạn!");
                String gender = scanner.nextLine();
                if (Validate.validateGender(gender)) {
                    return gender;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("giới tính không thể là 3D");
            }
        }
    }

    public static String getMail() {
        while ( true ) {
            try {
                System.out.println("nhập vào EMAIL của bạn!");
                String mail = scanner.nextLine();
                if (Validate.validateGmail(mail)) {
                    boolean check = true;
                    for (Student student : students) {
                        if (student.getMail().equals(mail)) {
                            check = false;
                            break;
                        }
                    }
                    if (check) {
                        return mail;
                    } else {
                        System.out.println("mail đã tồn tại!");
                    }
                }
            } catch (Exception e) {
                System.out.println("mail phải có định dạng -> @gmail.com");
            }
        }
    }

    public static String getAddress() {
        System.out.println("nhập địa chỉ!");
        String address = scanner.nextLine();
        return address;
    }

    private static String getAVG() {
        while ( true ) {
            try {
                System.out.println("Nhập điểm trung bình");
                String diemTB = scanner.nextLine();
                if (Validate.validateScore(diemTB)) {
                    if (Double.parseDouble(diemTB) < 0 || Double.parseDouble(diemTB) > 10) {
                    } else return diemTB;
                } else throw new Exception();
                System.err.println("Điểm TB phải > 0 và <= 10");
            } catch (Exception e) {
                System.err.println("Sai định dạng");
            }
        }

    }

    public static void update() {
        System.out.println("nhập id cần sủa!");
        String id = scanner.nextLine();
        Student studentUpdate = null;
        for (Student student : students) {
            if (student.getId().equals(id)) {
                studentUpdate = student;
                System.out.println("nhập tên mới");
                studentUpdate.setName(scanner.nextLine());
                System.out.println("nhập tuổi mới");
                studentUpdate.setAge(scanner.nextLine());
                System.out.println("nhập giới tính mới!");
                studentUpdate.setGender(scanner.nextLine());
                System.out.println("nhập số điện thoại mới");
                studentUpdate.setPhone(scanner.nextLine());
                System.out.println("nhập email mới!");
                studentUpdate.setMail(scanner.nextLine());
                System.out.println("nhập địa chỉ mới!");
                studentUpdate.setAddress(scanner.nextLine());
                System.out.println("nhập điểm trung bình mới!");
                studentUpdate.setPointAVG(scanner.nextLine());
            }

        }
    }

    public static void delete() {
        System.out.println("nhập id học sinh cần xoá");
        String idDelete = scanner.nextLine();
        System.out.println("bạn có thật sự muốn xoá?");
        System.out.println("1. có");
        System.out.println("2.không");
        int choice = 0;
        try {
            choice = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("vui lòng nhập đúng");
        }
        if (choice == 1) {
            students.removeIf(student -> student.getId().equals(idDelete));
        }
    }

    public static void sortByname() {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {

                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public static void sortByAvg() {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (Double.parseDouble(o1.getPointAVG()) > Double.parseDouble(o2.getPointAVG())) {
                    return 1;
                } else if (Double.parseDouble(o1.getPointAVG()) < Double.parseDouble(o2.getPointAVG())) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

    }

    public static void sortByAge() {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (Integer.parseInt(o1.getAge()) > Integer.parseInt(o2.getAge())) {
                    return 1;
                } else if (Integer.parseInt(o1.getAge()) < Integer.parseInt(o2.getAge())) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }

//    public void getMaxPoint() {
//        double max = Double.parseDouble(students.get(0).getPointAVG());
//        for (Student student : students) {
//           if (max < Double.parseDouble(student.getPointAVG())){
//               System.out.println(student);
//           }
//        }
//    }}

    public static void searchStudent() {
        System.out.println("*******************************************************");
        System.out.println("*                   ------MENU----                    * ");
        System.out.println("*  1. tìm kiếm theo id:                               *");
        System.out.println("*  2. tìm kiếm học sinh trùng tên                     *");
        System.out.println("*  0. thoát                                           *");
        System.out.println("*******************************************************");

        int choice = 100;
        try {
            choice = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
        }
        if (choice == 0) {
            return;
        }
        switch (choice) {
            case 1:
                System.out.println("nhập vào id:");
                String id = scanner.nextLine();
                boolean check = false;
                for (Student student : students) {
                    if (student.getId().equals(id)) {
                        System.out.println(student);
                        check = true;
                        break;
                    }
                    if (check) {
                        return;
                    } else {
                        System.out.println("không tìm thấy");
                    }
                }
            case 2:
                System.out.println("nhập tên vào!");
                String name = scanner.nextLine();
                boolean check1 = false;
                for (Student student : students) {
                    if (student.getName().equals(name)) {
                        System.out.println(student);
                        check1 = true;
                    }
                }
                if (check1) {
                    return;
                } else {
                    System.out.println("không timg thấy!");
                }
                break;
            default:
                System.out.println("vui lòng nhập lại!");
        }
    }

    public static void redFile() {
        students = IOOFile.readFile();
    }

    public static void writeFile() {
        IOOFile.writeFile();
    }
}