/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utspbo;

/**
 *
 * @author valen
 */
public class polis_relasi {

    private String nomorPolis;
    private String status;
    private String tanggalMulai;
    
private nasabah_superclass nasabah;

public polis_relasi(String noPolis, String tgl, nasabah_superclass nasabah) {
        this.nomorPolis = noPolis;
        this.tanggalMulai = tgl;
        this.nasabah = nasabah;
        this.status = "Aktif";
    }

public String getNomorPolis() { return nomorPolis; }
public nasabah_superclass getNasabah() { return nasabah; }
public String getStatus() { return status; }

public void infoPolis() {
        System.out.println("=== DETAIL POLIS ===");
        System.out.println("No Polis   : " + nomorPolis);
        System.out.println("Status     : " + status);
        System.out.println("Tgl Mulai  : " + tanggalMulai);
        System.out.println("--- Data Pemegang Polis ---");
        nasabah.tampilkanData(); 
        System.out.println("========================");
    }
public void cekStatusPolis() {
        if(status.equalsIgnoreCase("Aktif")){
            System.out.println("Polis Bernomor " + nomorPolis + " Sedang berjalan.");
        } else {
            System.out.println("Polis Bernomor " + nomorPolis + " Sudah tidak berlaku.");
        }
    }

public void nonaktifkanPolis() {
        this.status = "Tidak Aktif";
        System.out.println("Polis berhasil dinonaktifkan.");
    }



}
