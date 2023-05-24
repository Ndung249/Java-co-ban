package javacb.btvn.cautrucvonglap;

import java.util.Scanner;

public class TinhTongN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, tong = 0;
        System.out.println("Nhap so muon tinh tong: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            tong += i;
        }
        System.out.println("Tong la: " + tong);

    }
}