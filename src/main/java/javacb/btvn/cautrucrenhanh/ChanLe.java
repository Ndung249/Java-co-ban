package javacb.btvn.cautrucrenhanh;

import java.util.Scanner;

public class ChanLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Hay nhap so a: ");
        a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Day la so chan");
        } else {
            System.out.println("Day la so le");
        }
    }
}
