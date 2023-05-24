package javacb.btvn.cautrucrenhanh;

import java.util.Scanner;

public class TinhTienTX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km, tongTien, tien;
        System.out.print("Hay nhap so km : ");
        km = sc.nextDouble();
        if (km > 0 && km < 2) {
            tien = 15000;
            tongTien = tien * km;
        } else if (km >= 2 && km <= 5) {
            tien = 13500;
            tongTien = tien * km;
        } else if (km >= 6) {
            tien = 11000;
            tongTien = tien * km;
        } else if (km >= 120) {
            tien = 11000;
            tongTien = tien * 0.1;
        } else {
            tongTien = 0;
        }
        System.out.printf("Tong tien la : %.0f $", tongTien);
    }
}
