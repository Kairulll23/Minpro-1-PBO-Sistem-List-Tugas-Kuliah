package minpro.minprosistemlisttugaskuliah;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    // untuk nyimpan data
    static ArrayList<Tugas> daftarTugas = new ArrayList<>();
    static ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    static ArrayList<MataKuliah> daftarMataKuliah = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan = 0;

        // tampilan awal
        System.out.println("=====================================");
        System.out.println(" SELAMAT DATANG DI SISTEM LIST KULIAH ");
        System.out.println("=====================================");
        System.out.println("Program ini untuk latihan CRUD sederhana.");
        System.out.println("Anda bisa mengelola Tugas, Mahasiswa, dan Mata Kuliah.");
        System.out.println();

        // menu utama
        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Kelola Tugas");
            System.out.println("2. Kelola Mahasiswa");
            System.out.println("3. Kelola Mata Kuliah");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                menuTugas();
            } else if (pilihan == 2) {
                menuMahasiswa();
            } else if (pilihan == 3) {
                menuMataKuliah();
            } else if (pilihan == 4) {
                System.out.println("Program selesai. Terima kasih!");
            } else {
                System.out.println("Pilihan tidak ada, coba lagi.");
            }

        } while (pilihan != 4);
    }

    // ================= CRUD TUGAS =================
    static void menuTugas() {
        int pilih;
        do {
            System.out.println("\n=== MENU TUGAS ===");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Lihat Semua Tugas");
            System.out.println("3. Update Tugas");
            System.out.println("4. Hapus Tugas");
            System.out.println("5. Kembali");
            System.out.print("Pilih: ");
            pilih = sc.nextInt(); sc.nextLine();

            if (pilih == 1) tambahTugas();
            else if (pilih == 2) tampilkanTugas();
            else if (pilih == 3) updateTugas();
            else if (pilih == 4) hapusTugas();
        } while (pilih != 5);
    }

    static void tambahTugas() {
        System.out.print("ID Tugas: ");
        int id = sc.nextInt(); sc.nextLine();
        System.out.print("Nama Tugas: ");
        String nama = sc.nextLine();
        System.out.print("Deadline: ");
        String deadline = sc.nextLine();
        System.out.print("Status (Belum Dikerjakan/On Progress/Selesai): ");
        String status = sc.nextLine();

        Tugas t = new Tugas(id, nama, deadline, status);
        daftarTugas.add(t);
        System.out.println("Tugas berhasil ditambahkan!");
    }

    static void tampilkanTugas() {
        if (daftarTugas.isEmpty()) {
            System.out.println("Belum ada tugas.");
        } else {
            for (Tugas t : daftarTugas) {
                System.out.println(t);
            }
        }
    }

    static void updateTugas() {
        System.out.print("Masukkan ID Tugas: ");
        int id = sc.nextInt(); sc.nextLine();
        for (Tugas t : daftarTugas) {
            if (t.getIdTugas() == id) {
                System.out.print("Nama baru: ");
                t.setNamaTugas(sc.nextLine());
                System.out.print("Deadline baru: ");
                t.setDeadline(sc.nextLine());
                System.out.print("Status baru: ");
                t.setStatus(sc.nextLine());
                System.out.println("Update berhasil!");
                return;
            }
        }
        System.out.println("Tugas tidak ditemukan.");
    }

    static void hapusTugas() {
        System.out.print("Masukkan ID Tugas: ");
        int id = sc.nextInt(); sc.nextLine();
        for (Tugas t : daftarTugas) {
            if (t.getIdTugas() == id) {
                daftarTugas.remove(t);
                System.out.println("Tugas dihapus!");
                return;
            }
        }
        System.out.println("Tugas tidak ditemukan.");
    }

    // ================= CRUD MAHASISWA =================
    static void menuMahasiswa() {
        int pilih;
        do {
            System.out.println("\n=== MENU MAHASISWA ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Lihat Semua Mahasiswa");
            System.out.println("3. Update Mahasiswa");
            System.out.println("4. Hapus Mahasiswa");
            System.out.println("5. Kembali");
            System.out.print("Pilih: ");
            pilih = sc.nextInt(); sc.nextLine();

            if (pilih == 1) tambahMahasiswa();
            else if (pilih == 2) tampilkanMahasiswa();
            else if (pilih == 3) updateMahasiswa();
            else if (pilih == 4) hapusMahasiswa();
        } while (pilih != 5);
    }

    static void tambahMahasiswa() {
        System.out.print("ID Mahasiswa: ");
        int id = sc.nextInt(); sc.nextLine();
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Jurusan: ");
        String jurusan = sc.nextLine();

        Mahasiswa m = new Mahasiswa(id, nama, jurusan);
        daftarMahasiswa.add(m);
        System.out.println("Mahasiswa berhasil ditambahkan!");
    }

    static void tampilkanMahasiswa() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Belum ada mahasiswa.");
        } else {
            for (Mahasiswa m : daftarMahasiswa) {
                System.out.println(m);
            }
        }
    }

    static void updateMahasiswa() {
        System.out.print("Masukkan ID Mahasiswa: ");
        int id = sc.nextInt(); sc.nextLine();
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.getIdMhs() == id) {
                System.out.print("Nama baru: ");
                m.setNama(sc.nextLine());
                System.out.print("Jurusan baru: ");
                m.setJurusan(sc.nextLine());
                System.out.println("Update berhasil!");
                return;
            }
        }
        System.out.println("Mahasiswa tidak ditemukan.");
    }

    static void hapusMahasiswa() {
        System.out.print("Masukkan ID Mahasiswa: ");
        int id = sc.nextInt(); sc.nextLine();
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.getIdMhs() == id) {
                daftarMahasiswa.remove(m);
                System.out.println("Mahasiswa dihapus!");
                return;
            }
        }
        System.out.println("Mahasiswa tidak ditemukan.");
    }

    // ================= CRUD MATA KULIAH =================
    static void menuMataKuliah() {
        int pilih;
        do {
            System.out.println("\n=== MENU MATA KULIAH ===");
            System.out.println("1. Tambah Mata Kuliah");
            System.out.println("2. Lihat Semua Mata Kuliah");
            System.out.println("3. Update Mata Kuliah");
            System.out.println("4. Hapus Mata Kuliah");
            System.out.println("5. Kembali");
            System.out.print("Pilih: ");
            pilih = sc.nextInt(); sc.nextLine();

            if (pilih == 1) tambahMataKuliah();
            else if (pilih == 2) tampilkanMataKuliah();
            else if (pilih == 3) updateMataKuliah();
            else if (pilih == 4) hapusMataKuliah();
        } while (pilih != 5);
    }

    static void tambahMataKuliah() {
        System.out.print("ID Mata Kuliah: ");
        int id = sc.nextInt(); sc.nextLine();
        System.out.print("Nama Mata Kuliah: ");
        String nama = sc.nextLine();
        System.out.print("Dosen Pengampu: ");
        String dosen = sc.nextLine();

        MataKuliah mk = new MataKuliah(id, nama, dosen);
        daftarMataKuliah.add(mk);
        System.out.println("Mata Kuliah berhasil ditambahkan!");
    }

    static void tampilkanMataKuliah() {
        if (daftarMataKuliah.isEmpty()) {
            System.out.println("Belum ada mata kuliah.");
        } else {
            for (MataKuliah mk : daftarMataKuliah) {
                System.out.println(mk);
            }
        }
    }

        static void updateMataKuliah() {
        System.out.print("Masukkan ID Mata Kuliah: ");
        int id = sc.nextInt(); sc.nextLine();
        for (MataKuliah mk : daftarMataKuliah) {
            if (mk.getIdMK() == id) {
                System.out.print("Nama Mata Kuliah baru: ");
                mk.setNamaMK(sc.nextLine());
                System.out.print("Dosen Pengampu baru: ");
                mk.setDosenPengampu(sc.nextLine());
                System.out.println("Update berhasil!");
                return;
            }
        }
        System.out.println("Mata Kuliah tidak ditemukan.");
    }

    static void hapusMataKuliah() {
        System.out.print("Masukkan ID Mata Kuliah: ");
        int id = sc.nextInt(); sc.nextLine();
        for (MataKuliah mk : daftarMataKuliah) {
            if (mk.getIdMK() == id) {
                daftarMataKuliah.remove(mk);
                System.out.println("Mata Kuliah dihapus!");
                return;
            }
        }
        System.out.println("Mata Kuliah tidak ditemukan.");
    }
}
