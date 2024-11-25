public class PersegiPanjang {
    public int panjang;
    public int lebar;

    public int keliling(){
        int hasil;
        hasil = 2 * (panjang + lebar);
        return hasil;
    }

    public int luas(){
        int hasil;
        hasil = panjang * lebar;
        return hasil;
    }

    public static void main(String[] args) {
        PersegiPanjang pj = new PersegiPanjang();
        pj.lebar = 5;
        pj.panjang = 13;

        System.out.println("Hasil dari luas = "+pj.luas());
        System.out.println("Hasil keliling = "+pj.keliling());

    }
}