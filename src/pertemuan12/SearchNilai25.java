/*PARAMETER UNIK :
key 20 + (25%50) = 45*/
package pertemuan12;
import java.util.Scanner;
public class SearchNilai25 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int jumlahelemen, elemen;
    System.out.print("Masukkan jumlah elemen : ");
    jumlahelemen = sc.nextInt();
    int [] nilai = new int [jumlahelemen];
    for (int i = 0; i < jumlahelemen; i++) {
        System.out.print("Masukkan elemen " + i + ":");
        elemen = sc.nextInt();
        nilai [i] = elemen;
    }
    System.out.print("Masukkan key : ");
    int key = sc.nextInt();
    boolean ditemukan = false;
    for (int j = 0; j < nilai.length; j++) {
        if (nilai[j] == key) {
            System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + j);
            ditemukan = true;
            break;
        }
    }
    if (!ditemukan) {
        System.out.println("Nilai " + key + " tidak ditemukan.");
    }
    }
}

