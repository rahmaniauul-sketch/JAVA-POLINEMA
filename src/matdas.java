import java.util.Scanner;
public class matdas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai_mahasiswa;
        float status_kehadiran = (float)0.8;
        System.out.println("Masukkan nilai mahasiswa");
        nilai_mahasiswa = sc.nextInt();
        System.out.println("Masukkan status_kehadiran");
        status_kehadiran = sc.nextFloat();
        if (nilai_mahasiswa >= 60 && status_kehadiran >= (float) 0.8 ) {
            System.out.println("LULUS");
        } else {
            System.out.println("TIDAK LULUS");
        }
    }
}
