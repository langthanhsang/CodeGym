package luyenTap1;

public class Main implements Student{
    @Override
    public void nhapdiem() {
        System.out.println("nhap diem");
    }

    @Override
    public void nhap() {
        System.out.println("nhap ten");
    }

    @Override
    public void hienthi() {
        System.out.println("hien thi");

    }

    public static void main(String[] args) {

        Main deno = new Main();
        deno.hienthi();
        deno.nhapdiem();
        deno.nhap();
    }
}
