import java.util.Scanner;
public class Login {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = "rezza3";
        String password = "rezza357";

        System.out.println("Username :");
        String usn = sc.nextLine();
        System.out.println("Pasword :");
        String psw = sc.nextLine();

        if (usn.equals(username) && psw.equals(password)) {
            System.out.println("Berhasil");
        }
        else{
            System.out.println("Username atau Password Salah");
        }
        sc.close();
    }
}