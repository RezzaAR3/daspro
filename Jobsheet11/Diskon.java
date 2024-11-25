import java.util.Scanner;
public class Diskon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        String jenisBuku = sc.nextLine().toLowerCase();

        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = sc.nextInt();

        double diskon = 0.0;
        double diskonTambahan = 0.0;

        if (jenisBuku.equals("kamus")) {
            diskon = 10.0;
            if (jumlahBuku > 2) {
                diskonTambahan = 2.0;
            }
        } else if (jenisBuku.equals("novel")) {
            diskon = 7.0;
            if (jumlahBuku > 3) {
                diskonTambahan = 2.0;
            } else {
                diskonTambahan = 1.0;
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 5.0;
            }
        }

        double totalDiskon = diskon + diskonTambahan;

        System.out.println("Total diskon yang didapat: " + totalDiskon + "%");

        sc.close();
    }
}
