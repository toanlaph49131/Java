
    // File: Diem.java
class Diem {
    private double x, y;

    // Hàm tạo nhận vào x, y
    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Setter
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
// File: DuongThang.java
class DuongThang {
    private Diem A, B;

    // Hàm tạo nhận vào A, B
    public DuongThang(Diem A, Diem B) {
        this.A = A;
        this.B = B;
    }

    // Getter cho A và B
    public Diem getA() {
        return A;
    }

    public Diem getB() {
        return B;
    }

    // Tính độ dài đường thẳng AB
    public double tinhDoDai() {
        double dx = B.getX() - A.getX();
        double dy = B.getY() - A.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
// File: Main.java
public class Bai1 {
    public static void main(String[] args) {
        Diem a = new Diem(1, 2);
        Diem b = new Diem(4, 6);

        DuongThang d = new DuongThang(a, b);

        System.out.println("Diem A: (" + d.getA().getX() + ", " + d.getA().getY() + ")");
        System.out.println("Diem B: (" + d.getB().getX() + ", " + d.getB().getY() + ")");
        System.out.println("Do dai AB = " + d.tinhDoDai()); // Kết quả: 5.0
    }
}