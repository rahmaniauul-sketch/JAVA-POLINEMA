package latihan;
import java.util.Scanner;
public class latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int waktu, tarif, kode_Jenis_Kendaraan, biaya_parkir;
        System.out.println("----Jenis Kendaraan----");
        System.out.println("1. Motor");
        System.out.println("2. Mobil");
        System.out.println("3. Bus");
        System.out.print("Masukkan kode jenis kendaraan :");
        kode_Jenis_Kendaraan= sc.nextInt();
        System.out.print("Masukkan waktu :");
        waktu = sc.nextInt();
        switch (kode_Jenis_Kendaraan) {
            case (3):
                System.out.println("jenis kendaraan : bus");
                if (waktu <2) {
                    tarif = 10000;
                    biaya_parkir = waktu*tarif;
                    System.out.println("biaya parkir Rp" +biaya_parkir );
                }else{
                    if (waktu == 2) {
                    tarif  = 20000;
                    biaya_parkir = waktu*tarif;
                    System.out.println("biaya parkir Rp" +biaya_parkir );
                    }
                }
                break;
            case (2):
                System.out.println("jenis kendaraan : mobil");
                if (waktu <2) {
                    tarif = 5000;
                    biaya_parkir = waktu*tarif;
                    System.out.println("biaya parkir Rp" +biaya_parkir );
                    
                }else {
                    if (waktu == 2) {
                    tarif = 10000;
                    biaya_parkir = waktu*tarif;
                    System.out.println("biaya parkir Rp" +biaya_parkir );
                    }
                }
            break;
            case (1) :
                System.out.println("jenis kendaraan : motor");
                if (waktu < 2) {
                    tarif = 3000;
                    biaya_parkir = waktu*tarif;
                    System.out.println("biaya parkir Rp" +biaya_parkir );
                    
                } else {
                    if (waktu == 2) {
                    tarif = 5000;
                    biaya_parkir = waktu*tarif;
                    System.out.println("biaya parkir Rp" +biaya_parkir );
                    }
                }
            break;
            default:
                System.out.println("jenis kendaraan tidak tersedia");

        }
    }
}
