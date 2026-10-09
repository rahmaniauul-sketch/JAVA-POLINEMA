package PERTEMUAN6;
import java.util.Scanner;
/*P = 25 */
public class OperatorLogikaWifiNoPresensi {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    boolean mahasiswa;
    boolean dosen;
    boolean akunDiblokir;
    System.err.println("Apakah pengguna mahasiswa? (true/false):");
    mahasiswa = sc.nextBoolean();
    System.out.print("Apakah pengguna dosen? (true/false):");
    dosen = sc.nextBoolean();
    System.out.println("Apakah akun sedang diblokir? (true/false):");
    akunDiblokir = sc.nextBoolean();
    if ((mahasiswa && dosen) && !akunDiblokir) {
        System.out.println("Akses Wifi diberikan");
    } else {
        System.err.println("Akses Wifi ditolak");
    }
   }
}
