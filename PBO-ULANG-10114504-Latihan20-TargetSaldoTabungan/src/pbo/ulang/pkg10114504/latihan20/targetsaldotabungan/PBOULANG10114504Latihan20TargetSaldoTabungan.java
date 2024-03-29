/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan20.targetsaldotabungan;

/**
 *
 * @author 
 * NAMA     : Sandy Akbar
 * KELAS    : PBO-Ulang
 * NIM      : 10114504
 * DESKRIPSI: Program ini berisi program saldo tabungan
 */
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class PBOULANG10114504Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int saldo, target;
        double bunga;
        
        //Format Currency
        DecimalFormat kursIndonesia =(DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        Scanner scan = new Scanner(System.in);
        
        //input 
        System.out.print("Saldo Awal    : Rp.");
        saldo = scan.nextInt();
        System.out.print("Bunga/Bulan   : ");
        bunga = scan.nextInt();
        System.out.print("Saldo Target) : ");
        target = scan.nextInt();
        //proses
        int i=1;
        bunga = bunga/100;
        while(saldo<= target){
            saldo = (int) (saldo + (saldo*bunga));
            System.out.println("Saldo di bulan ke-"+i+" "+kursIndonesia.format(saldo));
            i++;
        }
        System.out.println("");
        System.out.println("developed by Sandy Akbar");
    }
    
    
}
  