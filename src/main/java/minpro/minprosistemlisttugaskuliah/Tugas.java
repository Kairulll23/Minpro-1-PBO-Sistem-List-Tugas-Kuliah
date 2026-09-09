package minpro.minprosistemlisttugaskuliah;

public class Tugas {
    // atribut tugas
    private int idTugas;
    private String namaTugas;
    private String deadline;
    private String status;

    // constructor (buat objek baru)
    public Tugas(int idTugas, String namaTugas, String deadline, String status) {
        this.idTugas = idTugas;
        this.namaTugas = namaTugas;
        this.deadline = deadline;
        this.status = status;
    }

    // getter & setter sederhana
    public int getIdTugas() {
        return idTugas;
    }

    public String getNamaTugas() {
        return namaTugas;
    }

    public void setNamaTugas(String namaTugas) {
        if (namaTugas.isEmpty()) {
            System.out.println("Nama tugas tidak boleh kosong!");
        } else {
            this.namaTugas = namaTugas;
        }
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        if (deadline.isEmpty()) {
            System.out.println("Deadline tidak boleh kosong!");
        } else {
            this.deadline = deadline;
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        // validasi status: hanya boleh 3 pilihan
        if (status.equalsIgnoreCase("Belum Dikerjakan") ||
            status.equalsIgnoreCase("On Progress") ||
            status.equalsIgnoreCase("Selesai")) {
            this.status = status;
        } else {
            System.out.println("Status hanya boleh 'Belum Dikerjakan', 'On Progress', atau 'Selesai'");
        }
    }


    @Override
    public String toString() {
        return "ID: " + idTugas +
               ", Tugas: " + namaTugas +
               ", Deadline: " + deadline +
               ", Status: " + status;
    }
}
