package TaksiOnline;


public class PenumpangTaksi {
    private String nama;
    private String noHp;

    public PenumpangTaksi(String nama, String noHp) {
        this.nama = nama;
        this.noHp = noHp;
    }

    public String getNama() {
        return nama;
    }

    public String getNoHp() {
        return noHp;
    }

    public void tampilkanInfo() {
        System.out.println("Penumpang: " + nama + " | No HP: " + noHp);
    }
}
