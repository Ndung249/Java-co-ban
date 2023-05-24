package javacb.btvn.cautrucvonglap;

import java.util.Scanner;

public class SoDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Hay nhap so n:");
        n = sc.nextInt();
        int n2 = n, temp = 0;
        while (n2 != 0) {
            temp = temp * 10 + n2 % 10;
            n2 = n2 / 10;
        }
        if (n == temp) {
            System.out.println("Day la so doi xung");
        } else {
            System.out.println("Day khong la so doi xung");
        }
    }
}
