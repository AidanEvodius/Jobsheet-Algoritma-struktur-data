import java.util.Scanner;
public class MataKuliahDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah Mata Kuliah: ");
        int jumlahMataKuliah = sc.nextInt();
        sc.nextLine();

        MataKuliah08[] arrayofMataKuliah = new MataKuliah08[jumlahMataKuliah];

         for (int i = 0; i < jumlahMataKuliah; i++) {
             System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode: ");
            String kode = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("SKS : ");
            int sks = sc.nextInt();
            System.out.print("Jam : ");
            int jam = sc.nextInt();
            sc.nextLine();

            arrayofMataKuliah[i] = new MataKuliah08(kode, nama, sks, jam);
         }
            System.out.println("\n=== DATA MATA KULIAH ===");
            for (MataKuliah08 mk : arrayofMataKuliah) {
                mk.cetakInfo();
            }
        sc.close();
            
    }
}