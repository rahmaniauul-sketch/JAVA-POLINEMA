/*PARAMETER UNIK : 25
baris : 2 + (25%3) = 3
kolom : 4 + (25%3) = 5
baris2 : 5 + (25%3) = 6
kolom2 : 2 + (25%3) = 3
baris3 : 4 + (25%4) = 5
kolom3 : 6 + (25%4) = 7 */
package pertemuan10;
import java.util.Scanner;
public class Rectangle25 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah baris : ");
    int baris = sc.nextInt();
    System.out.print("Masukkan jumlah kolom : ");
    int kolom = sc.nextInt();
    for (int i = 1; i <= baris; i++) {
        for (int j = 1; j <= kolom; j++) {
            System.out.print("#");
        }
        System.out.println();
        }
        sc.close();
    }
}

