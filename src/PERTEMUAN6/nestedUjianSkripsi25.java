package PERTEMUAN6;
import java.util.Scanner;
public class nestedUjianSkripsi25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;
        /*bimbingan1 = 6 + (25 % 5) = 6
        bimbingan2 = 3 + (25 % 3) = 7 */
        System.err.println("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebasKompen = sc.nextLine().trim();
        System.err.println("Masukkan jumlah log bimbingan Pembimbing 1:");
        int bimbinganP1 = sc.nextInt();
        System.err.println("Masukkan jumlah log bimbingan Pembimbing 2:");
        int bimbinganP2 = sc.nextInt();
    if (bebasKompen.equalsIgnoreCase("Ya")) {
        if (bimbinganP1 >6 && bimbinganP2 >7){
            pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
        } else if (bimbinganP1 < 6 && bimbinganP2 < 7) {
            pesan = "Gagal! Log bimbingan P1 kurang dari 6 kali dan P2 kurang dari 7 kali";
        } else if (bimbinganP1 < 6) {
            pesan = "Gagal! Log bimbingan P1 belum mencapai 6 kali";
        } else {
            pesan = "Gagal! Log bimbingan P2 belum mencapai 7 kali";
        }
    } else {
        pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
    }
    System.out.println(pesan);
    }
    
}
