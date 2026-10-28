package PERTEMUAN6;
import java.util.Scanner;
public class nestedAksesLabNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean mahasiswaAktif;
        mahasiswaAktif = sc.nextBoolean();
        boolean sedangDisanksi;
        sedangDisanksi = sc.nextBoolean();
        boolean punyaIzinDosen;
        punyaIzinDosen = sc.nextBoolean();
        boolean asistenLab;
        asistenLab = sc.nextBoolean();
        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.err.println("Akses laboratorium diberikan");
            } else {
                System.err.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
            }
        } else {
            System.err.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }

    }
}
