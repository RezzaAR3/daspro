import java.util.Scanner;
/**
 * Lahan_tidak_ditanam_bunga_andreanreza06
 */
public class Lahan_tidak_ditanam_bunga_andreanreza06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double s, p, r, Luas_persegi, Luas_lingkaran, Luas_diarsir;
        System.out.println(" ");

        System.out.print("Nilai sisi = ");
        s = sc.nextDouble();

        System.out.print("Nilai jari-jari = ");
        r = sc.nextDouble();

        p = 3.14;
        System.out.println("Nilai Phi = "+p);
        System.out.println(" ");

        Luas_persegi = s * s;
        Luas_lingkaran = p * r * r;
        Luas_diarsir = Luas_persegi - Luas_lingkaran;

        System.out.println("Luas persegi = "+Luas_persegi);
        System.out.println("Luas lingkaran = "+Luas_lingkaran);
        System.out.println("Luas diarsir = "+Luas_diarsir);
        System.out.println(" ");

        System.out.print("Jadi, luas lahan pak ahmad, yang tidak di tanami bunga adalah "+Luas_diarsir);
        System.out.println(" CM");
        System.out.println(" ");
    }
}