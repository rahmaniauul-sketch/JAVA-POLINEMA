package PERTEMUAN5;

import java.util.Scanner;

public class Tugas1Pemilihan25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean uktLunas;
        String pesan;
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Apakah UKT sudah lunas? (true/false): ");
        uktLunas = sc. nextBoolean ();
        if (uktLunas) {
            System.err.println("Pembayaran UKT terverifikasi");
            System.err.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        }else {
            System.out.println("Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu");

        }
    }
}

    
