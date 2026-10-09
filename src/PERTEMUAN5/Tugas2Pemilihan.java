package PERTEMUAN5;

import java.util.Scanner;

public class Tugas2Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahSKS;
        jumlahSKS = sc.nextInt();
        if (jumlahSKS > 24) {
             System.out.println( "Melebihi batas");
     }else {
        System.out.println(" Output KRS valid");
     }
    }
}
        
    

