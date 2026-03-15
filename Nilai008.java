public class Nilai008 {
 Mahasiswa008[] mhs;
    int jumlah;

    Nilai008(int jumlah){
        this.jumlah = jumlah;
        mhs = new Mahasiswa008[jumlah];
    }

    // ===============================
    // UTS TERTINGGI (Divide and Conquer)
    // ===============================
    int maxUTS(int l, int r){

        if(l == r){
            return mhs[l].nilaiUTS;
        }

        int mid = (l + r) / 2;

        int lmax = maxUTS(l, mid);
        int rmax = maxUTS(mid + 1, r);

        if(lmax > rmax){
            return lmax;
        } else {
            return rmax;
        }
    }

    // ===============================
    // UTS TERENDAH (Divide and Conquer)
    // ===============================
    int minUTS(int l, int r){

        if(l == r){
            return mhs[l].nilaiUTS;
        }

        int mid = (l + r) / 2;

        int lmin = minUTS(l, mid);
        int rmin = minUTS(mid + 1, r);

        if(lmin < rmin){
            return lmin;
        } else {
            return rmin;
        }
    }

    // ===============================
    // RATA-RATA UAS (Brute Force)
    // ===============================
    double rataUAS(){

        int total = 0;

        for(int i = 0; i < jumlah; i++){
            total += mhs[i].nilaiUAS;
        }

        return (double) total / jumlah;
    }
}
