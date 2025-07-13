package TaksiOnline;


public class PemesananVIP extends PemesananTaksi {
    public PemesananVIP(PenumpangTaksi penumpang, String supir, String tujuan, double jarak) {
        super(penumpang, supir, tujuan, jarak);
    }

    // Polymorphism: Override hitungTarif
    @Override
    public double hitungTarif() {
        return jarak * 5000; // lebih mahal
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("\n--- Detail Pemesanan VIP ---");
        penumpang.tampilkanInfo();
        System.out.println("Supir VIP: " + supir);
        System.out.println("Tujuan: " + tujuan);
        System.out.println("Jarak: " + jarak + " km");
        System.out.println("Tarif VIP: Rp" + tarif);
    }
}

