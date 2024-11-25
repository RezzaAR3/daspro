import java.util.Scanner;
public class Parkiran06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TARIF_MOBIL_PER_JAM = 3000;
        final int TARIF_MOTOR_PER_JAM = 2000;
        final int TARIF_TETAP = 12500;
        int totalPembayaran = 0;
        System.out.println(" ");

        while (true) {
            System.out.println("Pilih jenis kendaraan (1 untuk mobil, 2 untuk motor, 0 untuk keluar): ");
            int jenisKendaraan = sc.nextInt();

            if (jenisKendaraan == 0) {
                break;
            }

            if (jenisKendaraan != 1 && jenisKendaraan != 2) {
                System.out.println("Jenis kendaraan tidak valid. Silakan pilih lagi.");
                continue;
            }

            System.out.print("Masukkan durasi parkir (dalam jam): ");
            int durasiParkir = sc.nextInt();

            if (durasiParkir <= 0) {
                System.out.println("Durasi parkir tidak valid. Silakan masukkan durasi yang benar.");
                continue;
            }

            int biayaParkir;

            if (durasiParkir > 5) {
                biayaParkir = TARIF_TETAP;
            } else {
                if (jenisKendaraan == 1) {
                    biayaParkir = durasiParkir * TARIF_MOBIL_PER_JAM;
                } else {
                    biayaParkir = durasiParkir * TARIF_MOTOR_PER_JAM;
                }
            }

            totalPembayaran += biayaParkir;
            System.out.println("Biaya parkir untuk kendaraan ini: Rp " + biayaParkir);
        }

        System.out.println("\nTotal pembayaran parkir: Rp " + totalPembayaran);
        System.out.println(" ");

        sc.close();
    }
}
