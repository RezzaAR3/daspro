import java.util.Scanner;
public class Porseni06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Porseni 2024 ===");
        System.out.println("Host: Politeknik Negeri Malang");
        System.out.println("Cabang olahraga yang dipertandingkan: Badminton, Tenis Meja, Basket, Bola Voly");
        System.out.println();
        System.out.print("Masukkan jumlah cabang olahraga yang ingin diinput: ");
        int jumlahCabor = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= jumlahCabor; i++) {
            System.out.println("\n=== Cabang Olahraga " + i + " ===");
            System.out.print("Nama Cabang Olahraga: ");
            String namaCabor = sc.nextLine();
            System.out.println("Masukkan data untuk 5 atlet cabang olahraga " + namaCabor + ":");
            for (int j = 1; j <= 5; j++) {
                System.out.print("Atlet " + j + " - Nama: ");
                String namaAtlet = sc.nextLine();
                System.out.print("Atlet " + j + " - Asal Politeknik: ");
                String asalPoliteknik = sc.nextLine();
                System.out.println("Atlet " + j + " berhasil ditambahkan: "
                        + namaAtlet + " dari " + asalPoliteknik);
            }
            System.out.println("\nSelesai memasukkan atlet untuk cabang olahraga " + namaCabor + ".");
        }
        System.out.println("\n=== Data Porseni 2024 Telah Dimasukkan ===");
        System.out.println("Terima kasih atas partisipasi Anda!");
        sc.close();
    }
}
