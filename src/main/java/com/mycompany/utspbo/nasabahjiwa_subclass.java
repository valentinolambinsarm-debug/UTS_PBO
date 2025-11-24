/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utspbo;

/**
 *
 * @author valen
 */

    
public class nasabahjiwa_subclass extends nasabah_superclass {
   
    private String ahliWaris;
    private String pekerjaan;
    private double uangPertanggungan;
    
    public nasabahjiwa_subclass(String id, String nama, String alamat, 
                       String ahliWaris, String pekerjaan, double up) {
        super(id, nama, alamat);
        this.ahliWaris = ahliWaris;
        this.pekerjaan = pekerjaan;
        this.uangPertanggungan = up;
    }

    @Override
public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Jenis      : Asuransi Jiwa");
        System.out.println("Ahli Waris : " + ahliWaris);
        System.out.println("Pekerjaan  : " + pekerjaan);
        System.out.println("Uang Pertanggungan: Rp " + uangPertanggungan);
    }
    
public void updateAhliWaris(String namaBaru) {
        this.ahliWaris = namaBaru;
        System.out.println("Ahli waris diubah menjadi: " + namaBaru);
    }
public double hitungPremiBulanan() {
        return uangPertanggungan * 0.005;
    }
}
