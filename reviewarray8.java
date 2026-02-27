import java.util.Scanner;

public class reviewarray8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah Mata Kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] matkul = new String[n];
        int[] sks = new int[n];
        String[] nilaiHuruf = new String[n];

        double totalNilai = 0;
        int totalSKS = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Mata Kuliah ke-" + (i + 1));
            System.out.print("Nama MK: ");
            matkul[i] = sc.nextLine();
            System.out.print("SKS: ");
            sks[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Nilai Huruf: ");
            nilaiHuruf[i] = sc.nextLine();

            double nilaiSetara = konversiNilai(nilaiHuruf[i]);
            totalNilai += nilaiSetara * sks[i];
            totalSKS += sks[i];
        }

        double ip = totalNilai / totalSKS;
        System.out.println("IP Semester = " + ip);
    }

    static double konversiNilai(String nilai) {
        switch (nilai.toUpperCase()) {
            case "A": return 4.0;
            case "B+": return 3.5;
            case "B": return 3.0;
            case "C+": return 2.5;
            case "C": return 2.0;
            case "D": return 1.0;
            default: return 0.0;
            
        }
        
    } 
        
}


