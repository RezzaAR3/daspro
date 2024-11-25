import java.util.Scanner;
public class Nilai06 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String name = sc.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();

        System.out.print("Masukkan kelas: ");
        String kelas = sc.nextLine();

        System.out.print("Masukkan nomor absen: ");
        int absen = sc.nextInt();

        System.out.print("Masukkan nilai kuis: ");
        double quizScore = sc.nextDouble();

        System.out.print("Masukkan nilai tugas: ");
        double assignmentScore = sc.nextDouble();

        System.out.print("Masukkan nilai ujian: ");
        double examScore = sc.nextDouble();

        double finalScore = (quizScore + assignmentScore + examScore) / 3;

        String grade;
        double gpa;
        String qualification;

        if (finalScore >= 80 && finalScore <= 100) {
            grade = "A";
            gpa = 4.0;
            qualification = "Sangat Baik";
        } else if (finalScore >= 73 && finalScore < 80) {
            grade = "B+";
            gpa = 3.5;
            qualification = "Lebih dari Baik";
        } else if (finalScore >= 65 && finalScore < 73) {
            grade = "B";
            gpa = 3.0;
            qualification = "Baik";
        } else if (finalScore >= 60 && finalScore < 65) {
            grade = "C+";
            gpa = 2.5;
            qualification = "Lebih dari Cukup";
        } else if (finalScore >= 50 && finalScore < 60) {
            grade = "C";
            gpa = 2.0;
            qualification = "Cukup";
        } else if (finalScore >= 39 && finalScore < 50) {
            grade = "D";
            gpa = 1.0;
            qualification = "Kurang";
        } else {
            grade = "E";
            gpa = 0.0;
            qualification = "Gagal";
        }

        System.out.println("\nMahasiswa dengan nama " + name + " (NIM " + nim + ") kelas " + kelas + " nomor absen " + absen);
        System.out.printf("Nilai akhir: %.2f\n", finalScore);
        System.out.println("Nilai akhir huruf: " + grade);
        System.out.println("Kualifikasi: " + qualification);

        sc.close();
    }
}
