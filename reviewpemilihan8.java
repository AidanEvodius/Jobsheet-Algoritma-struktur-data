import java.util.Scanner;
public class reviewpemilihan8 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
            System.out.print("Nilai Tugas : ");
                double tugas = sc.nextDouble();
            System.out.print("Nilai Kuis : ");
                double kuis = sc.nextDouble();
            System.out.print("Nilai UTS : ");
                double uts = sc.nextDouble();
            System.out.print("Nilai UAS : ");
                double uas = sc.nextDouble();

        
             if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 ||
            uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("nilai tidak valid");
            sc.close();
            return;
                
        }
        
        double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);

        String nilaiHuruf;
        if (nilaiAkhir >= 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 75) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir >= 70) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        String status = (nilaiHuruf.equals("D") || nilaiHuruf.equals("E"))
                ? "TIDAK LULUS"
                : "LULUS";

        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
        System.out.println("Status      : " + status);
    
                sc.close();
    }
    

}
