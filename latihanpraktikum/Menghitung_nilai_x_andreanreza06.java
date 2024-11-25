import java.util.Scanner;
/**
 * Menghitung_nilai_x_andreanreza06
 */
public class Menghitung_nilai_x_andreanreza06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, Nilai_x;
        System.out.println(" ");

        System.out.println("Hitunglah Nilai X dari Persamaan X = 2(a * a) + ab + c");
        System.out.println(" ");

        System.out.println("Diketahui : ");
        System.out.print("Nilai a = ");
        a = sc.nextInt();

        System.out.print("Nilai b = ");
        b = sc.nextInt();

        System.out.print("Nilai c = ");
        c = sc.nextInt();
        System.out.println(" ");

        Nilai_x = 2 * (a * a) + (a * b) + c;

        System.out.println("Persamaan Nilai X = "+Nilai_x);
        System.out.println(" ");
    }
}