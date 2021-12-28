package bai14.th;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File f0 = new File("/Volumes/WorkSpace/Codegym/tuan8/src/bai14/File_1.txt");
        File f1 = new File("/Volumes/WorkSpace/Codegym/tuan8/src/bai14/File_2.txt");

        f0.renameTo(f1);
    }
}
