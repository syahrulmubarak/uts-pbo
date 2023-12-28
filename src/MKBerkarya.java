class MKBerkarya extends MataKuliah {
    private String judul;

    public MKBerkarya(String nama, String sks, String judul) {
        super(nama, sks);
        this.judul = judul;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Judul: " + judul);
    }
}
