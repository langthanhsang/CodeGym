package bai14.th3;

import java.io.File;
import java.io.IOException;

public class ViDuTaoThuMuc {
    public static void main(String[] args) throws IOException {
        File folder1 = new File("src/bai14/th3");
        File folder2 = new File("src/bai14/th10");

        System.out.println("kiểm tra : " + folder2.exists());

        File d1 = new File("src/bai14/th3/Director_1");
        d1.mkdir();
        File d2 = new File("src/bai14/th3/Director_1/Director_2");
        d2.mkdirs();
        File file1 = new File("src/bai14/th3/Director_1");
        file1.createNewFile();
    }
}
