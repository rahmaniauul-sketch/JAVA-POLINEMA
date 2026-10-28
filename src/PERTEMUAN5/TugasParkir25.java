package PERTEMUAN5;

import java.util.Scanner;

public class TugasParkir25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int waktu, total;
    waktu = sc.nextInt();
    total = ((waktu-2)*1000)+ 2000;
    if (waktu > 2) {
        System.err.println("total" +total);
    } else {
        System.out.println("2000");
    }
    }
}
