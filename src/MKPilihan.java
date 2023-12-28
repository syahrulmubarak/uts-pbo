class MKPilihan extends MataKuliah {
    private String bobot;

    public MKPilihan(String nama, String sks, String bobot) {
        super(nama, sks);
        this.bobot = bobot;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Bobot: " + bobot);
    }
}
