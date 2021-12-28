package bai14.th4;

import java.io.PrintWriter;
import java.io.Writer;

/**
 *
 */
public class ViDuGhiText {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("/Volumes/WorkSpace/Codegym/tuan8/src/bai14/th4/file.txt", "UTF-8");
            pw.println("xin chào");
            pw.println("hellú");
            pw.flush();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
