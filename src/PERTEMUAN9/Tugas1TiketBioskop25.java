package pertemuan9;
/*harga tiket = 40000 + (25 % 6) x 2000 = 42000
syarat diskon pertama = lebih dari 3 + (25 % 3) = 4
diskon = 8 + (25 % 5) = 8%
syarat diskon kedua = lebih dari 8 + (25 % 4) = 9
diskon = 15 + (25 % 4) = 16% */
import java.util.Scanner;
public class Tugas1TiketBioskop25 {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
int hargatiket = 42000, totaltiket, i = 0, jumlah_tiket_per_hari = 0;
double diskon, totalharga, total=0, jumlahTotal=0; 
do {
    System.out.print("Masukkan jumlah tiket: ");
    totaltiket = sc.nextInt();
    if (totaltiket < 0) {
    System.out.println("Input jumlah tiket tidak valid");
    continue;
    }
    totalharga =(totaltiket*hargatiket);
    if (totaltiket > 4 && totaltiket <=9 ) {
        diskon = 0.08;
        totalharga -= totalharga*diskon;
    }else if (totaltiket > 9) {
        diskon = 0.16;
        totalharga -= totalharga*diskon;
    }
    jumlahTotal += totalharga;
    jumlah_tiket_per_hari+= totaltiket;
    System.out.println("jumlah total harga: " +jumlahTotal);
    System.out.println("jumlah tiket per hari :" + jumlah_tiket_per_hari);
}while (true) ;

}
}
