public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas anak
        Buku buku1 = new Buku("Pemrograman Java", "Regiana hermawan", "IT-425", 2024);
        Majalah majalah1 = new Majalah("Teknologi Pertanian", "MJL-221", 2023, 10);
        SuratKabar suratKabar1 = new SuratKabar("Berita Harian", "SKH-78901", 2024, "12 Oktober 2024");

        // Menggunakan setter untuk mengubah data
        buku1.setPenulis("Aldo Septian",true);

        // Menampilkan informasi menggunakan polymorphism
        tampilkanInfo(buku1);
        tampilkanInfo(majalah1);
        tampilkanInfo(suratKabar1);
    }

    // Polymorphism: Method untuk menampilkan informasi dari objek yang berbeda
    public static void tampilkanInfo(Publikasi publikasi) {
        publikasi.displayInfo();
    }
}
