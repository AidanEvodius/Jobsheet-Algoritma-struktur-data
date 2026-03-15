import java.util.Scanner;
public class MainPangkat8 { 
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = sc.nextInt();
        Pangkat8[] pangkat = new Pangkat8[elemen];

        for (int i=0;i<elemen;i++){

            System.out.print("Masukkan nilai yang dipangkatkan: ");
            int nilai = sc.nextInt();

            System.out.print("Masukkan nilai pangkat: ");
            int pangkatNilai = sc.nextInt();
            pangkat[i] = new Pangkat8(nilai, pangkatNilai);
        }
         for(int i=0;i<elemen;i++){

            System.out.println("Hasil BF: "
                    + pangkat[i].pangkatBF(pangkat[i].nilai, pangkat[i].pangkat));

            System.out.println("Hasil DC: "
                    + pangkat[i].pangkatDC(pangkat[i].nilai, pangkat[i].pangkat));
        }
        sc.close();
    } 
}
