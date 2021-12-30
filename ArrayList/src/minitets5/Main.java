package minitets5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();

        int choice;
        do {
            System.out.println("-----MENU-----");
            System.out.println("1. Add student");
            System.out.println("2. Update student by id");
            System.out.println("3. Delete student by id");
            System.out.println("4. Display students");
            System.out.println("5. hiển thị học sinh có điểm cao nhất:");
            System.out.println("6. Ghi file");
            System.out.println("7. Đọc file");
            System.out.println("0. Exit");
            System.out.println("Input your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    studentManager.createStudent(scanner);

                    break;
                case 2:
                    studentManager.updatebByName(scanner);
                    break;
                case 3:
                    int id = scanner.nextInt();
                    studentManager.deleteStudent(id);

                case 4:
                    studentManager.displayAll();
                    break;
                case 5:
                    studentManager.sortByAvgPointIncrease();
                    break;
                case 6:
                    studentManager.writeToFile(studentManager.getStudents(),StudentManager.PATH_NAME);
                    break;
                case 7:
                    ArrayList<Student> students = studentManager.readFile(StudentManager.PATH_NAME);
                    students.forEach(System.out::println);
                    break;
                case 8:
                    studentManager.highestPoint();
                    break;
            }
        } while (choice != 0);
    }
}
