class Diem {
    private double x, y;

    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }
 
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Tính khoảng cách từ điểm này đến điểm khác
    public double khoangCach(Diem d) {
        double dx = d.x - x;
        double dy = d.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

class TamGiac {
    private Diem A, B, C;

    public TamGiac(Diem A, Diem B, Diem C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public double tinhChuVi() {

        double ab = A.khoangCach(B);
        double bc = B.khoangCach(C);
        double ca = C.khoangCach(A);
        return ab + bc + ca;
    }

    // Diện tích theo công thức Heron
    public double tinhDienTich() {
        double ab = A.khoangCach(B);
        double bc = B.khoangCach(C);
        double ca = C.khoangCach(A);
        double p = (ab + bc + ca) / 2; // nửa chu vi
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ca));
    }
}

class ChuNhat {
    private double dai, rong;

    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double tinhChuVi() {
        return 2 * (dai + rong);
    }

    public double tinhDienTich() {
        return dai * rong;
    }
}

class HinhTron {
    private Diem O;
    private double r;

    public HinhTron(Diem O, double r) {
        this.O = O;
        this.r = r;
    }

    public double tinhChuVi() {
        return 2 * Math.PI * r;
    }

    public double tinhDienTich() {
        return Math.PI * r * r;
    }
}

public class Bai2 {
    public static void main(String[] args) {
        // 2 tam giác
        TamGiac tg1 = new TamGiac(new Diem(0, 0), new Diem(3, 0), new Diem(0, 4));
        TamGiac tg2 = new TamGiac(new Diem(1, 1), new Diem(5, 1), new Diem(3, 4));

        // 2 chữ nhật
        ChuNhat cn1 = new ChuNhat(5, 3);
        ChuNhat cn2 = new ChuNhat(10, 4);

        // 2 hình tròn
        HinhTron ht1 = new HinhTron(new Diem(0, 0), 2);
        HinhTron ht2 = new HinhTron(new Diem(1, 1), 5);

        System.out.println("Tam giac 1: Chu vi = " + tg1.tinhChuVi() + ", Dien tich = " + tg1.tinhDienTich());
        System.out.println("Tam giac 2: Chu vi = " + tg2.tinhChuVi() + ", Dien tich = " + tg2.tinhDienTich());

        System.out.println("Chu nhat 1: Chu vi = " + cn1.tinhChuVi() + ", Dien tich = " + cn1.tinhDienTich());
        System.out.println("Chu nhat 2: Chu vi = " + cn2.tinhChuVi() + ", Dien tich = " + cn2.tinhDienTich());

        System.out.println("Hinh tron 1: Chu vi = " + ht1.tinhChuVi() + ", Dien tich = " + ht1.tinhDienTich());
        System.out.println("Hinh tron 2: Chu vi = " + ht2.tinhChuVi() + ", Dien tich = " + ht2.tinhDienTich());
    }
}