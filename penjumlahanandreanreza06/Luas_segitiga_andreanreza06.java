import java.util.Scanner;
/**
 * Luas_segitiga_andreanreza06
 */
public class Luas_segitiga_andreanreza06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double alas, tinggi, Luas_segitiga;

        System.out.print("masukan nilai alas = ");
        alas = sc.nextDouble();

        System.out.print("masukan nilai tinggi = ");
        tinggi = sc.nextDouble();

        Luas_segitiga = 0.5 * (alas * tinggi);

        System.out.println("nilai alas ="+alas);
        System.out.println("nilai tinggi = "+tinggi);
        System.out.println("nilai luas segitiga = "+Luas_segitiga);
    }
}