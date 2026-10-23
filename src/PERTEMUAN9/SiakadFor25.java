/*jumlah mahasiswa (batas perulangan for) = 8 + (25 % 5) = 8
batas kelulusan = 55 + (25 % 11) = 58 */

import java.util.Scanner;
public class SiakadFor25 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double nilai, tertinggi = 0, terendah = 100;
int lulus = 0, tidaklulus = 0;
for (int i= 1; i <= 10; i++) {
    System.out.print("Masukkan nilai mahasiswa ke-" +i + ":");
    nilai = sc.nextDouble();
    if (nilai > tertinggi) {
        tertinggi = nilai; 
    }
    if (nilai < terendah) {
        terendah = nilai;
    }
}
System.out.println("Nilai tertinggi: " + tertinggi);
System.out.println("Nilai terendah: " + terendah);
}
}

