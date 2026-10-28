package pertemuan9;
/*tarif parkir mobil = 2500 + (25 % 6) x 250 = 2750
tarif parkir motor = 1500 + (25 % 6) x 250 =  1750 */
import java.util.Scanner;
public class Tugas2TiketParkir {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int jenis, durasi, total = 0;
do { 
    System.out.print("Masukkan jenis: (1 : mobil, 2 : motor, 0 = keluar): ");
    jenis = sc.nextInt();
    if (jenis == 1 || jenis == 2) {
        System.out.print("Masukkan durasi: ");
        durasi = sc.nextInt();
        if (jenis == 1) {
            total += durasi*2750;  
        }else {
            total += durasi*1750;
        }
    }else if ( jenis!= 0) {
        System.out.println("Tidak valid");
    }
} while (jenis!= 0);
System.out.println("Tidak valid");
System.out.println("total: " +total);
} 
}
