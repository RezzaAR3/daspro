import java.util.Scanner;
public class Cicilan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double harga, kredit, uang_muka, persentase_uang_muka, sisa_cicilan, bulanan, harga_kredit;
        System.out.println(" ");

        System.out.print("Masukkan Harga Laptop = ");
        harga = sc.nextInt();

        System.out.print("Masukkan Persentase Harga Kredit = ");
        kredit = sc.nextInt();

        System.out.print("Masukkan Persentase Uang Muka = ");
        persentase_uang_muka = sc.nextInt();
        System.out.println(" ");

        harga_kredit = harga + (kredit / 100 * harga);
        uang_muka = persentase_uang_muka / 100 * harga_kredit;
        sisa_cicilan = harga_kredit - uang_muka;
        bulanan = sisa_cicilan / 12;

        System.out.println("Harga Kredit = "+harga_kredit);
        System.out.println("Uang muka = "+uang_muka);
        System.out.println("Sisa Cicilan = "+sisa_cicilan);
        System.out.println("Cicilan Bulanan = "+bulanan);
    }
}