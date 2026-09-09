package minpro.minprosistemlisttugaskuliah;

public class MataKuliah {
    private int idMK;
    private String namaMK;
    private String dosenPengampu;

    public MataKuliah(int idMK, String namaMK, String dosenPengampu) {
        this.idMK = idMK;
        this.namaMK = namaMK;
        this.dosenPengampu = dosenPengampu;
    }

    public int getIdMK() { return idMK; }
    public String getNamaMK() { return namaMK; }
    public void setNamaMK(String namaMK) { this.namaMK = namaMK; }
    public String getDosenPengampu() { return dosenPengampu; }
    public void setDosenPengampu(String dosenPengampu) { this.dosenPengampu = dosenPengampu; }

    @Override
    public String toString() {
        return "ID MK: " + idMK + ", Mata Kuliah: " + namaMK + ", Dosen: " + dosenPengampu;
    }
}
