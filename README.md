# Minpro-1-PBO-Sistem-List-Tugas-Kuliah <br>

# Judul : Sistem List Tugas Kuliah

---

## 1. Deskripsi Singkat Program
Program ini adalah sistem sederhana berbasis CLI (Command Line Interface) untuk membantu mahasiswa dalam mengelola daftar tugas kuliah. Di dalam program ini pengguna bisa menambah data tugas, menampilkan daftar tugas yang sudah diinput, mengubah data jika ada kesalahan, dan menghapus tugas dari daftar. Program ini berfokus pada pendataan tugas kuliah agar lebih terorganisir.

---

## 2. Penjelasan Class & Atribut
Struktur project dibagi ke beberapa class, yaitu: 

* **Tugas** 
  * idTugas
  * namaTugas
  * deadline
  * status
  
* **Mahasiswa**
  * idMhs
  * nama
  * jurusan

* **MataKuliah**
  * idMK
  * namaMK
  * dosenPengampu

* **Main** (Entry point)

---

## 3. Penjelasan tiap Class 

* **Tugas**
  * Digunakan untuk menyimpan informasi tugas kuliah.
  * Atribut: idTugas, namaTugas, deadline, status. 
  * Status memiliki validasi hanya boleh "Belum Dikerjakan", "On Progress", atau "Selesai".
  * Menggunakan constructor, getter, setter, dan toString() untuk menampilkan data.

* **Mahasiswa**
  * Menyimpan data mahasiswa.
  * Atribut: idMhs, nama, jurusan.
  * Menggunakan constructor, getter, setter, dan toString().

* **MataKuliah**
  * Entry point program.
  * Menyediakan menu utama untuk memilih CRUD Tugas, Mahasiswa, atau Mata Kuliah.
  * Menggunakan constructor, getter, setter, dan toString().

* **Main**
  * Penjelasan Class: disini entry point nya sebagai tempat program.
  * Menggunakan perulangan agar program terus berjalan sampai user memilih keluar.
  * Menggunakan percabangan untuk navigasi menu.

## 4. Penjelasan Alur Program
Saat program dijalankan, akan muncul tampilan awal berupa menu utama dengan pilihan: 
<img width="286" height="151" alt="image" src="https://github.com/user-attachments/assets/13a4def0-03a3-4536-845a-cc9096dc8049" />

# CRUD Tugas

1. **Tambah Tugas: input id, nama, deadline, status.**  

2. **Lihat Tugas: menampilkan semua daftar tugas.** 

3. **Update Tugas: mengubah data tugas berdasarkan ID.**

4. **Hapus Tugas: menghapus tugas berdasarkan ID.** 

# CRUD Mahasiswa 

1. **Tambah Mahasiswa: input id, nama, jurusan.**  

2. **Lihat Mahasiswa: menampilkan semua daftar mahasiswa.** 

3. **Update Mahasiswa: mengubah data mahasiswa berdasarkan ID.**

4. **Hapus Mahasiswa: menghapus mahasiswa berdasarkan ID.**

# CRUD Mata Kuliah

1. **Tambah Mata Kuliah: input id, nama, dosen pengampu.**  

2. **Lihat Mata Kuliah: menampilkan semua daftar mata kuliah.** 

3. **Update Mata Kuliah: mengubah data mata kuliah berdasarkan ID.**

4. **Hapus Mata Kuliah: menghapus mata kuliah berdasarkan ID.**

# Keluar: menutup program dengan pesan "Terima kasih telah menggunakan program ini".

