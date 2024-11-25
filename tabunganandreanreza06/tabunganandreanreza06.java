import java.util.Scanner;
public class tabunganandreanreza06 {
public static void main(String[] args) {
    Scanner dari_user = new Scanner(System.in);

    int jml_tabungan_awal, lama_menabung;
    double presentase_bunga =0.02, bunga, jml_tabungan_akhir;

    System.out.print("Jumlah Tabungan Awal = ");
    jml_tabungan_awal = dari_user.nextInt();

    System.out.print("Lama Menabung = ");
    lama_menabung = dari_user.nextInt();

    bunga= lama_menabung*presentase_bunga*jml_tabungan_awal;
    jml_tabungan_akhir= bunga+jml_tabungan_awal;

    System.out.println("Bunga adalah = " +bunga);
    System.out.println("Jumlah tabungan akhir anda adalah = " +jml_tabungan_akhir);
}
    
}