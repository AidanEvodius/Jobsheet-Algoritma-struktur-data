import java.util.Scanner;
public class DosenDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = sc.nextInt();

        Dosen08[] arrayofDosen = new Dosen08[jumlahDosen];
          for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("\nData Dosen ke-" + (i + 1));

            System.out.print("Kode: ");
            String kode = sc.nextLine();

            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (true=Pria, false=Wanita): ");
            boolean jk = sc.nextBoolean();

            System.out.print("Usia: ");
            int usia = sc.nextInt();
            sc.nextLine();

            arrayofDosen[i] = new Dosen08(kode, nama, jk, usia);
    }
        DataDosen08 data = new DataDosen08();
        System.out.println("\n=== DATA DOSEN ===");
        data.dataSemuaDosen(arrayofDosen);
           System.out.println("\n===== JUMLAH DOSEN PER JENIS KELAMIN =====");
        data.jumlahDosenPerJenisKelamin(arrayofDosen);

        System.out.println("\n===== RERATA USIA DOSEN PER JENIS KELAMIN =====");
        data.rerataUsiaDosenPerJenisKelamin(arrayofDosen);

        data.infoDosenPalingTua(arrayofDosen);
        data.infoDosenPalingMuda(arrayofDosen);


        sc.close();

}

}
