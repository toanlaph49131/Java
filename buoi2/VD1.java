import java.util.Scanner;

public class VD1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhap mot so nguyen trong khoang [0, 100]: ");
            n = sc.nextInt();

            if (n < 0 || n > 100) {
                System.out.println("So khong hop le, vui long nhap lai!");
            }
        } while (n < 0 || n > 100);

        System.out.println("So da nhap: " + n);
    }
}