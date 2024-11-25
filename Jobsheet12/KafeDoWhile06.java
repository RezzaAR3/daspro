import java.util.Scanner;
public class KafeDoWhile06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti, totalharga;
        String namapelanggan;
        int hargakopi = 12000, hargateh = 7000, hargaroti = 20000;

        do {
            System.out.print("Masukkan Nama Pelanggan (ketik 'batal' untuk keluar): ");
            namapelanggan = sc.nextLine();
            if (namapelanggan.equalsIgnoreCase("batal")){
                System.out.println("Transaksi Dibatalkan.");
                break;
            }
            System.out.print("Jumlah Kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah Teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah Roti: ");
            roti = sc.nextInt();
            totalharga = (kopi * hargakopi) + (teh * hargateh) + (roti * hargaroti);
            System.out.println("Total Yang Harus Dibayar: RP. " + totalharga);
            sc.nextLine();
        } while (true);
        System.out.println("Semua Transaksi Selesai.");

        sc.close();
    }
}
