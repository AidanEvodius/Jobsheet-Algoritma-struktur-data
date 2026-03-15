import java.util.Scanner;
public class MainFaktorial8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Masukkan nilai yang akan dihitung faktorialnya: ");
        int n = sc.nextInt();
       Faktorial8 faktorial = new Faktorial8();
        int hasilBF = faktorial.faktorialBF(n);
        int hasilDC = faktorial.faktorialDC(n);
        System.out.println("Hasil faktorial dengan Brute Force: " + hasilBF);
        System.out.println("Hasil faktorial dengan Divide and Conquer: " + hasilDC);
        
        sc.close();
     }
      
    }
    
