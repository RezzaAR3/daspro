import java.util.Scanner;
/**
 * penjumlahanandreanreza06
 */
public class penjumlahanandreanreza06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, hasil_jumlah;

        System.out.print("Masukkan nilai a = ");
        a = sc.nextInt();

        System.out.print("Masukkan nilai b = ");
        b = sc.nextInt();

        hasil_jumlah = a+b;

        System.out.println("Hasil penjumlahan = "+hasil_jumlah);
    }
}