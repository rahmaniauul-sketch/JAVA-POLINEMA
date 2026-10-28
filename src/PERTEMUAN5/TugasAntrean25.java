package PERTEMUAN5;

import java.util.Scanner;

public class TugasAntrean25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kodelayanan;
        kodelayanan = sc.nextInt();
        switch (kodelayanan) {
            case (1):
                System.err.println("Legalisir ijazah : loket A");
            break;
            case (2):
                System.err.println("Surat Keterangan aktif kuliah : loket B");
            break;
            case (3):
                System.err.println("Pembayaran UKT : loket C");
                break;
            case (4):
                System.out.println("Pengajuan Cuti akademik : loket D");
                break;
            default:
                System.err.println("Kode Layanan tidak tersedia");
        }
    }
    
}
