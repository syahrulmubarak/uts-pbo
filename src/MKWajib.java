class MKWajib extends MataKuliah {
    private String dosenPengajar;

    public MKWajib(String nama, String sks, String dosenPengajar) {
        super(nama, sks);
        this.dosenPengajar = dosenPengajar;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Dosen Pengajar: " + dosenPengajar);
    }
}
