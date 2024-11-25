import java.util.Scanner;
public class Pohon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p, l, k, jp, j;

        System.out.print("Panjang Tanah = ");
        p = sc.nextInt();
        System.out.print("Lebar Tanah = ");
        l = sc.nextInt();
        System.out.print("Jarak Antar Pohon = ");
        j = sc.nextInt();
        System.out.println(" ");

        k = 2 * (p + l);
        jp = k / j;
        System.out.println("Keliling Tanah Kampus = "+k);
        System.out.println("Jumlah Pohon Yang Akan Ditanam = "+jp);
    }
}