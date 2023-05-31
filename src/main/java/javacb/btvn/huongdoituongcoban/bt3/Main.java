package javacb.btvn.huongdoituongcoban.bt3;

public class Main {
    public static void main(String[] args) {
        Vehicle xe1 = new Vehicle();
        Vehicle xe2 = new Vehicle();
        Vehicle xe3 = new Vehicle();
        xe1.nhapThongTin();
        // xe2.nhapThongTin();
        // xe3.nhapThongTin();
        System.out.println("Ten chu xe \t Loai xe \t Dung tich \t Ngan Luong \t Thue");
        System.out.println(
                "========================================================================================");
        xe1.xuatThongTin();
        // xe2.xuatThongTin();
        // xe3.xuatThongTin();

    }
}
