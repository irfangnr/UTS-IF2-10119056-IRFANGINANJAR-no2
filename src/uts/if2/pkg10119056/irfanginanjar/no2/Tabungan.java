/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119056.irfanginanjar.no2;

/**
 *
 * @author ACER
 */
public class Tabungan {
        private int saldo;
    
    public Tabungan(int saldo){
        this.saldo=saldo;
    }
    
    public int ambilUang(int jumlah){
        saldo=saldo-jumlah;
        return saldo;
    }
}
