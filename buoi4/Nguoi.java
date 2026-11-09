package buoi4;
import java.util.Scanner;

public class Nguoi{
        protected String hoTen;
    protected int tuoi;
 
    // Nhập thông tin
    public void nhap(Scanner sc) {
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = Integer.parseInt(sc.nextLine());
    }
 
    // Xuất thông tin
    public void xuat() {
        System.out.print("Ho ten: " + hoTen + ", Tuoi: " + tuoi);
    }
}