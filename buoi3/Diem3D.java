package buoi3;
import buoi3.Diem2D;
public class Diem3D extends Diem2D {
    private double z;

    // Hàm tạo mặc định
    public Diem3D() {
        super(); // gọi hàm tạo của lớp cha
        this.z = 0;
    }

    // Hàm tạo có đối
    public Diem3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    // Tính khoảng cách giữa 2 điểm 3D
    public double khoangCach(Diem3D p) {
        double dx = p.x - this.x;
        double dy = p.y - this.y;
        double dz = p.z - this.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    // Định nghĩa lại hàm điểm đối xứng qua gốc tọa độ
    @Override
    public Diem3D doiXung() {
        return new Diem3D(0 - x, 0 - y, 0 - z);
    }

    // Tịnh tiến điểm đi (dx, dy, dz)
    public void tinhTien(double dx, double dy, double dz) {
        this.x = this.x + dx;
        this.y = this.y + dy;
        this.z = this.z + dz;
    }

    @Override
    public String toString() {
        return "Diem3D(" + x + ", " + y + ", " + z + ")";
    }
}
