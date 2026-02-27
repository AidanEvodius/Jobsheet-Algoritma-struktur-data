public class matakuliah8 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    // Konstruktor default
    public matakuliah8() {
    }

    // Konstruktor berparameter
    public matakuliah8(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilinformasi(){
        System.out.println("Kode MK    : " + kodeMK);
        System.out.println("Nama MK    : " + nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);

    }
    void ubahSKS(int SKSBaru){
        sks = SKSBaru;
        System.out.println("SKS berhasil diubah menjadi " + sks);
    }
    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jam ditambahkan. Total jam sekarang: " + jumlahJam);
    }

    void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Pengurangan jam berhasil. Total jam sekarang: " + jumlahJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan. Jumlah jam tidak mencukupi!");
        }
    }
}