/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utspbo;

/**
 *
 * @author valen
 */
public class nasabahkesehatan_subclass extends nasabah_superclass {
    
    private String riwayatPenyakit;
    private String rumahSakitRujukan;
    private double limitKlaim;

public nasabahkesehatan_subclass(String id, String nama, String alamat, String riwayat, String rs, double limit) {
        super(id, nama, alamat); 
        this.riwayatPenyakit = riwayat;
        this.rumahSakitRujukan = rs;
        this.limitKlaim = limit;
    }

public void setLimitKlaim(double limit) { this.limitKlaim = limit; }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Jenis      : Asuransi Kesehatan");
        System.out.println("Riwayat    : " + riwayatPenyakit);
        System.out.println("RS Rujukan : " + rumahSakitRujukan);
        System.out.println("Limit Klaim: Rp " + limitKlaim);
    }
    
public void ajukanKlaim(double nominal) {
        if (nominal <= limitKlaim) {
            limitKlaim -= nominal;
            System.out.println("Klaim Rp " + nominal + " disetujui. Sisa limit: " + limitKlaim);
        } else {
            System.out.println("Klaim ditolak! Melebihi limit.");
        }
    }

public void gantiRujukan(String rsBaru) {
        this.rumahSakitRujukan = rsBaru;
        System.out.println("RS Rujukan berhasil diubah ke: " + rsBaru);
    }

}
