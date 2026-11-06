/*PARAMETER UNIK : 25
Jumlah kelompok : 2 +(25%3) = 3
Jumlah Penilai : 3 + (25%2) = 4
 */
package pertemuan10;
import java.util.Scanner;
public class NilaiKelompok25 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah kelompok : ");
    int jumlahkelompok = sc.nextInt();
    System.out.print("Masukkan jumlah penilai : ");
    int jumlahpenilai = sc.nextInt();
    if (jumlahkelompok <= 0 || jumlahpenilai <=0) {
        System.out.println("Jumlah kelompok dan penilai harus > 0. ");
    }else {
        int nomorkelompok =1;
        double ratatertinggi = -1;
        int kelompokterbaik = 0;
        while (nomorkelompok <= jumlahkelompok) {
            System.out.println("kelompok " +nomorkelompok);
            double totalnilai = 0;
                for (int j = 1; j <= jumlahpenilai; j++) {
                int nilai;
                    do {
                    System.out.print(" Nilai dari penilai " + j + " : ");
                    nilai = sc.nextInt();
                    if (nilai < 0 || nilai > 100) {
                        System.out.println(" Nilai harus 0-100. Ulangi input!");
                    }
                    } while (nilai < 0 || nilai > 100);
                    totalnilai += nilai;
                    }
                
                double ratanilai = totalnilai / jumlahpenilai;
                System.out.println("Kelompok " + nomorkelompok + ": nilai rata-rata = " + ratanilai);
        if (ratanilai > ratatertinggi) {
                ratatertinggi = ratanilai;
                kelompokterbaik = nomorkelompok;
               
            }
            nomorkelompok++;
        }
        System.out.println("=========================================");
        System.out.println("kelompok terbaik    : " + kelompokterbaik);
        System.out.println("rata-rata tertinggi : " + ratatertinggi);
    }
    
    }
}
