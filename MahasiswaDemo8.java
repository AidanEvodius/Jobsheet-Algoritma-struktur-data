import java.util.Scanner;
public class MahasiswaDemo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa8[] arrayofMahasiswa = new Mahasiswa8[3];
          for (int i = 0; i < arrayofMahasiswa.length; i++) {
            arrayofMahasiswa[i] = new Mahasiswa8();

            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            arrayofMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama: ");
            arrayofMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas: ");
            arrayofMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK: ");
            arrayofMahasiswa[i].ipk = sc.nextDouble();
            sc.nextLine(); 

          }
             System.out.println("\n=== DATA MAHASISWA ===");
        for (Mahasiswa8 mhs : arrayofMahasiswa) {
            mhs.cetakInfo();

        }
        sc.close();
    }

}

