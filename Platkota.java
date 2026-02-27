import java.util.Scanner;

public class Platkota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] KODE = {'A','B','D','E','F','G','H','L','N','T'};
        String[][] KOTA = {
            {"Banten"}, {"Jakarta"}, {"Bandung"}, {"Cirebon"},
            {"Bogor"}, {"Pekalongan"}, {"Semarang"},
            {"Surabaya"}, {"Malang"}, {"Purwakarta"}
        };

        System.out.print("Masukkan kode plat: ");
        char input = sc.next().toUpperCase().charAt(0);

        boolean ditemukan = false;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == input) {
                System.out.println("Kota: " + KOTA[i][0]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode tidak ditemukan");
        }
        sc.close();
    }
}
