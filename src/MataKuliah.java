class MataKuliah {
    private String nama;
    private String sks;

    public MataKuliah(String nama, String sks) {
        this.nama = nama;
        this.sks = sks;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSks() {
        return sks;
    }

    public void setSks(String sks) {
        this.sks = sks;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("SKS: " + sks);
    }
}
