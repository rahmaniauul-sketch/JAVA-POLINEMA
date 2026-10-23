package latihan;
import java.util.Scanner;
public class latihan6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String nama_Mahasiswa, prestasi;
        int  penghasilan_OrangTua, jenis_Beasiswa;
        double IPK;
        System.out.println("---Kode Jenis Beasiswa---");
        System.out.println("1. akademik");
        System.out.println("2. ekonomi");
        System.out.println("3. prestasi");
        System.err.print("Masukkan jenis beasiswa :");
        jenis_Beasiswa = sc.nextInt();
        switch (jenis_Beasiswa) {
            case (1):
                System.out.println("jenis beasiswa : beasiswa akademik");
                System.out.print("Masukkan IPK :");
                IPK = sc.nextDouble();
                if (IPK>=3.50) {
                    System.out.println("beasiswa akademik diterima");
                }else {
                    System.out.println("beasiswa akademik tidak diterima");
                }
                break;
            case (2):
                System.out.println("jenis beasiswa : beasiswa ekonomi");
                System.out.print("Masukkan penghasilan orang tua :");
                penghasilan_OrangTua = sc.nextInt();
                System.out.print("Masukkan IPK :");
                IPK = sc.nextDouble();
                if (IPK >= 3.00 && penghasilan_OrangTua<=2000000) {
                    System.out.println("beasiswa ekonomi diterima");
                }else {
                    System.out.println("beasiswa ekonomi tidak diterima");
                }
            break;
            case (3):
                System.out.println("Apakah memiliki prestasi ?");
                prestasi = sc.next();
                System.out.println("jenis beasiswa : beasiswa prestasi");
                System.out.print("Masukkan IPK :");
                IPK = sc.nextDouble();
                if (IPK >= 3.00 && prestasi.equalsIgnoreCase("ya" )) {
                    System.out.print("beasiswa prestasi diterima");
                }else {{
                    System.out.println("beasiswa prestasi tidak diterima");
                }}
            break;
            default:
                System.out.println("Jenis beasiswa tidak tersedia");;
        }

    }
}
