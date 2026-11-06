/*PARAMETER UNIK : 25
n : 5 + (25%4) = 6 */
package pertemuan10;
import java.util.Scanner;
public class Tugas225 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int totalangka = 0;
    System.out.print("Masukkan nilai n : ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
        if (n <3) {
        System.out.print("Silahkan masukkan input ulang!");
        }
        for (int j =1; j <= n;j++) {
        int hasil = i*j;
        System.out.printf("%4d ", hasil);
        totalangka += i*j;
        }
        System.out.println();
        }
    System.out.println("Total seluruh angka : "+totalangka);
    sc.close();
    }
}
    


