package PERTEMUAN9;
import java.util.Scanner;
public class SiakadWhile25 {
Scanner sc = new Scanner(System.in);
int nilai, jml, i=0;
System.out.print("Masukkan jumlah mahasiswa: ");
jml = sc.nextInt();
while ( i < jml ) {
    System.out.println("Masukkan nilai mahasiswa ke-" + (i + 1) + ":");
    nilai = sc.nextInt();

    if (nilai < 0 || nilai > 100) {
        System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
        continue;
    }

    if (nilai > 80 && nilai <= 100) {
        System.out.println("Nilai mahasiswa ");;
        
    }
    i++;
}
}

