import java.util.Scanner;
public class SiakadFor06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, terendah = 100, tertinggi = 0;

        for (int i = 1; i <= 5; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi){
                tertinggi = nilai;
            }
            if (nilai < terendah){
                terendah = nilai;
            }
        }
        System.out.println("Nilai Tertinggi: " +tertinggi);
        System.out.println("Nilai Terendah: " +terendah);

        sc.close();
    }
}