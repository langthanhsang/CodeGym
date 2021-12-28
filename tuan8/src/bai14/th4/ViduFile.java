package bai14.th4;

import java.io.File;
import java.util.Scanner;

public class ViduFile {

    File file;
    public void ViDuFile(String tenFile) {
        this.file = new File(tenFile);
    }

    public boolean kiemTraThucThi(){
        return  this.file.canExecute();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
    do {
        System.out.println("MENU-----------------");
        System.out.println("1.kiểm tra file có thể thực thi khồng");
        System.out.println("2.kiểm tra file có thể đọc");
        System.out.println("3.kiểm tra file có thể ghi");
        System.out.println("4.in đường dẫn");
        System.out.println("5.in tên file");
        System.out.println("6.kiểm tra file là thư mục");
        System.out.println("in ra danh sach các tập tin con");
        System.out.println("in ra cây thư mục");
        }while (choice !=0);
    }
}
