package bt.them;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        out.println("Số sinh viên muốn tạo: ");
        int size = scanner.nextInt();
        Student[] students = new Student[size];
        ManagerStudent studentManager = new ManagerStudent(students);

        int choice;
        do {
            out.println("Menu");
            out.println("1. Hiển thị tất cả");
            out.println("2. Hiển thị điểm cao nhất");
            out.println("3. Hiển thị điểm thấp nhất");
            out.println("4. Hiển thị thoe giới tính");
            out.println("5. Tìm kiếm theo tên");
            out.println("6. Thêm 1 sinh viên");
            out.println("7. Xóa 1 sinh viên theo tên");
            out.println("8. Sắp xếp theo điểm");
            out.println("0. Exit");
            out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    studentManager.disPlay();
                    break;
                case 2:
                    studentManager.disPlayMaxPoint();
                    break;
                case 3:
                    studentManager.displayMinPoint();
                    break;
                case 4:
                    int choice1;
                    do {
                        out.println("Menu");
                        out.println("1. Nam");
                        out.println("2. Nữ");
                        out.println("0. Exit");
                        out.println("Nhập lựa chọn của bạn: ");
                        choice1 = scanner.nextInt();
                        switch (choice1) {
                            case 1:
                                studentManager.displayGender("Nam");
                                break;
                            case 2:
                                studentManager.displayGender("Nữ");
                                break;
                        }
                    } while (choice1 != 0);
                    break;
                case 5:
                    out.println("Nhập vào tên muốn tìm: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    studentManager.seachName(name);
                    break;
                case 6:
                    Student student = createStudent(scanner);
                    studentManager.addStudent(student);
                    break;
                case 7:
                    out.println("Nhập vào tên muốn tìm: ");
                    scanner.nextLine();
                    String nameDel = scanner.nextLine();
                    studentManager.deleteStudent(nameDel);
                    break;
                case 8:
                    studentManager.sortByAvgPoint();
                    break;
            }
        } while (choice != 0);
    }

    public static Student createStudent(Scanner scanner) {
        out.println("Nhập tên");
        scanner.nextLine();
        String name1 = scanner.nextLine();
        out.println("Nhập tuổi");
        int age = scanner.nextInt();
        out.println("Nhập giới tính");
        scanner.nextLine();
        String gender = scanner.nextLine();
        out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        out.println("Nhập điểm TB");
        double point = scanner.nextDouble();
        return new Student(name1, age, gender, address, point);
    }
}
