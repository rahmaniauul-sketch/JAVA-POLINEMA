/*PARAMETER UNIK : 25
3 + (25%5) = 3
9 + (25%5) = 9
4 + (25%4) = 5
10 + (25%6) = 11*/
package pertemuan10;
import java.util.Scanner;
public class Star25 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan nilai n = ");
int n = sc.nextInt();
for (int i = 1; i <= n; i++) {
    System.out.print("*");
    }
System.out.println();
sc.close();
    }
}
