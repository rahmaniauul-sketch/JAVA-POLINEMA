package PERTEMUAN2;
import java.util.Scanner;
public class studikasus1_25 {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int gajipokok, tunjangananak, jumlahanak, totaltunjangananak;
    double totalgaji = 0, danapensiun = 0.1, totaldanapenisun;
    System.out.println("Masukkan nilai gaji pokok");
    gajipokok= sc.nextInt();
    System.out.println("Masukkan nilai tunjangan anak");
    tunjangananak= sc.nextInt();
    System.out.println("Masukkan jumlah anak");
    jumlahanak= sc.nextInt();
   totaltunjangananak=tunjangananak*jumlahanak;
   totaldanapenisun=gajipokok*danapensiun;
   totalgaji=gajipokok+totaltunjangananak-danapensiun;
System.out.println("total gaji bersih" + totalgaji);
    }
}
