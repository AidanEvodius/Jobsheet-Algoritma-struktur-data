public class dosen8 {

    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangkeahlian;

    public dosen8() {
    }
     public dosen8(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangkeahlian = bidangKeahlian;


     }

     void tampilinformasi(){
        System.out.println("ID Dosen    : " + idDosen);
        System.out.println("Nama Dosen  : " + nama);
        System.out.println("Status Aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangkeahlian);

     }
        void ubahStatusAktif(boolean statusBaru) {
            statusAktif = statusBaru;
            System.out.println("Status berhasil diubah.");

        }

         int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        bidangkeahlian = bidang;
        System.out.println("Bidang keahlian berhasil diubah.");

    }
}
