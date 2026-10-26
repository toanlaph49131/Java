package buoi3;

public class HinhTron {
        private double x;
        private double y;
        private double r;

        // Constructor mặc định
        public HinhTron() {
            this.x = 5;
            this.y = 5;
            this.r = 10;
        }

        // Constructor có tham số
        public HinhTron(double x, double y, double r) {
            this.x = x;
            this.y = y;
            this.r = r;
        }

        public void setX(double x) {
            this.x = x;
        }

        public void setY(double y) {
            this.y = y;
        }

        public void setR(double r) {
            this.r = r;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public double getR() {
            return r;
        }
        public double tinhDienTich() {
            return Math.PI * r * r;
        }


        @Override
        public String toString() {
            return "HinhTron [x=" + x + ", y=" + y + ", r=" + r + "]";
        }
    
}
