/*PARAMETER UNIK :
P =25
60 + (25 % 41) = 60 + 25 =85 */
package pertemuan12;
import java.util.Scanner;
public class ArrayNilai25 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [] nilaiAkhir = new int [10];
    Scanner input = new Scanner(System.in);
    for (int i = 0; i < nilaiAkhir.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
        nilaiAkhir[i] = input.nextInt();
    }
    for (int i : nilaiAkhir) {
        if (nilaiAkhir[i] >70) {
        System.out.println("Mahasiswa ke-" + (i + 1) + " : " + nilaiAkhir[i] + "Lulus");
        }
    }
    }
}
