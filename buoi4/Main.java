package buoi4;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        // 1. Nhập vào n nhân viên
        System.out.print("Nhap so nhan vien n: ");
        int n = Integer.parseInt(sc.nextLine());
        NhanVien[] ds = new NhanVien[n];
        for (int i = 0; i < n; i++) {
            System.out.println("--- Nhan vien thu " + (i + 1) + " ---");
            ds[i] = new NhanVien();
            ds[i].nhap(sc);
        }
 
        // 2. Tìm nhân viên có số năm công tác nhiều nhất
        int vtMax = 0;
        for (int i = 1; i < n; i++) {
            if (ds[i].getSnct() > ds[vtMax].getSnct()) {
                vtMax = i;
            }
        }
        System.out.println("\nNhan vien co so nam cong tac nhieu nhat:");
        ds[vtMax].xuat();
 
        // 3. In danh sách nhân viên theo lương từ cao đến thấp (sắp xếp nổi bọt)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (ds[j].tinhLuong() < ds[j + 1].tinhLuong()) {
                    NhanVien tam = ds[j];
                    ds[j] = ds[j + 1];
                    ds[j + 1] = tam;
                }
            }
        }
        System.out.println("\nDanh sach nhan vien theo luong giam dan:");
        for (int i = 0; i < n; i++) {
            ds[i].xuat();
        }
 
        sc.close();
    }
}
