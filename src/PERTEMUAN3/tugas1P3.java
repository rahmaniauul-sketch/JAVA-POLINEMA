package PERTEMUAN3;
import java.util.Scanner;
public class tugas1P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int harga, uangmuka, bulan;
        double bunga=0.02, jumlahcicilan;
        harga = sc.nextInt();
        uangmuka = sc.nextInt();
        bulan = sc.nextInt();
        jumlahcicilan = (harga-uangmuka)/bulan + (harga-uangmuka)*0.02;
        System.out.println("jumlah cicilan "+jumlahcicilan);
    
    }
}
