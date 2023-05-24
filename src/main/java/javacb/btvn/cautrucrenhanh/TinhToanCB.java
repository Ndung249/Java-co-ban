package javacb.btvn.cautrucrenhanh;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class TinhToanCB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        String phepToan;
        double ketQua;
        System.out.print("Nhap so A: ");
        a = sc.nextInt();
        System.out.print("Hay nhap so B: ");
        b = sc.nextInt();
        System.out.println("Nhap phep toan mong muon: (+, -, *, /)");
        phepToan = sc.next();
        switch (phepToan) {
            case "+": {
                ketQua = a + b;
                break;
            }
            case "-": {
                ketQua = a - b;
                break;
            }
            case "x":
            case "*": {
                ketQua = a * b;
                break;
            }
            case ":":
            case "/": {
                if (b == 0) {
                    System.out.println("Khong the chia cho 0");
                }
                ketQua = (double) a / (double) b;
                break;
            }
            default: {
                return;
            }

        }
        System.out.printf("Ket qua la: %.3f", ketQua);
    }
}
