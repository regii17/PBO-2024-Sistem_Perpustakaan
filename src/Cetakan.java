public class Cetakan extends Publikasi {
    // Constructor Cetakan menginduk ke Publikasi
    public Cetakan(String judul, String kode, int tahunTerbit) {
        super(judul, kode, tahunTerbit);
    }

    // Overriding method dari kelas Publikasi
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ini adalah cetakan.");
    }
}
