# 🏛️ UTS PEMROGRAMAN BERORIENTASI OBJEK (PBO)
## Aplikasi Asuransi Nasabah

Repository ini berisi kode sumber (Source Code) untuk tugas Ujian Tengah Semester mata kuliah Pemrograman Berorientasi Objek (PBO).

### 📝 Detail Tugas
| Keterangan | Detail |
| :--- | :--- |
| **Mata Kuliah** |Pemrograman Berorientasi Objek (3 SKS)|
| **Dosen Pengampu** |Gia Yuliana, S.Kom.|
| **Topik Studi Kasus** |Aplikasi Asuransi Nasabah (Berdasarkan NIM akhir 7)|
| **Kelas** |TIF RP 24D|

---

### 💻 Struktur Proyek
Aplikasi ini dikembangkan berbasis konsol (Java) dan memenuhi persyaratan minimal struktur kelas dan konsep PBO yang diwajibkan.

#### 1. Implementasi Inheritance (Pewarisan)
* **Superclass:** `Nasabah`
* **Subclasses:**
    * `NasabahKesehatan` (Extends `Nasabah`) 
    * `NasabahJiwa` (Extends `Nasabah`) 

#### 2. Implementasi Relasi Antar Kelas
* **Kelas Relasi:** `Polis` 
* **Tipe Relasi:** **Aggregation** 
    * Setiap `Polis` **dimiliki** oleh satu `Nasabah`.

#### 3. Penerapan Konsep PBO Lain
* **Encapsulation:** Setiap class domain menggunakan atribut `private` dengan `Getter` dan `Setter`.
* **Constructor:** Setiap class memiliki minimal 1 Constructor Berparameter.
* **Method:** Setiap class domain memiliki minimal 2 method tambahan.

---

### ⚙️ Menu Program
Aplikasi ini dioperasikan melalui menu berbasis teks di console, dengan pilihan:
1.  Tambah Data 
2.  Tampilkan Data 
3.  Cari Data (berdasarkan Nomor Polis)
4.  Ubah Data (Alamat Nasabah)
5.  Cek Status Data (Status Polis) 
6.  Keluar dari Program 

---

### 🚀 Cara Menjalankan Program (NetBeans/IDE Lain)
1.  **Clone Repository:** Ambil repository ini ke folder lokal Anda.
    ```bash
    git clone [https://github.com/valentinolambinsarm-debug/UTS_PBO.git](https://github.com/valentinolambinsarm-debug/UTS_PBO.git)
    ```
2.  **Buka Proyek:** Buka folder proyek (`UTS_PBO`) di IDE Java (seperti NetBeans, IntelliJ, atau VS Code).
3.  **Compile & Run:** Jalankan file `Main.java` dari IDE untuk memulai aplikasi konsol.
