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
public class PhuongTrinhBacNhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new  Scanner(System.in);
        double a, b, ketQua;
        System.out.println("Hay nhap so A: ");
        a=sc.nextDouble();
        System.out.println("Hay nhap so B: ");
        b=sc.nextDouble();
        if (a==0) {
            System.out.println("Phuong trinh vo nghiem ");    
        }
        else{
        ketQua= -b/a;
        System.out.println("Ket qua la : " + ketQua);
        }
        
    }
    
}
