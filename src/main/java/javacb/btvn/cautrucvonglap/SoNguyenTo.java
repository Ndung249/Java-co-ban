package javacb.btvn.cautrucvonglap;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, dem = 0;
        System.out.println("Nhap So N: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                dem += 1;
            }
        }
        if (dem == 2) {
            System.out.println("Day la so nguyen to");

        } else {
            System.out.println("Day khong phai la so nguyen to");
        }
    }
}
