package latihan;
import java.util.Scanner;
public class latihan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama_Mahasiswa, status_Mahasiswa, jenis_Beasiswa;
        double nilai_IPK;
        System.out.print("Masukkan nama mahasiswa :");
        nama_Mahasiswa = sc.nextLine();
        System.out.print("Jenis beasiswa :");
        jenis_Beasiswa = sc.nextLine();
        
            if (jenis_Beasiswa.equalsIgnoreCase("akademik")) {
                 System.out.print("Masukkan nilai IPK mahasiswa :");
                nilai_IPK = sc. nextDouble();
                if (nilai_IPK > 3.5 ) {
                    System.out.println("diterima beasiswa akademik");
                }else {
                    System.out.println("tidak diterima beasiswa akademik");
                }
                    
            }else if (jenis_Beasiswa.equalsIgnoreCase("prestasi")) {
                System.out.print("Masukkan nilai IPK mahasiswa :");
                nilai_IPK = sc. nextDouble();
                if (nilai_IPK>3) {
                System.out.println("diterima beasiswa prestasi");
            }else {
                System.out.println("tidak diterima beasiswa prestasi");
            }
        }else if (jenis_Beasiswa.equalsIgnoreCase("sosial")) {
            System.out.print("Masukkan status mahasiswa : ");
            status_Mahasiswa = sc.nextLine();
            if (status_Mahasiswa.equalsIgnoreCase("aktif")) {
                System.out.println("diterima beasiswa sosial");
            }else {
                System.out.println("tidak diterima beasiswa sosial");
            }
        }

            
        }
}
