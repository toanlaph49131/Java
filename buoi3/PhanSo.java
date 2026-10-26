package buoi3;

public class PhanSo {
    private int tu;   // tử số T
    private int mau;  // mẫu số M

    // Hàm tạo mặc định: 0/1
    public PhanSo() {
        this.tu = 0;
        this.mau = 1;
    }

    // Hàm tạo có đối
    public PhanSo(int tu, int mau) {
        this.tu = tu;
        if (mau == 0) {
            this.mau = 1; // mẫu bằng 0 thì đặt lại là 1
        } else {
            this.mau = mau;
        }
    }

    // Getters
    public int getTu() {
        return tu;
    }

    public int getMau() {
        return mau;
    }

    // Setters
    public void setTu(int tu) {
        this.tu = tu;
    }

    public void setMau(int mau) {
        if (mau != 0) {
            this.mau = mau;
        }
    }

    // toString
    @Override
    public String toString() {
        return tu + "/" + mau;
    }

    // Tìm ước chung lớn nhất
    private int ucln(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    // Rút gọn phân số
    public PhanSo rutGon() {
        int t = tu;
        int m = mau;
        int u = ucln(t, m);
        if (u != 0) {
            t = t / u;
            m = m / u;
        }
        // đưa dấu âm lên tử số
        if (m < 0) {
            t = -t;
            m = -m;
        }
        return new PhanSo(t, m);
    }

    // Tổng 2 phân số
    public PhanSo tong(PhanSo p) {
        int t = this.tu * p.mau + p.tu * this.mau;
        int m = this.mau * p.mau;
        return new PhanSo(t, m).rutGon();
    }

    // Hiệu 2 phân số
    public PhanSo hieu(PhanSo p) {
        int t = this.tu * p.mau - p.tu * this.mau;
        int m = this.mau * p.mau;
        return new PhanSo(t, m).rutGon();
    }

    // Tích 2 phân số
    public PhanSo tich(PhanSo p) {
        int t = this.tu * p.tu;
        int m = this.mau * p.mau;
        return new PhanSo(t, m).rutGon();
    }

    // Thương 2 phân số
    public PhanSo thuong(PhanSo p) {
        int t = this.tu * p.mau;
        int m = this.mau * p.tu;
        return new PhanSo(t, m).rutGon();
    }

    // So sánh 2 phân số: 1 nếu lớn hơn, -1 nếu nhỏ hơn, 0 nếu bằng
    public int soSanh(PhanSo p) {
        PhanSo a = this.rutGon();
        PhanSo b = p.rutGon();
        int trai = a.tu * b.mau;
        int phai = b.tu * a.mau;
        if (trai > phai) {
            return 1;
        } else if (trai < phai) {
            return -1;
        }
        return 0;
    }

    // Kiểm tra phân số có phải số nguyên không
    public boolean laSoNguyen() {
        return tu % mau == 0;
    }
}