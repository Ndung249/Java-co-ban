package javacb.btvn.huongdoituongcoban.bt3;

import java.util.Scanner;

public class Vehicle {
    private String tenChuXe, tenXe;
    private int theTichXiLanh;
    private float nganLuong, thue;

    public Vehicle() {
        this.tenChuXe = this.tenXe = "";
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten chu: ");
        this.tenChuXe = sc.nextLine();
        System.out.print("Ten xe: ");
        this.tenXe = sc.nextLine();
        System.out.print("Dung tich: ");
        this.theTichXiLanh = sc.nextInt();
        System.out.print("Ngan Luong: ");
        this.nganLuong = sc.nextFloat();
        System.out.print("Thue: ");
        this.thue = sc.nextFloat();
    }

    public void xuatThongTin() {
        System.out
                .println(
                        this.tenChuXe + "\t" + this.tenXe + "\t\t" + this.theTichXiLanh + "\t\t" + this.nganLuong
                                + "\t\t"
                                + this.thue);
    }
}
