package bt.them;

import java.util.Arrays;
import java.util.Comparator;

public class ManagerStudent {
    private Student[] students;
    private static int index = 0;

    public ManagerStudent(Student[] students) {
        this.students = students;
    }

    public void disPlay() {
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }

        System.out.println("----------------------");
    }

    public void disPlayMaxPoint() {
        double maxPoint = students[0].getAvagePoint();
        Student s = students[0];
        for (Student student : students) {
            if (student != null && student.getAvagePoint() > maxPoint) {
                maxPoint = student.getAvagePoint();
                s = student;
            }
        }
        System.out.println(s);
        System.out.println("------------------------");
    }

    public void displayMinPoint() {
        double minPoint = students[0].getAvagePoint();
        Student s = students[0];
        for (Student student : students) {
            if (student != null && student.getAvagePoint() < minPoint) {
                minPoint = student.getAvagePoint();
                s = student;
            }
        }
        System.out.println(s);
        System.out.println("------------------------");
    }

    public void displayGender(String gender) {
        for (Student student : students) {
            if (student != null && student.getGender().equals(gender)) {
                System.out.println(student);
            }
        }
        System.out.println("-------------------------");

    }

    public void seachName(String name) {
        for (Student student: students) {
           if (student !=null&& student.getName().equals(name)) {
               System.out.println(student);
           }
        }
        System.out.println("------------------");
    }

    public void addStudent(Student student) {
        if(index == students.length) {
            students = Arrays.copyOf(students,students.length*2);
        }
        students[index] =student;
        index++;
        System.out.println("thêm thanh công");
        System.out.println("--------------------------");

    }
    public void deleteStudent(String name) {
        int index = 0;

        Student[] studentList = new Student[students.length];
        for (Student student: students) {
            if(student != null && student.getName().equals(name)) {
                studentList[index] = student;
                index++;

            }
        }
        System.out.println("thêm mảng thành công!");
        System.out.println("-----------------------------");
    }

    public void sortByAvgPoint() {
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1 != null && o2 != null) {
                    if (o1.getAvagePoint() < o2.getAvagePoint()) {
                        return -1;
                    } else if (o1.getAvagePoint() > o2.getAvagePoint()) {
                        return 1;
                    } else {
                        return 0;
                    }
                } else {
                    return 0;
                }
            }
        });
        System.out.println("Sắp xếp thành công!");

        System.out.println("---------------");
    }
}
