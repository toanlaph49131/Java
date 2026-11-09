package buoi4;

import java.util.ArrayList;

import buoi4.Diem2d;
import buoi4.Diem3d;

public class Bai2 {
        public static void main(String[] args) {
        // 1. Tạo một danh sách điểm bao gồm 2D và 3D
        ArrayList<Diem2d> ds = new ArrayList<Diem2d>();
        ds.add(new Diem2d(1, 2));
        ds.add(new Diem3d(1, 2, 3));
        ds.add(new Diem2d(4, 6));
        ds.add(new Diem3d(4, 6, 8));
        ds.add(new Diem2d(-2, 3));
        ds.add(new Diem3d(0, -1, 5));
 
        System.out.println("Danh sach diem ban dau:");
        for (Diem2d p : ds) {
            System.out.println(p);
        }
 
        // 2. Tính tổng khoảng cách các điểm 2D và tổng khoảng cách các điểm 3D
        // (khoảng cách giữa các điểm liên tiếp cùng loại trong danh sách)
        double tong2D = 0;
        double tong3D = 0;
        Diem2d truoc2D = null;   // điểm 2D đứng trước
        Diem3d truoc3D = null;   // điểm 3D đứng trước
        for (Diem2d p : ds) {
            if (p instanceof Diem3d) {
                Diem3d p3 = (Diem3d) p;
                if (truoc3D != null) {
                    tong3D = tong3D + truoc3D.khoangCach(p3);
                }
                truoc3D = p3;
            } else {
                if (truoc2D != null) {
                    tong2D = tong2D + truoc2D.khoangCach(p);
                }
                truoc2D = p;
            }
        }
        System.out.println("\nTong khoang cach cac diem 2D: " + tong2D);
        System.out.println("Tong khoang cach cac diem 3D: " + tong3D);
 
        // 3. Đưa các điểm đối xứng vào danh sách và hiển thị danh sách
        int n = ds.size();   // lưu số điểm ban đầu để không lặp vô hạn
        for (int i = 0; i < n; i++) {
            ds.add(ds.get(i).doiXung());
        }
 
        System.out.println("\nDanh sach diem sau khi them cac diem doi xung:");
        for (Diem2d p : ds) {
            System.out.println(p);
        }
    }
}
