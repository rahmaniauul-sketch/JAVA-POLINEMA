package PERTEMUAN7;
import java.util.Scanner;
public class Studikasus2_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jenisKegiatan, perlombaan, programKreativitasMahasiswa;
        String penyelenggara, namaMahasiswa;
        int peringkatJuara, statusPendanaanPKM, jumlahDokumen, kurangDokumen;
        boolean isPerlombaan = false, isprogramKreativitasMahasiswa = false;
        System.err.println("Masukkan nama mahasiswa");
        namaMahasiswa = sc.nextLine();
        System.out.println(" masukkan jenis kegiatan");
        jenisKegiatan = sc.nextLine();
        if (jenisKegiatan.equals("perlombaan")) {
                
                System.out.println("masukkan penyelenggara BELMAWA/BAKORMA/MANDIRI");
                penyelenggara = sc.nextLine();
                System.out.println("masukkan peringkat juara");
                peringkatJuara = sc.nextInt();
                    if (penyelenggara.equals("BELMAWA")|| penyelenggara.equals("BARKOMA")|| penyelenggara.equals("MANDIRI")) {
                        if (peringkatJuara <=3 && peringkatJuara >=1 ) { 
                            System.out.println("dana penghargaan diberikan karena penyelenggara dan peringkat juara sesuai ");
                            isPerlombaan = true;
                        }
                } else {
                    System.out.println("dana penghargaan tidak diberikan karena penyelenggara dan peringkat juara tidak sesuai ");
                            isPerlombaan = false;
                
            if (jenisKegiatan.equals("programKreativitasMahasiswa")) {
                System.out.println("masukkan status pendanaan PKM (1/0)");
                statusPendanaanPKM = sc.nextInt();
                    if (statusPendanaanPKM == 1) {
                    System.out.println("lolos");
                    isprogramKreativitasMahasiswa = true;
                    }else {
                    System.out.println("tidak lolos");
                    isprogramKreativitasMahasiswa = false;
         } 
        } else {
             System.out.println("tidak memperoleh dana penghargaan karena status pendanaan tidak sesuai");
        }
    }       if (isPerlombaan || isprogramKreativitasMahasiswa);
                System.err.println("masukkan jumlah dokumen");
                jumlahDokumen = sc.nextInt();
                if (jumlahDokumen<=4 && jumlahDokumen>0) {
                    System.out.println("dana penghargaan diberikan karena jumlah dokumen sesuai");
                } else {
                    System.out.println("dana penghargaan tidak diberikan karena jumlah dokumen tidak sesuai");
                    kurangDokumen = 4-jumlahDokumen;
                    System.out.println("kurang dokumen" +kurangDokumen);
                    

                }
            
                    
        }
    
    }
}

    

