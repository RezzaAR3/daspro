import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        String storedUsername = "rezza3";
        String storedPassword = "rezza357";

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String usn = sc.nextLine();

        System.out.print("Masukkan password: ");
        String psw = sc.nextLine();

        if (usn.equals(storedUsername) && psw.equals(storedPassword)) {
            System.out.println("Pengguna dapat masuk ke dalam sistem");
        } else {
            System.out.println("User dan password salah");
        }

    }
}
