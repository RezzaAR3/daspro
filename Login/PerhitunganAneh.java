public class PerhitunganAneh {
    public int angka;

    public static void main(String[] args) {
        PerhitunganAneh an = new PerhitunganAneh();

        try{
            an.angka = 100;
        int hasil;
        hasil = an.angka/0;

        System.out.println("Hasilnya adalah = "+hasil);
        } catch (Exception e) {
            System.out.println("ERROR GOBLOK");
        }
    }
}
