package TaksiOnline;


import java.util.*;

public class TaksiOnlineBeraksi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<PemesananTaksi> daftarPemesanan = new ArrayList<>();
        System.out.println("=== Aplikasi TaksiOnline ===");

        while (true) {
            System.out.print("\n1. Buat Pemesanan Reguler\n2. Buat Pemesanan VIP\n3. Lihat Semua Pemesanan\n4. Keluar\nPilih menu: ");
            int menu = sc.nextInt(); sc.nextLine();

            if (menu == 1 || menu == 2) {
                PemesananTaksi psn = inputPemesanan(sc, menu == 2);
                if (psn != null) {
                    daftarPemesanan.add(psn);
                    System.out.println("Pemesanan berhasil!");
                    psn.tampilkanDetail(); // Polymorphic call
                }
            } else if (menu == 3) {
                if (daftarPemesanan.isEmpty()) {
                    System.out.println("Belum ada pemesanan.");
                } else {
                    daftarPemesanan.forEach(PemesananTaksi::tampilkanDetail);
                }
            } else if (menu == 4) {
                System.out.println("Terima kasih telah menggunakan TaksiOnline!");
                break;
            } else {
                System.out.println("Menu tidak tersedia.");
            }
        }
        sc.close();
    }

    private static PemesananTaksi inputPemesanan(Scanner sc, boolean isVIP) {
        try {
            System.out.print("Nama Penumpang: ");
            String nama = sc.nextLine();
            System.out.print("No HP: ");
            String noHp = sc.nextLine();
            System.out.print("Nama Supir: ");
            String supir = sc.nextLine();
            System.out.print("Tujuan: ");
            String tujuan = sc.nextLine();
            System.out.print("Jarak (km): ");
            double jarak = sc.nextDouble();
            sc.nextLine();

            if (jarak <= 0) {
                System.out.println("Jarak tidak valid.");
                return null;
            }

            PenumpangTaksi penumpang = new PenumpangTaksi(nama, noHp);
            return isVIP
                ? new PemesananVIP(penumpang, supir, tujuan, jarak)
                : new PemesananTaksi(penumpang, supir, tujuan, jarak);

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan input.");
            sc.nextLine();
            return null;
        }
    }
}
