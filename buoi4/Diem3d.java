package buoi4;



public class Diem3d extends Diem2d {
    private double z;   // private: chỉ dùng trong lớp này
 
    public Diem3d() {
        super();
        z = 0;
    }
 
    public Diem3d(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }
 
    public double getZ() {
        return z;
    }
 
    // Tính khoảng cách giữa 2 điểm 3D
    // (nếu p là điểm 2D thì coi như z của p bằng 0)
    @Override
    public double khoangCach(Diem2d p) {
        double dx = x - p.getX();
        double dy = y - p.getY();
        double zp = 0;
        if (p instanceof Diem3d) {
            zp = ((Diem3d) p).getZ();
        }
        double dz = z - zp;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
 
    // Định nghĩa lại hàm xác định điểm đối xứng qua gốc tọa độ: (x, y, z) -> (-x, -y, -z)
    @Override
    public Diem3d doiXung() {
        return new Diem3d(-x, -y, -z);
    }
 
    // Tịnh tiến điểm đi một vị trí với độ lệch dx, dy, dz
    public void tinhTien(double dx, double dy, double dz) {
        super.tinhTien(dx, dy);   // tịnh tiến x, y bằng hàm của lớp cha
        z = z + dz;
    }
 
    @Override
    public String toString() {
        return "Diem3D(" + x + ", " + y + ", " + z + ")";
    }
}
