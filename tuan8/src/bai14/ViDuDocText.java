package bai14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class ViDuDocText<c> {
    public static void main(String[] args) {
//        cach 1

//        File file = new File("src/bai14/th1/numbers.txt");
//        try {
//            BufferedReader br = Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8);
//            String line = null;
//            while (true) {
//               line = br.readLine();
//                if (line == null){
//                    break;
//                }else{
//                    System.out.println("line");
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

        //     cach 2
        File f2 = new File("src/bai14/th4/file.txt");
        try {
           List<String> allText = Files.readAllLines(f2.toPath(),StandardCharsets.UTF_8);
           for(String line : allText){
               System.out.println(line);
           }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
