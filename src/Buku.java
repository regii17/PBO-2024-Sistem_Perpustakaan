public class Buku extends Cetakan {
    private String penulis;

    // Constructor overloading
    public Buku(String judul, String penulis, String kode, int tahunTerbit) {
        super(judul, kode, tahunTerbit);
        this.penulis = penulis;
    }

    // Overloading method
    public void setPenulis(String penulis, boolean append) {
        if (append) {
            this.penulis += " dan " + penulis;
        } else {
            this.penulis = penulis;
        }
    }

    // Getter dan Setter
    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Penulis: " + penulis);
    }
}
