import java.util.Scanner;
import java.time.Year;

public class VD2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int namSinh;

        do {
            System.out.print("Nhap nam sinh trong khoang [1900, 2010]: ");
            namSinh = sc.nextInt();

            if (namSinh < 1900 || namSinh > 2010) {
                System.out.println("Nam sinh khong hop le, vui long nhap lai!");
            }
        } while (namSinh < 1900 || namSinh > 2010);

        int namHienTai = Year.now().getValue();
        int tuoi = namHienTai - namSinh;

        System.out.println("Tuoi cua ban la: " + tuoi);
    }
}