import java.util.Scanner;

public class Supermarket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kg, pcs, liter, total_beras, total_mie, total_minyak, total;
        int beras = 12000, mie = 3000, minyak = 20000;
        System.out.println(" ");

        System.out.print("Masukkan Jumlah Beras (kg) = ");
        kg = sc.nextInt();

        System.out.print("Masukkan Jumlah Mie Instan (pcs) = ");
        pcs = sc.nextInt();

        System.out.print("Masukkan Jumlah Minyak Goreng (liter) = ");
        liter = sc.nextInt();
        System.out.println(" ");

        total_beras = kg * beras;
        total_mie = pcs * mie;
        total_minyak = liter * minyak;
        total = total_beras + total_mie + total_minyak;

        System.out.println("Detail Belanja:");
        System.out.println("Total Beras = RP."+total_beras);
        System.out.println("Total Mie Instan = RP."+total_mie);
        System.out.println("Total Minyak Goreng = RP."+total_minyak);
        System.out.println("Total Belanja Keseluruhan = RP."+total);
    }
}