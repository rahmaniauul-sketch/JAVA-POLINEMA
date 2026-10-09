package PERTEMUAN3;

import java.util.Scanner;

public class tugas2P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahlembar, biayacetak, biayajilid, totalbiaya;
        jumlahlembar = sc.nextInt();
        totalbiaya = (jumlahlembar*500) + 5000;
        System.out.println("total biaya" +totalbiaya);

    }
}
