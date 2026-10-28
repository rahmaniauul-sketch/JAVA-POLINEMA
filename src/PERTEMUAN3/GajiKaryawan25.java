package PERTEMUAN3;
import java.util.Scanner;
public class GajiKaryawan25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gajiPokok;
        int bonus, totGaji;
        int tunjTransp=(int) 600000;
        int tunjMkn=(int)400000;
        gajiPokok=sc.nextInt();
        bonus= (int)0.05*gajiPokok;
        totGaji=gajiPokok+tunjTransp+tunjMkn+bonus-((int)0.1*gajiPokok);
        System.out.println("Bonus Bulanan anda adalah Rp. "+bonus);
        System.out.println("Gaji yang diterima adalah Rp. "+totGaji);
    }
}   
