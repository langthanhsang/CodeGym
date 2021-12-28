package bai14.th1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileText {

    public void readFileText(String filePath) throws FileNotFoundException {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();

            System.out.println("tổng = " + sum);

        } catch (Exception e) {
            System.out.println("file không tồn tại");
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("nhập dòng dẫn file :");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        ReadFileText readFileText = new ReadFileText();
        readFileText.readFileText(path);

    }
}