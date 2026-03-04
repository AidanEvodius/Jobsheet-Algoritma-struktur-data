public class matakuliahmain8 {
    public static void main(String[] args) {

        matakuliah8 mk1 = new matakuliah8();
        mk1.kodeMK = "IF101";
        mk1.nama = "Algoritma";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilinformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);

        matakuliah8 mk2 = new matakuliah8("IF202", "Struktur Data", 3, 6);
        mk2.tampilinformasi();
    }
}



    
   