package student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("******************************* ");

        
    }

    ArrayList<Student> arrStudent = new ArrayList<>();
    public void inputListStudent(int n) {
        for (int i = 0; i <= n; i++) {
            Student student = new Student();
            student.inputInfo();
            arrStudent.add(student);
        }
    }
    public void dockingStudent(ArrayList<Student> arrStudent) {
        for (int i = 0; i < arrStudent.size(); i++) {
            for (int j = 0; j < arrStudent.size(); j++) {
                if (arrStudent.get(i).getPoint() < arrStudent.get(j).getPoint()) {
                    Student student = new Student();
                    student = arrStudent.get(i);
                    arrStudent.set(i, arrStudent.get(j));
                    arrStudent.set(j, student);
                }

            }
        }

    }

    public void showListStudent(ArrayList<Student> arr) {
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).displayAllStudent();
        }
    }

    public void searchStudent(ArrayList<Student>arr,String name) {
       int check = 0;
        for (int i = 0; i < arr.size(); i++) {
          if(arr.get(i).getName().lastIndexOf(name) >= 0) {
              arr.get(i).displayAllStudent();
              check=1;
          }
        }
        if(check == 0) {
            System.out.println("không có sinh viên cần tìm");
        }

    }


}



