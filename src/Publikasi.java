public class Publikasi {
    // Encapsulation: Properti private
    private String judul;
    private String kode;
    private int tahunTerbit;

    // Overloading Constructor
    public Publikasi(String judul, String kode, int tahunTerbit) {
        this.judul = judul;
        this.kode = kode;
        this.tahunTerbit = tahunTerbit;
    }

    // Getter dan Setter
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    // Overridable method
    public void displayInfo() {
        System.out.println("Judul: " + judul + ", Kode: " + kode + ", Tahun Terbit: " + tahunTerbit);
    }
}
