package caseStudyModule2.IOOFile;

import caseStudyModule2.manager.Login;
import caseStudyModule2.manager.Student;
import caseStudyModule2.manager.StudentManager;
import caseStudyModule2.manager.User;

import java.io.*;
import java.util.ArrayList;

public class IOOFile {
    public static void writeFile() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("/Volumes/WorkSpace/Codegym/TestModule2/src/caseStudyModule2/Student.csv"));
            String something = "Id,name,age,gender,phone,mail.address,avg";
            bw.write(something);
            for (Student student : StudentManager.students) {
                bw.newLine();
                bw.write(student.display());
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeUserFile() {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("/Volumes/WorkSpace/Codegym/TestModule2/src/caseStudyModule2/User.text"));
            String something = "User,Password";
            bw.write(something);
            for (User user : Login.userList) {
                bw.newLine();
                bw.write(user.display());
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static ArrayList<Student> readFile() {
        ArrayList<Student> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("/Volumes/WorkSpace/Codegym/TestModule2/src/caseStudyModule2/Student.csv"));
            String line = br.readLine();
            while ( (line = br.readLine()) != null ) {
                String[] strings = line.split(",");
                list.add(new Student(strings[0], strings[1], strings[2], strings[3], strings[4], strings[5], strings[6], strings[7]));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
   public static ArrayList<User> readUserFile(){
        ArrayList<User> list =new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader("/Volumes/WorkSpace/Codegym/TestModule2/src/caseStudyModule2/User.text"));
            String line = br.readLine();
            while (( line = br.readLine()) != null ){
                String [] strings = line.split(", ");
                list.add( new User(strings[0],strings[1]));
            }
        }catch (Exception e){
         e.printStackTrace();
        }
      return list;
   }
}
