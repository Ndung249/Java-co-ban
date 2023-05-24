package javacb.btvn.cautrucrenhanh;

import java.util.Scanner;

public class TinhSoNgay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int thang;
        System.out.print("Nhap thang ban mong muon: ");
        thang = sc.nextInt();
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 10:
            case 12: {
                System.out.println("Thang " + thang + " co 31 ngay ");
                break;

            }

            case 4:
            case 6:
            case 9:
            case 11: {
                System.out.printf("Thang %d co 30 ngay ", thang);
                break;
            }
            case 2: {
                System.out.println("Thang 2 co 28 hoac 29 ngay ");
                break;
            }

            default: {
                System.out.println("Thang nay khong ton tai ");
                break;
            }

        }
    }
}
