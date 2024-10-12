public class Majalah extends Cetakan {
    private int edisi;

    // Constructor
    public Majalah(String judul, String kode, int tahunTerbit, int edisi) {
        super(judul, kode, tahunTerbit);
        this.edisi = edisi;
    }

    // Getter dan Setter
    public int getEdisi() {
        return edisi;
    }

    public void setEdisi(int edisi) {
        this.edisi = edisi;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Edisi: " + edisi);
    }
}
