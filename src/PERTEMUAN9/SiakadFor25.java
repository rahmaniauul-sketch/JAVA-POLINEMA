/*jumlah mahasiswa (batas perulangan for) = 8 + (25 % 5) = 8
batas kelulusan = 55 + (25 % 11) = 58 */
package PERTEMUAN69;
import java.util.Scanner;
public class SiakadFor25 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double nilai, tertinggi = 0, terendah = 58;
int lulus = 0, tidaklulus = 0;
for (int i= 1; i <= 8; i++) {
    System.out.print("Masukkan nilai mahasiswa ke-" +i + ":");
    nilai = sc.nextDouble();
    if (nilai > tertinggi) {
        tertinggi = nilai; 
    }
    if (nilai < terendah) {
        terendah = nilai;
    }
    if (nilai >= 58) {
        lulus = lulus +1;
    }else{
        tidaklulus = tidaklulus + 1;
    }
    
}
System.out.println("Nilai tertinggi: " + tertinggi);
System.out.println("Nilai terendah: " + terendah);
System.out.println("Jumlah mahasiswa lulus: " +lulus);
System.out.println("Jumlah mahasiswa tidak lulus: " + tidaklulus);
}
}

