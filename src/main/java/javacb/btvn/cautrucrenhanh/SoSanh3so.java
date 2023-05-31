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
public class SoSanh3so {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double a, b,c;
        System.out.println("Nhap so A: ");
        a= sc.nextDouble();
        System.out.println("Nhap so B: ");
        b= sc.nextDouble();
        System.out.println("Nhap so C: ");
        c= sc.nextDouble();
        
        if (a<b) {
            if (a<c) 
                System.out.println(a);
            else 
                System.out.println(c);
            
        }else if (b<c) 
                System.out.println(b);
            
        else
                System.out.println(c);
            
        
    }
    
}
