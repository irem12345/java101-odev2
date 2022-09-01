/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev2;

import java.util.Scanner;

/**
 *
 * @author İrem Serra
 */
public class Ödev2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner scn = new Scanner(System.in);
        double tutar, kdvOran;
        
        System.out.println("tutarı giriniz");
        tutar= scn.nextDouble();
        
        if(tutar>0 && tutar<1000){
        double kdvTutar= tutar * 1.8;
        double totalTutar = kdvTutar+tutar;
            System.out.println(totalTutar);
        }
        else{
         double kdvTutar= tutar * 0.8;
        double totalTutar = kdvTutar+tutar;
            System.out.println(totalTutar);
      
        }
            
        
    }
    
}
