/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.utspbo;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author valen
 */
public class Utspbo {
    static ArrayList<polis_relasi> daftarPolis = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int menu;
        do {
            System.out.println("\n=== APLIKASI ASURANSI NASABAH (NIM 7) ===");
            System.out.println("1. Tambah Data Polis & Nasabah");
            System.out.println("2. Tampilkan Semua Data");
            System.out.println("3. Cari Data (by No Polis)");
            System.out.println("4. Ubah Data Alamat Nasabah");
            System.out.println("5. Cek Status Data");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            menu = scanner.nextInt();
            scanner.nextLine();
    switch (menu) {
                case 1: tambahData(); break;
                case 2: tampilkanSemua(); break;
                case 3: cariData(); break;
                case 4: ubahData(); break;
                case 5: cekStatus(); break;
                case 6: System.out.println("Terima kasih!"); break;
                default: System.out.println("Menu tidak valid.");
            }
        } while (menu != 6);
    }

static void tambahData() {
        System.out.print("Masukkan No Polis: ");
        String noPolis = scanner.nextLine();
        System.out.print("Masukkan Tanggal Mulai: ");
        String tgl = scanner.nextLine();
        
        System.out.print("ID Nasabah: ");
        String id = scanner.nextLine();
        System.out.print("Nama Nasabah: ");
        String nama = scanner.nextLine();
        System.out.print("Alamat: ");
        String alamat = scanner.nextLine();

        System.out.print("Tipe Nasabah (1. Kesehatan / 2. Jiwa): ");
        int tipe = scanner.nextInt();
        scanner.nextLine(); 

        nasabah_superclass nasabahBaru = null;

        if (tipe == 1) {
            System.out.print("Riwayat Penyakit: ");
            String riwayat = scanner.nextLine();
            System.out.print("RS Rujukan: ");
            String rs = scanner.nextLine();
            System.out.print("Limit Klaim: ");
            double limit = scanner.nextDouble();
            nasabahBaru = new nasabahkesehatan_subclass(id, nama, alamat, riwayat, rs, limit);
        } else if (tipe == 2) {
            System.out.print("Ahli Waris: ");
            String ahli = scanner.nextLine();
            System.out.print("Pekerjaan: ");
            String kerja = scanner.nextLine();
            System.out.print("Uang Pertanggungan: ");
            double up = scanner.nextDouble();
            nasabahBaru = new nasabahjiwa_subclass(id, nama, alamat, ahli, kerja, up);
        }
    if (nasabahBaru != null) {
            polis_relasi polisBaru = new polis_relasi(noPolis, tgl, nasabahBaru);
            daftarPolis.add(polisBaru);
            System.out.println("Data berhasil disimpan!");
        }
    }
    static void tampilkanSemua() {
        if (daftarPolis.isEmpty()) {
            System.out.println("Data kosong.");
        } else {
            for (polis_relasi p : daftarPolis) {
                p.infoPolis();
                System.out.println();
            }
        }
    }
    static void cariData() {
        System.out.print("Masukkan No Polis yang dicari: ");
        String target = scanner.nextLine();
        boolean found = false;
        for (polis_relasi p : daftarPolis) {
            if (p.getNomorPolis().equalsIgnoreCase(target)) {
                p.infoPolis();
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Data tidak ditemukan.");
    }

    static void ubahData() {
        System.out.print("Masukkan No Polis untuk ubah alamat nasabah: ");
        String target = scanner.nextLine();
        for (polis_relasi p : daftarPolis) {
            if (p.getNomorPolis().equalsIgnoreCase(target)) {
                System.out.print("Masukkan Alamat Baru: ");
                String alamatBaru = scanner.nextLine();
                // Mengakses objek nasabah di dalam polis
                p.getNasabah().setAlamat(alamatBaru);
                System.out.println("Alamat berhasil diubah.");
                return;
            }
        }
        System.out.println("Polis tidak ditemukan.");
    }

    // Menu 5: Cek Status
    static void cekStatus() {
        System.out.print("Masukkan No Polis: ");
        String target = scanner.nextLine();
        for (polis_relasi p : daftarPolis) {
            if (p.getNomorPolis().equalsIgnoreCase(target)) {
                p.cekStatusPolis();
                return;
            }
        }
        System.out.println("Data tidak ditemukan.");
    }
}
    

