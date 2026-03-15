
import java.util.Scanner;
public class MainLatihan008 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        sc.nextLine();

        Nilai008 data = new Nilai008(n);

        for(int i = 0; i < n; i++){

            System.out.println("\nData mahasiswa ke-" + (i+1));

            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("Nilai UTS: ");
            int uts = sc.nextInt();

            System.out.print("Nilai UAS: ");
            int uas = sc.nextInt();
            sc.nextLine();

            data.mhs[i] = new Mahasiswa008(nama, uts, uas);
        }
        System.out.println("\n===== HASIL =====");
        int maxUTS = data.maxUTS(0, n-1);
        int minUTS = data.minUTS(0, n-1);
        double rataUAS = data.rataUAS();
        System.out.println("Nilai UTS Tertinggi (Divide and Conquer): " + maxUTS);
        System.out.println("Nilai UTS Terendah (Divide and Conquer): " + minUTS);
        System.out.println("Rata-rata Nilai UAS (Brute Force): " + rataUAS);
    }  
    
}