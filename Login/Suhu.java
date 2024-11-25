import java.util.Scanner;
public class Suhu {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Suhu = ");
        int suhu = sc.nextInt();

        if (suhu < 16) {
            System.out.println("Gunakan Jaket");
        }
        else{
            System.out.println("Jangan Gunakan Jaket");
        }
    }
}
