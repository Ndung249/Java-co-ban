package javacb.btvn.cautrucvonglap;

import java.util.Scanner;

public class DemSoUocSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, dem = 0;
        System.out.println("Nhap So n: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                ++dem;
            }
        }
        System.out.println("So uoc so cua n la: " + dem);

    }
}
// B1: Đặt một biến đếm
// B2: Duyệt tất cả các số từ 1 đến n
// B3: Nếu số nào mà n chia dư 0 thì tăng biến đếm lên 1
// B4: Biến đếm là số ước của n
