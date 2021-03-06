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
                        System.out.println("id ???? t???n t???i nh???p l???i id");
                    }
                } else throw new Exception();
            } catch (Exception e) {
                System.out.println("m?? h???c sinh ph???i b???t ?????u 'HS' v?? theo sau 6 s???");
            }
        }
    }

    private static String getPhone() {
        while ( true ) {
            try {
                System.out.println("nh???p s??? ??i???n thoai");
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
                        System.out.println("SDT ???? t???n t???i nh??p l???i s??? ??i??n tho???i!");
                    }
                } else throw new Exception();
            } catch (Exception e) {
                System.out.println("s??? ??i???n tho???i ph???i b???t ????u t??? s??? 0 v?? theo sau l?? 9 s???!");
            }
        }
    }

    private static String getName() {
        while ( true ) {
            try {
                System.out.println("nh???p h??? v?? t??n");
                String name = scanner.nextLine();
                if
                (NameRegex.validate(name)) {
                    return name;
                }
            } catch (Exception e) {
                System.out.println("t??n kh??ng ???????c l?? s??? v?? kh??ng ???????c ????? tr???ng!");
            }
        }
    }

    private static String getAge() {
        while ( true ) {
            try {
                System.out.println("nh???p tu???i");
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
                System.out.println("ng?????i n??y qu?? gi?? hay qu?? tr??? ????? ??i h???c!");
            }
        }
    }

    public static String getGender() {
        while ( true ) {
            try {
                System.out.println("nh???p gi???i t??nh c???a b???n!");
                String gender = scanner.nextLine();
                if (Validate.validateGender(gender)) {
                    return gender;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("gi???i t??nh kh??ng th??? l?? 3D");
            }
        }
    }

    public static String getMail() {
        while ( true ) {
            try {
                System.out.println("nh???p v??o EMAIL c???a b???n!");
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
                        System.out.println("mail ???? t???n t???i!");
                    }
                }
            } catch (Exception e) {
                System.out.println("mail ph???i c?? ?????nh d???ng -> @gmail.com");
            }
        }
    }

    public static String getAddress() {
        System.out.println("nh???p ?????a ch???!");
        String address = scanner.nextLine();
        return address;
    }

    private static String getAVG() {
        while ( true ) {
            try {
                System.out.println("Nh???p ??i???m trung b??nh");
                String diemTB = scanner.nextLine();
                if (Validate.validateScore(diemTB)) {
                    if (Double.parseDouble(diemTB) < 0 || Double.parseDouble(diemTB) > 10) {
                    } else return diemTB;
                } else throw new Exception();
                System.err.println("??i???m TB ph???i > 0 v?? <= 10");
            } catch (Exception e) {
                System.err.println("Sai ?????nh d???ng");
            }
        }

    }

    public static void update() {
        System.out.println("nh???p id c???n s???a!");
        String id = scanner.nextLine();
        Student studentUpdate = null;
        for (Student student : students) {
            if (student.getId().equals(id)) {
                studentUpdate = student;
                System.out.println("nh???p t??n m???i");
                studentUpdate.setName(scanner.nextLine());
                System.out.println("nh???p tu???i m???i");
                studentUpdate.setAge(scanner.nextLine());
                System.out.println("nh???p gi???i t??nh m???i!");
                studentUpdate.setGender(scanner.nextLine());
                System.out.println("nh???p s??? ??i???n tho???i m???i");
                studentUpdate.setPhone(scanner.nextLine());
                System.out.println("nh???p email m???i!");
                studentUpdate.setMail(scanner.nextLine());
                System.out.println("nh???p ?????a ch??? m???i!");
                studentUpdate.setAddress(scanner.nextLine());
                System.out.println("nh???p ??i???m trung b??nh m???i!");
                studentUpdate.setPointAVG(scanner.nextLine());
            }

        }
    }

    public static void delete() {
        System.out.println("nh???p id h???c sinh c???n xo??");
        String idDelete = scanner.nextLine();
        System.out.println("b???n c?? th???t s??? mu???n xo???");
        System.out.println("1. c??");
        System.out.println("2.kh??ng");
        int choice = 0;
        try {
            choice = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("vui l??ng nh???p ????ng");
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
        System.out.println("*  1. t??m ki???m theo id:                               *");
        System.out.println("*  2. t??m ki???m h???c sinh tr??ng t??n                     *");
        System.out.println("*  0. tho??t                                           *");
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
                System.out.println("nh???p v??o id:");
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
                        System.out.println("kh??ng t??m th???y");
                    }
                }
            case 2:
                System.out.println("nh???p t??n v??o!");
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
                    System.out.println("kh??ng timg th???y!");
                }
                break;
            default:
                System.out.println("vui l??ng nh???p l???i!");
        }
    }

    public static void redFile() {
        students = IOOFile.readFile();
    }

    public static void writeFile() {
        IOOFile.writeFile();
    }
}