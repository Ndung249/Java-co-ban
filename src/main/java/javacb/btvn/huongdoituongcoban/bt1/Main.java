package javacb.btvn.huongdoituongcoban.bt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HinhChuNhat h1 = new HinhChuNhat();

        h1.nhapThongTin();

        System.out.print("Chu vi hcn la:" + h1.tinhChuVi());
        System.out.print("\nDien tich hcn la " + h1.tinhDienTich());

    }
}
