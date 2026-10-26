/**

public class Main {
    public static void main(String[] args) {
        HinhTron ht1 = new HinhTron(1, 1, 3.5);
        HinhTron ht2 = new HinhTron();
        System.out.println(ht1);
        System.out.println(ht2);
        System.out.println("Dien tich hinh tron 1: " + ht1.tinhDienTich());
        // Diện tích hình tròn 2
        System.out.println("Dien tich hinh tron 2: " + ht2.tinhDienTich());
        if (ht1.tinhDienTich() > ht2.tinhDienTich()) {
            System.out.println("Hinh tron 1 co dien tich lon hon hinh tron 2");
        } else if (ht1.tinhDienTich() < ht2.tinhDienTich()) {
            System.out.println("Hinh tron 2 co dien tich lon hon hinh tron 1");
        } else {
            System.out.println("Hai hinh tron co dien tich bang nhau");
        }

    }

}
*/

package buoi3;
import java.util.ArrayList;
public class Main {

    // Tìm phân số lớn nhất
    public static PhanSo timMax(ArrayList<PhanSo> ds) {
        PhanSo max = ds.get(0);
        for (int i = 1; i < ds.size(); i++) {
            if (ds.get(i).soSanh(max) > 0) {
                max = ds.get(i);
            }
        }
        return max;
    }

    // Tính tổng các phân số
    public static PhanSo tinhTong(ArrayList<PhanSo> ds) {
        PhanSo s = new PhanSo(0, 1);
        for (int i = 0; i < ds.size(); i++) {
            s = s.tong(ds.get(i));
        }
        return s;
    }

    // Đếm số phân số không phải số nguyên
    public static int demKhongNguyen(ArrayList<PhanSo> ds) {
        int dem = 0;
        for (int i = 0; i < ds.size(); i++) {
            if (!ds.get(i).laSoNguyen()) {
                dem++;
            }
        }
        return dem;
    }

    public static void main(String[] args) {
        // Câu 1: kiểm tra các hàm
        PhanSo p1 = new PhanSo(1, 2);
        PhanSo p2 = new PhanSo(3, 4);
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("Tong  = " + p1.tong(p2));
        System.out.println("Hieu  = " + p1.hieu(p2));
        System.out.println("Tich  = " + p1.tich(p2));
        System.out.println("Thuong = " + p1.thuong(p2));
        System.out.println("So sanh p1 voi p2: " + p1.soSanh(p2));
        System.out.println("Rut gon 6/8 = " + new PhanSo(6, 8).rutGon());

        // Câu 2: tập hợp các phân số
        ArrayList<PhanSo> ds = new ArrayList<>();
        ds.add(new PhanSo(1, 2));
        ds.add(new PhanSo(3, 4));
        ds.add(new PhanSo(4, 2));
        ds.add(new PhanSo(5, 3));
        ds.add(new PhanSo(6, 3));

        System.out.println("\nPhan so lon nhat: " + timMax(ds));
        System.out.println("Tong cac phan so: " + tinhTong(ds));
        System.out.println("So phan so khong phai so nguyen: " + demKhongNguyen(ds));
    }
}