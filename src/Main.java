public class Main {
    public static void main(String[] args) {
        // Buat objek dari ketiga class
        MataKuliah mataKuliah = new MataKuliah("Matematika Dasar", "2");
        MKWajib mkWajib = new MKWajib("Bahasa Inggris", "3", "Pak Budi");
        MKPilihan mkPilihan = new MKPilihan("Pemrograman Java", "3", "40");
        MKBerkarya mkBerkarya = new MKBerkarya("Karya Tulis Ilmiah", "3", "Pengaruh Penggunaan Teknologi terhadap Pendidikan");

        // Tampilkan informasi dari ketiga objek
        mataKuliah.tampilkanInfo();
        mkWajib.tampilkanInfo();
        mkPilihan.tampilkanInfo();
        mkBerkarya.tampilkanInfo();
    }
}