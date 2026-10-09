package PERTEMUAN6;
import java.util.Scanner;
public class tugas2asisten25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
boolean mahasiswaAktif, sertifikat, sanksiAkademik;
/* syarat minimal dasar pemrograman = 75 + (25%11) = 78
nilai wawancara minimal = 70 (25%11) = 73 */
System.out.println("apakah mahasiswa aktif");
mahasiswaAktif = sc.nextBoolean();
System.out.println("apakah memiliki sertifikat");
sertifikat = sc.nextBoolean();
System.out.println("apakah memiliki sanski akademik");
sanksiAkademik = sc.nextBoolean();
int nilaiDaspro, nilaiwawancara;
System.out.println("masukkan nilai daspro");
nilaiDaspro = sc.nextInt();
System.out.println("masukkan nilai wawancara");
nilaiwawancara = sc.nextInt();
if (mahasiswaAktif && sanksiAkademik) {
    if (nilaiDaspro>=78) {
        System.out.println("Lolos");
    } else if (nilaiwawancara >=73) {
        System.out.println("Lolos wawancara");
}else{
    System.out.println("Tidak lolos");
}

    
}



    }
}
