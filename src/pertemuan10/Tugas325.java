/*PARAMETER UNIK : 25
Jumlah toko : 2 + (25%3) = 3 */
package pertemuan10;
import java.util.Scanner;
public class Tugas325{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int jumlahtoko, jumlahpelanggan, jumlahbarang, totalbarang =0, tokobarangterbanyak;
System.out.print("Masukkan jumlah toko : ");
jumlahtoko = sc.nextInt();
if (jumlahtoko <1) {
    System.out.println("Input minimal 1. Silahkan masukkan input ulang!");
}else {
int jumlahmakismalbarang = -1;
int jumlahtokoterbanyak = 0;
for (int i = 1;i <= jumlahtoko; i++) {
    int totaltoko = 0;
    int totalsemua = 0;
    System.out.print("Masukkan jumlah pelanggan : ");
    jumlahpelanggan = sc.nextInt();
    if (jumlahpelanggan < 0) {
        System.out.println("Input pelanggan tidak boleh 0!");
    }
    for (int j = 1; j <=jumlahpelanggan; j++) { 
        System.out.print("Masukkan jumlah barang yang dibeli : ");
        jumlahbarang = sc.nextInt();
        if (jumlahbarang < 0) {
             System.out.println("Input jumlah barang tidak boleh 0!");
        }else {
        totalsemua += jumlahbarang;
        }
    }
    totalbarang += totalsemua;
    if (totalsemua > jumlahmakismalbarang) {
        jumlahmakismalbarang = totalsemua;
        jumlahtokoterbanyak = i;
    }
    System.out.println("Toko " + i + " - pelanggan: " + jumlahpelanggan + ',' + "total barang: " +totalsemua);
    }
System.out.println("Total barang seluruh toko: " +totalbarang);
System.out.print("Toko dengan barang terbanyak: " + jumlahtokoterbanyak);
}
sc.close();
}
}
