import java.util.Scanner;
public class Usia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ua, ub, uc, ud;

        System.out.print("Usia budi = ");
        ub = sc.nextInt();
        System.out.println(" ");

        ua = ub + 8;
        uc = ub + 5;
        ud = (ua + ub) / 2;
        System.out.println("Usia Andi = "+ua);
        System.out.println("Usia Candra = "+uc);
        System.out.println("Usia Deni = "+ud);
    }
}