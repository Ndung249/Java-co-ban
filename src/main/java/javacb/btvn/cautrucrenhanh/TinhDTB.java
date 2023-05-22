/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacb.btvn.cautrucrenhanh;
import java.util.Scanner;
/**
 *
 * @author KHOACNTT
 */
public class TinhDTB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double dToan,dVan, dAnh, dTB;
        System.out.println("Nhap diem Toan ");
        dToan = sc.nextDouble();
        System.out.println("Nhap diem Van ");
        dVan = sc.nextDouble();
        System.out.println("Nhap diem Anh ");
        dAnh = sc.nextDouble();
        dTB= (dToan+dVan+dAnh)/3;
        if (dTB>=8 && dTB<=10 ) {
            System.out.println("Gioi");
        }else if (dTB>=6.5 && dTB<8) {
            System.out.println("Ngo ba kha");
                    
        }else if(dTB>=4 && dTB<6.5){
            System.out.println("Binh thuong");
        }else{
            System.out.println("Thanh phan cuc doan");
        }
        
    }
    
}
