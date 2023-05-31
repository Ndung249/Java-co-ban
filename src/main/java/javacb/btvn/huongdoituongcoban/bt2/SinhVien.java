package javacb.btvn.huongdoituongcoban.bt2;

public class SinhVien {
    private int maSV;
    private String hoTen;
    private float diemLT, diemTH;

    public SinhVien() {
        this.maSV = 0;
        this.hoTen = "";
        this.diemLT = this.diemTH = 0;
    }

    public SinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public double tinhDTB() {
        return (this.diemLT + this.diemTH) / 2;
    }

    @Override
    public String toString() {
        return "SinhVien [maSV=" + maSV + ", hoTen=" + hoTen + ", diemLT=" + diemLT + ", diemTH=" + diemTH + "diem TB="
                + this.tinhDTB() + "]";
    }

}
