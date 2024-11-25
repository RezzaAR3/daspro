import java.io.Console;
public class Login2 {

    public static void main(String[] args) {
        Console cs = System.console();
        String username = "rezza3";
        String password = "rezza357";

        if (cs == null) {
            System.out.println("Console Tidak Tersedia");
            System.exit(0);
        }

        String usn = cs.readLine("Masukkan Username : ");
        
        char [] invisible = cs.readPassword("Masukkan Password : ");
        String psw = new String(invisible);

        if (usn.equals(username) && psw.equals(password)) {
            System.out.println("Berhasil");
        }
        else{
            System.out.println("Username atau Password alah");
        }
    }
}