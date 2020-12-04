/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119056.irfanginanjar.no2;

import java.util.Scanner;

/**
 * 
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan Saldo Tabungan
 */

public class UTSIF210119056IRFANGINANJARNo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        int jumlahAmbil;
        
        Scanner input=new Scanner(System.in);
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukan Saldo Awal :");
        
        Tabungan tabungan1=new Tabungan(input.nextInt());
        System.out.print("Jumlah Uang yang Diambil : ");
        jumlahAmbil=tabungan1.ambilUang(input.nextInt());
        
        System.out.println("Saldo Anda Sekarang : "+jumlahAmbil);
        
    }
    
}
