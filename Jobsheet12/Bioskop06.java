import java.util.Scanner;
public class Bioskop06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int HARGA_TIKET = 50000;
        int totalTiketTerjual = 0;
        int totalPenjualan = 0;
        System.out.println(" ");

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli pelanggan (atau ketik 0 untuk keluar): ");
            int jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid, masukkan jumlah tiket yang benar.");
                continue;
            }

            int hargaTotal = jumlahTiket * HARGA_TIKET;

            if (jumlahTiket > 10) {
                hargaTotal *= 0.85;
            } else if (jumlahTiket > 4) {
                hargaTotal *= 0.90;
            }
            totalTiketTerjual += jumlahTiket;
            totalPenjualan += hargaTotal;

            System.out.println("Total harga untuk pembelian ini: Rp " + hargaTotal);
        }

        System.out.println("\nTotal tiket terjual hari ini: " + totalTiketTerjual);
        System.out.println("Total penjualan tiket hari ini: Rp " + totalPenjualan);
        System.out.println(" ");

        sc.close();
    }
}
