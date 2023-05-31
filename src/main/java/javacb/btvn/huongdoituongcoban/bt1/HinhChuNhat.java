package javacb.btvn.huongdoituongcoban.bt1;

import java.util.Scanner;

public class HinhChuNhat {
    private double chieuDai, chieuRong;

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public double tinhChuVi() {
        return (this.chieuDai + this.chieuRong) * 2;
    }

    public double tinhDienTich() {
        return (this.chieuDai * this.chieuRong);
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        this.setChieuDai(sc.nextDouble());
        System.out.print("Nhap chieu rong: ");
        this.setChieuRong(sc.nextDouble());
    }

}
