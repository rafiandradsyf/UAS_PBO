package TaksiOnline;


public class PemesananTaksi {
    protected PenumpangTaksi penumpang;
    protected String supir;
    protected String tujuan;
    protected double jarak;
    protected double tarif;

    public PemesananTaksi(PenumpangTaksi penumpang, String supir, String tujuan, double jarak) {
        this.penumpang = penumpang;
        this.supir = supir;
        this.tujuan = tujuan;
        this.jarak = jarak;
        this.tarif = hitungTarif();
    }

    // Mutator
    public void setSupir(String supir) {
        this.supir = supir;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public void setJarak(double jarak) {
        this.jarak = jarak;
        this.tarif = hitungTarif();
    }

    // Polymorphic method
    public double hitungTarif() {
        return jarak * 3500;
    }

    public void tampilkanDetail() {
        System.out.println("\n--- Detail Pemesanan Reguler ---");
        penumpang.tampilkanInfo();
        System.out.println("Supir: " + supir);
        System.out.println("Tujuan: " + tujuan);
        System.out.println("Jarak: " + jarak + " km");
        System.out.println("Tarif: Rp" + tarif);
    }
}
