public class DataDosen08 {

    void dataSemuaDosen(Dosen08[] arrayofDosen) {
        for (Dosen08 dosen : arrayofDosen) {
            dosen.cetakInfo();
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen08[] arrayofDosen) {
       int pria = 0, wanita = 0;
       for (Dosen08 dosen : arrayofDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria: " + pria);
        System.out.println("Jumlah Dosen Wanita: " + wanita);
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen08[] arrayofDosen08) {
        int totalpria = 0, totalwanita = 0;
        int countpria = 0, countwanita = 0;
        for (Dosen08 dosen : arrayofDosen08) {
            if (dosen.jenisKelamin) {
                totalpria += dosen.usia;
                countpria++;
            } else {
                totalwanita += dosen.usia;
                countwanita++;
            }
        }
    
          if (countpria > 0) {
            System.out.println("Rerata Usia Dosen Pria: " + (totalpria / countpria));
          } else {
            System.out.println("Tidak ada dosen pria.");
          }
          if (countwanita > 0) {
            System.out.println("Rerata Usia Dosen Wanita: " + (totalwanita / countwanita)); 
            } else {
            System.out.println("Tidak ada dosen wanita.");

          }

          }

          void infoDosenPalingTua(Dosen08[] arrayofDosen) {
            Dosen08 dosenTertua = arrayofDosen[0];

            for (Dosen08 dosen : arrayofDosen) {
                if (dosen.usia > dosenTertua.usia) {
                    dosenTertua = dosen;
                }
            }
             System.out.println("=== Dosen Paling Tua ===");
    dosenTertua.cetakInfo();
    }
            void infoDosenPalingMuda(Dosen08[] arrayofDosen) {
                Dosen08 dosenTermuda = arrayofDosen[0];

            for (Dosen08 dosen : arrayofDosen) {
                if (dosen.usia < dosenTermuda.usia) {
                    dosenTermuda = dosen;
                }
            }
             System.out.println("=== Dosen Paling Muda ===");
             dosenTermuda.cetakInfo();
            
        }

    }