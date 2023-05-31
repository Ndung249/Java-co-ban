package javacb.btvn.huongdoituongcoban.bt4;

public class Account {
    private long soTaiKhoan;
    private String tenTaiKhoan;
    private double soTien;

    public Account() {
        this.tenTaiKhoan = "";

    }

    public Account(long soTaiKhoan, String tenTaiKhoan, double soTien) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soTien = soTien;
    }

    public long getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(long soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

}