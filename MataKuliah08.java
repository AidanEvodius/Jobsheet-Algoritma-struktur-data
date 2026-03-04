public class MataKuliah08 {
        String kode;
        String nama;
        int sks;
        int jam;


        public MataKuliah08(String kode, String nama, int sks, int jam) {
            this.kode = kode;
            this.nama = nama;
            this.sks = sks;
            this.jam = jam;
        }

        void cetakInfo() {
        System.out.println("Kode : " + kode);
        System.out.println("Nama : " + nama);
        System.out.println("SKS  : " + sks);
        System.out.println("Jam  : " + jam);
        System.out.println("-------------------");

}

}