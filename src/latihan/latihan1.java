package latihan;
import java.util.Scanner;
public class latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String jenis_Kendaraan;
        int tarif_Kendaraan, usia;
        double diskon, total_Bayar;
        System.out.println("Masukkan jenis kendaraan");
        jenis_Kendaraan = sc.nextLine();
        System.out.println("Masukkan usia");
        usia= sc.nextInt();
        switch (jenis_Kendaraan){
            case ("bus"):
                tarif_Kendaraan = 50000;
                System.out.println("tarif kendaraan Rp" +tarif_Kendaraan);
                if (usia<12) {
                    System.out.println("Penumpang anak-anak");
                    diskon = 0.3;
                } else if (usia>12 && usia < 59) {
                    System.out.println("Penumpang dewasa");
                    diskon = 0;
                }else {
                    System.out.println("Penumpang lansia");
                    diskon = 0.2;
                }
                diskon =tarif_Kendaraan*diskon;
                System.out.println("diskon" +diskon);
                total_Bayar=tarif_Kendaraan-diskon;
                System.out.println("total bayar" +total_Bayar);
            break;
            case ("kereta") :
                tarif_Kendaraan = 100000;
                System.out.println("tarif kendaraan Rp" +tarif_Kendaraan);
                 if (usia<12) {
                    System.out.println("Penumpang anak-anak");
                    diskon = 0.3;
                } else if (usia>12 && usia < 59) {
                    System.out.println("Penumpang dewasa");
                    diskon = 0;
                }else {
                    System.out.println("Penumpang lansia");
                    diskon = 0.2;
                }
                diskon =tarif_Kendaraan*diskon;
                System.out.println("diskon" +diskon);
                total_Bayar=tarif_Kendaraan-diskon;
                System.out.println("total bayar" +total_Bayar);
            break;
            case ("pesawat") :
                tarif_Kendaraan = 500000;
                System.out.println("tarif kendaraan Rp" +tarif_Kendaraan);
                 if (usia<12) {
                    System.out.println("Penumpang anak-anak");
                    diskon = 0.3;
                } else if (usia>12 && usia < 59) {
                    System.out.println("Penumpang dewasa");
                    diskon = 0;
                }else {
                    System.out.println("Penumpang lansia");
                    diskon = 0.2;
                }
                diskon =tarif_Kendaraan*diskon;
                System.out.println("diskon" +diskon);
                total_Bayar=tarif_Kendaraan-diskon;
                System.out.println("total bayar" +total_Bayar);
            break;
        default:
            System.out.println("tidak tersedia jenis kendaraan");
        }
        



    }
}
