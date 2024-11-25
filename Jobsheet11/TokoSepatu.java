import java.util.Scanner;
public class TokoSepatu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-------------------------");
        System.out.println("       Toko Sepatu");
        System.out.println("-------------------------");
        System.out.println("Converse Slip On/High Top");
        System.out.println("Ukuran Slip On : 36-40");
        System.out.println("Ukuran High Top : 41-44");
        System.out.println("-------------------------");
        System.out.println("Sketcher Woman/Man");
        System.out.println("Ukuran Woman : 36-41");
        System.out.println("Ukuran Man : 42-44");
        System.out.println("-------------------------");
        System.out.println("Nike Kids/Adult");
        System.out.println("Ukuran Kids : 36-40");
        System.out.println("Ukuran adult : 41-44");
        System.out.println("-------------------------");

        System.out.print("Masukkan Merek : ");
        String merek = sc.nextLine();

        System.out.print("Masukkan Kategori : ");
        String kategori = sc.nextLine();

        System.out.print("Masukkan Ukuran: ");
        int ukuran = sc.nextInt();

        int harga = 0;

        if (merek.equalsIgnoreCase("Converse")) {
            if (kategori.equalsIgnoreCase("Slip On") && (ukuran >= 36 && ukuran <= 40)) {
                harga = 800000;
            } else if (kategori.equalsIgnoreCase("High Top") && (ukuran >= 40 && ukuran <= 44)) {
                harga = 1200000;
            }
        } else if (merek.equalsIgnoreCase("Sketcher")) {
            if (kategori.equalsIgnoreCase("Woman") && (ukuran >= 36 && ukuran <= 41)) {
                harga = 1000000;
            } else if (kategori.equalsIgnoreCase("Man") && (ukuran >= 41 && ukuran <= 44)) {
                harga = 1800000;
            }
        } else if (merek.equalsIgnoreCase("Nike")) {
            if (kategori.equalsIgnoreCase("Kids") && (ukuran >= 36 && ukuran <= 40)) {
                harga = 750000;
            } else if (kategori.equalsIgnoreCase("Adult") && (ukuran >= 40 && ukuran <= 44)) {
                harga = 1500000;
            }
        }

        if (harga > 0) {
            System.out.println("Harga sepatu adalah: Rp " + harga);
        } else {
            System.out.println("Data tidak ditemukan. Silakan periksa input Anda.");
        }

        sc.close();
    }
}
