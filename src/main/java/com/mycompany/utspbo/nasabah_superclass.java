/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utspbo;

/**
 *
 * @author valen
 */
public class nasabah_superclass {
    
    private String idNasabah;
    private String nama;
    private String alamat;
    
public nasabah_superclass(String idNasabah, String nama, String alamat) {
    this.idNasabah = idNasabah;
    this.nama = nama;
    this.alamat = alamat;
}

public String getIdNasabah() { return idNasabah; }
    public String getNama() { return nama; }
    public String getAlamat() { return alamat; }
    public void setAlamat(String alamat) { this.alamat = alamat; }

public void tampilkanData() {
    System.out.println("ID Nasabah : " + idNasabah);
    System.out.println("Nama       : " + nama);
    System.out.println("Alamat     : " + alamat);
    }

public void updateProfil(String namaBaru, String alamatBaru) {
        this.nama = namaBaru;
        this.alamat = alamatBaru;
        System.out.println("Profil berhasil diperbarui.");
    }

}