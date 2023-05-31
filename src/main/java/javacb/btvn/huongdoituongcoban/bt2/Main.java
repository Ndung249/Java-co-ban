package javacb.btvn.huongdoituongcoban.bt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        SinhVien sv1 = new SinhVien(1, "tran van a", 9, 8);
        SinhVien sv2 = new SinhVien(2, "tran van b", 7, 8);
        SinhVien sv3 = new SinhVien();

        sv3.setMaSV(sc.nextInt());
        sv3.setHoTen(sc2.nextLine());
        sv3.setDiemLT(sc.nextFloat());
        sv3.setDiemTH(sc.nextFloat());

        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);
    }
}
