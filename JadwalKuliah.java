import java.util.Scanner;

public class JadwalKuliah {
    static Scanner sc = new Scanner(System.in);

    static void inputJadwal(String[][] jadwal, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Jadwal ke-" + (i + 1));
            for (int j = 0; j < 4; j++) {
                jadwal[i][j] = sc.nextLine();
            }
        }
    }

    static void tampilSemua(String[][] jadwal) {
        for (String[] j : jadwal) {
            System.out.println(j[0] + " | " + j[1] + " | " + j[2] + " | " + j[3]);
        }
    }

    static void tampilHari(String[][] jadwal, String hari) {
        for (String[] j : jadwal) {
            if (j[2].equalsIgnoreCase(hari)) {
                System.out.println(j[0] + " | " + j[3]);
            }
        }
    }

    static void tampilMatkul(String[][] jadwal, String mk) {
        for (String[] j : jadwal) {
            if (j[0].equalsIgnoreCase(mk)) {
                System.out.println(j[1] + " | " + j[2] + " | " + j[3]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Jumlah Jadwal: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, n);
        tampilSemua(jadwal);
    }
}
