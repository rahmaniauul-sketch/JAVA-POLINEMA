/*PARAMETER UNIK : 25
n : 6 (25%5) = 6 */
package pertemuan10;
import java.util.Scanner;
public class Tugas125 {
    public static void main(String[] args) {
    int totalangka = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan bilangan bulat n  : ");
    int n = sc.nextInt();
    for (int i = 1; i <= n ; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(" " + j  );
            totalangka++;
        }
        System.out.println();
    }
   
    System.out.print("total angka : " +totalangka);
    sc.close();
    }
}
