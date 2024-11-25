import java.util.Scanner;
public class waktu {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jam, menit, detik;

        System.out.println("Masukkan Waktu Dalam Jam = ");
        jam = sc.nextInt();

        menit = jam * 60;
        detik = menit * 60;

        System.out.println("Jam = "+jam);
        System.out.println("Menit = "+menit);
        System.out.println("Detik = "+detik);
    }
}
