package buoi4;


public class Diem2d {
     protected double x;   // protected: lớp con (Diem3D) dùng được
    protected double y;
 
    public Diem2d() {
        x = 0;
        y = 0;
    }
 
    public Diem2d(double x, double y) {
        this.x = x;
        this.y = y;
    }
 
    public double getX() {
        return x;
    }
 
    public double getY() {
        return y;
    }
 
    // Tính khoảng cách giữa 2 điểm
    public double khoangCach(Diem2d p) {
        double dx = x - p.x;
        double dy = y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
 
    // Xác định điểm đối xứng qua gốc tọa độ: (x, y) -> (-x, -y)
    public Diem2d doiXung() {
        return new Diem2d(-x, -y);
    }
 
    // Tịnh tiến điểm đi một vị trí với độ lệch dx, dy
    public void tinhTien(double dx, double dy) {
        x = x + dx;
        y = y + dy;
    }
 
    @Override
    public String toString() {
        return "Diem2d(" + x + ", " + y + ")";
    }
}
