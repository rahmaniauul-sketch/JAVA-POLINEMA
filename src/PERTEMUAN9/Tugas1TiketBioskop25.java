
/*harga tiket = 40000 + (25 % 6) x 2000 = 42000
syarat diskon pertama = lebih dari 3 + (25 % 3) = 4
diskon = 8 + (25 % 5) = 8%
syarat diskon kedua = lebih dari 8 + (25 % 4) = 9
diskon = 15 + (25 % 4) = 16% */
import java.util.Scanner;
public class Tugas1TiketBioskop25 {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
int hargatiket = 50000, totaltiket, i = 0;
double diskon, totalharga, total; 
System.out.println("Masukkan jumlah tiket: ");
totaltiket = sc.nextInt();
while (true) {
    if (totaltiket > 4 && totaltiket >0) {
        diskon = 0.1;
        totalharga =(totaltiket*hargatiket);
        total = totalharga - totalharga*diskon;
    }else if (totaltiket > 10 && totaltiket > 0) {
        diskon = 0.15;
        totalharga =(totaltiket*hargatiket);
        total = totalharga - totalharga*diskon;
    }else {
        System.out.println("input gagal! Masukkan input ulang");
    }
    
}
}
}
