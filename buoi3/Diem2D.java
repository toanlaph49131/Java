package buoi3;

public class Diem2D {
    protected double x; 
    protected double y;

    // Hàm tạo mặc định
    public Diem2D() {
        this.x = 0;
        this.y = 0;
    }

    // Hàm tạo có đối
    public Diem2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Tính khoảng cách giữa 2 điểm
    public double khoangCach(Diem2D p) {
        double dx = p.x - this.x;
        double dy = p.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Điểm đối xứng qua gốc tọa độ
    public Diem2D doiXung() {
        return new Diem2D(0 - x, 0 - y);
    }

    // Tịnh tiến điểm đi một vị trí (dx, dy)
    public void tinhTien(double dx, double dy) {
        this.x = this.x + dx;
        this.y = this.y + dy;
    }

    @Override
    public String toString() {
        return "Diem2D(" + x + ", " + y + ")";
    }
}