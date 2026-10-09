/*ALGORITMA :
1.input tarifJam, tarifMenit, JUmlahUnitTV, sisaWaktu, waktuJam
2. hitung sisaWaktu = (waktu%60)
3. jika sisawaktu%60 tidak menghasilkan sisa maka * 7000
4. jika sisawaktu menghasilkankan sisa *150
5.total menit bermain = 
*/
package QUIZ;

import java.util.Scanner;

public class RentalPS_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tarifJam, tarifMenit, jumlahUnitTV=12, waktu,totalBiayaAwal;
        double potongan=12, sisawaktuJam, totalwaktu, totalBiayaAkhir;
        System.out.println("Masukkan waktu");
        waktu = sc.nextInt();
        tarifJam = (waktu/60)*7000;
        tarifMenit = (waktu%60)*150;
        totalwaktu = ((waktu/60) + waktu%60);
        totalBiayaAwal= (tarifJam + tarifMenit);
        totalBiayaAkhir = (totalBiayaAwal*12.5);


        
    }
}