package minpro.minprosistemlisttugaskuliah;

public class Mahasiswa {
    private int idMhs;
    private String nama;
    private String jurusan;

    public Mahasiswa(int idMhs, String nama, String jurusan) {
        this.idMhs = idMhs;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    public int getIdMhs() { return idMhs; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public String getJurusan() { return jurusan; }
    public void setJurusan(String jurusan) { this.jurusan = jurusan; }

    @Override
    public String toString() {
        return "ID Mhs: " + idMhs + ", Nama: " + nama + ", Jurusan: " + jurusan;
    }
}
