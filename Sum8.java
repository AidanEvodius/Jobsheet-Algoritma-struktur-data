public class Sum8 {
 int keuntungan[];
    int elemen;
    Sum8(int elemen){
        this.elemen = elemen;
        keuntungan = new int[elemen];
    }
    int totalBF(){
        int total = 0;
        for(int i=0;i<elemen;i++){
            total = total + keuntungan[i];
        }
        return total;
    }
    int totalDC(int l, int r){
        if(l==r){
            return keuntungan[l];
        }

        int mid = (l+r)/2;

        int lsum = totalDC(l,mid);
        int rsum = totalDC(mid+1,r);

        return lsum + rsum;
    }
}

