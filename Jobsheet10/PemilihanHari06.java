import java.util.Scanner;
public class PemilihanHari06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayname, daytype;

        System.out.print("Input Day Name: ");
        dayname = sc.nextLine();

        switch (dayname.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                daytype = "weekday";
                break;
            case "saturday":
            case "sunday":
                daytype = "weekend";
            default:
                daytype = "invalid day name";
        }

        System.out.println(dayname + " is a " + daytype);
        sc.close();
    }
}
