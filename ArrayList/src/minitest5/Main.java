package minitest5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();

        int choice;
        do {

            System.out.println("************************************************");
            System.out.println("*       1. Add Student                               ");
            System.out.println("*       2. Edit Student                              ");
            System.out.println("*      3. DeleteStudent                              ");
            System.out.println("*       4. Search by ID                              ");
            System.out.println("*       5. Display By increase AvgPoint              ");
            System.out.println("*       6. Display By increase AvgPoint              ");
            System.out.println("*       7. Display Student has Highest Point         ");
            System.out.println(":       8. Display All                               ");
            System.out.println("*       9. Write file                                ");
            System.out.println("*       10. Read File                                ");
            System.out.println("*      0. Exit                                       ");
            System.out.println("**************************************************");
            System.out.println("In put your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    studentManager.createStudent(scanner);
                    break;
                case 2:
                    studentManager.editStudentById(scanner);
                    break;
                case 3:

                    studentManager.deleteById(scanner);
                    break;
                case 4:

                    studentManager.searById(scanner);
                    break;
                case 5:
                    studentManager.sortByAvgPointIncrease();
                    break;
                case 6:
                    studentManager.sortByAvgPointdecrease();
                    break;
                case 7:
                    studentManager.getMaxPoint();
                    break;
                case 8:
                    studentManager.displayAll();
                    break;
                case 9:
                    studentManager.writeToFile(StudentManager.PATH_NAME);
                    break;
                case 10:
                    ArrayList<Student> students = studentManager.readFile(StudentManager.PATH_NAME);
                    students.forEach(System.out::println);
                    break;
            }

        } while (choice != 0);
    }
}

