public class SuratKabar extends Cetakan {
    private String tanggalTerbit;

    // Constructor
    public SuratKabar(String judul, String kode, int tahunTerbit, String tanggalTerbit) {
        super(judul, kode, tahunTerbit);
        this.tanggalTerbit = tanggalTerbit;
    }

    // Getter dan Setter
    public String getTanggalTerbit() {
        return tanggalTerbit;
    }

    public void setTanggalTerbit(String tanggalTerbit) {
        this.tanggalTerbit = tanggalTerbit;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tanggal Terbit: " + tanggalTerbit);
    }
}
