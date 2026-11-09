package buoi4;

import java.util.Scanner;

public class NhanVien extends Nguoi {
        private int snct;      // số năm công tác
    private double hsl;    // hệ số lương
    private static final double LCB = 1.5; // lương cơ bản (triệu)
 
    // Nhập: nhập phần của Nguoi rồi nhập thêm snct, hsl
    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Nhap so nam cong tac: ");
        snct = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap he so luong: ");
        hsl = Double.parseDouble(sc.nextLine());
    }
 
    // Tính tiền lương = lcb * hsl + phucap, phucap = 0.2 * snct
    public double tinhLuong() {
        double phucap = 0.2 * snct;
        return LCB * hsl + phucap;
    }
 
    public int getSnct() {
        return snct;
    }
 
    // Xuất: xuất phần của Nguoi rồi xuất thêm snct, hsl, tiền lương
    @Override
    public void xuat() {
        super.xuat();
        System.out.println(", SNCT: " + snct + ", HSL: " + hsl
                + ", Tien luong: " + tinhLuong() + " trieu");
    }
}
