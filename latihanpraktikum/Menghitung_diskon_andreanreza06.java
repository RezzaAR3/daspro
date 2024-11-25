import java.util.Scanner;
/**
 * Menghitung_diskon_andreanreza06
 */
public class Menghitung_diskon_andreanreza06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double Harga, Diskon, Persentase, Bayar;
        System.out.println(" ");

        System.out.print("Masukkan harga = ");
        Harga = sc.nextInt();

        System.out.print("Masukkan diskon = ");
        Diskon = sc.nextInt();
        System.out.println(" ");

        Persentase = Diskon / 100 * Harga;
        System.out.println("Persentase Diskon = "+Persentase);
        
        Bayar = Harga - Persentase;
        System.out.println("Jumlah yang harus di bayar = RP. "+Bayar);
        System.out.println(" ");

    }
}