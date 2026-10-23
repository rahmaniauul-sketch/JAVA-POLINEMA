package QUIZ;

import java.util.Scanner;

/*P = 25
tarif per jam kode 1 motor =  2000 + (25 % 4) x 500 = 2500
tarif per jam kode 2 mobil = 5000 + (25 % 4) x 500 = 5500
tarif per jam kode 3 truk = 10000 + ( 25 % 4) x 500 = 10500
B = 2 + (25 % 3) = 3
S = 6 + (25 % 4) = 7 */
public class ParkirGedung25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kode_Kendaraan, jam, biaya_Dasar;
        String hari_Libur;
        double diskon, biaya_tambahan;
        System.out.print("Masukkan kode kendaraan : ");
        kode_Kendaraan = sc.nextInt();
        System.out.print("Masukkan jam :");
        jam = sc.nextInt();
        System.out.println("Apakah hari libur ? (ya/tidak)");
        hari_Libur = sc.nextLine();
        if (jam >1 && jam <24) {
            kode_Kendaraan = 1;
        }else {
            System.out.println("Input tidak valid");
        }
        switch (kode_Kendaraan) {
            case 1:
                System.out.println("kendaraan motor");
                if (jam <=3) {
                    biaya_Dasar = 2500;
                    System.out.println("tarif Rp" + biaya_Dasar);
                }else if (jam>3 && jam <24) {
                    biaya_tambahan= 2500 + (jam*1000);
                }else if (hari_Libur.equalsIgnoreCase("libur") || jam >7) {
                    biaya_tambahan = (2500*0.1) + 1000;
                    System.out.println("biaya tambahan" +biaya_tambahan);
                }
                break;
                case 2:
                    System.out.println("kendaraan mobil");
                if (jam <=3) {
                    biaya_Dasar = 5500;
                    System.out.println("tarif Rp" + biaya_Dasar);
                }else if (jam>3 && jam <24) {
                    biaya_tambahan= 5500 + (jam*1000);
                    System.out.println("biaya tambahan" +biaya_tambahan);
                }else if (hari_Libur.equalsIgnoreCase("libur") || jam >7) {
                    biaya_tambahan = (5500*0.1) + 1000;
                }
                break;
                case 3:
                    System.out.println("kendaraan truk");
                    if (jam <=3) {
                    biaya_Dasar = 10500;
                    System.out.println("tarif Rp" + biaya_Dasar);
                }else if (jam>3 && jam <24) {
                    biaya_tambahan= 10500 + (jam*1000);
                }else if (hari_Libur.equalsIgnoreCase("libur") || jam >7) {
                    biaya_tambahan = (10500*0.1) + 1000;
                }
                break;
            default:
                System.out.println("kode tidak dikenal");
                
        }

    }
}
