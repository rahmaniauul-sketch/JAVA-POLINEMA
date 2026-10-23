/*harga kopi = 10000 + (25 % 5) x 1000 = 10000
harga teh = 5000 + (25 % 4) x 1000 = 6000
harga roti = 15000 + (25 % 6) x 1000 = 16000 */
import java.util.Scanner;
public class KafeDoWhile25 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int kopi, teh, roti;
String namaPelanggan;
int totalharga, hargakopi = 12000, hargateh = 7000, hargaroti = 20000;
do { 
    System.out.println("Masukkan nama pelangga (ketik 'batal' untuk keluar): ");
    namaPelanggan = sc.nextLine();
    if (namaPelanggan.equalsIgnoreCase("batal")) {
        System.out.println("Transaksi dibatalkan");
        break;
    }
    System.out.println("Jumlah kopi: ");
    kopi = sc.nextInt();
    System.out.println("Jumlah teh: ");
    teh = sc.nextInt();
    System.out.println("Jumalh roti: ");
    roti = sc.nextInt();
    totalharga = (kopi*hargakopi) + (teh*hargateh) + (roti*hargaroti);
    System.out.println("Total yang harus dibayarkan: Rp " + totalharga);
    sc.nextLine();
} while (true);
System.out.println("Semua transaksi selesai.");
}
}
