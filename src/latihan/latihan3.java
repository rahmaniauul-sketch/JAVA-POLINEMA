package latihan;
import java.util.Scanner;
public class latihan3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String jenis_Ujian;
    int nilai_Ujian;
    System.out.print("Masukkan jenis ujian :");
    jenis_Ujian = sc.nextLine();
    System.out.print("Masukkan nilai ujian :");
    nilai_Ujian = sc.nextInt();
    switch (jenis_Ujian) {
        case ("UTS"):
            System.out.println("jenis ujian UTS");
            if (nilai_Ujian > 70) {
                System.out.println("status : lulus");
            }else if  (nilai_Ujian <= 70 && nilai_Ujian > 50) 
                    System.out.println("status : remedial");
                else {
                System.out.println("status : tidak lulus");
                }
            
            break;
        case ("UAS"):
            System.out.println("jenis ujian UAS");
            if (nilai_Ujian>75) {
                System.out.println("status : lulus");
            }else if (nilai_Ujian<=75 && nilai_Ujian>=60) 
                    System.out.println("status : remedial");
            else {
                System.out.println("status : tidak lulus");
                }
            
            break;
        case ("praktikum"):
            System.out.println("jenis ujian praktikum");
            if (nilai_Ujian>80) {
                System.out.println("status : lulus");
            }else if (nilai_Ujian<=80 && nilai_Ujian>=65) 
                    System.out.println("status : remedial");
            else {
                System.out.println("status : tidak lulus");
                }
            
        break;
        default:
            System.out.println("jenis ujian tidak tersedia");
    }

    }
}
