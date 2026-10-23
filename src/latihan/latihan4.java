package latihan;

import java.util.Scanner;

public class latihan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jenis_Pelanggan;
        int total_Belanja;
        double diskon, total_Bayar;
        System.out.print("Masukkan jenis pelanggan :");
        jenis_Pelanggan = sc.nextLine();
        System.out.print("Masukkan total belanja :");
        total_Belanja = sc.nextInt();
        switch (jenis_Pelanggan) {
            case ("member"):
                if (total_Belanja>500000) {
                    diskon = 0.1;
                    System.out.print("diskon :" + diskon +" % ");
                }else {
                    diskon = 0.05;
                    System.out.println("diskon :" + diskon + " % ");
                }
                diskon =total_Belanja*diskon;
                total_Bayar = total_Belanja-diskon;
                System.out.println("potongan bayar Rp :" +diskon);
                System.out.println("total bayar Rp :" +total_Bayar);
                break;
            case ("non member") :
                if (total_Belanja>1000000) {
                    diskon = 0.05;
                    System.out.print("diskon :" + diskon +" % ");
                }else {
                    diskon = 0;
                    System.out.print("diskon :" + diskon +" % ");
                }
                diskon =total_Belanja*diskon;
                total_Bayar = total_Belanja-diskon;
                System.out.println("potongan bayar Rp :" +diskon);
                System.out.println("total bayar :" +total_Bayar);
            break;
            case ("VIP"):
                if (total_Belanja>500000) {
                    diskon = 0.2;
                    System.out.print("diskon :" + diskon +" % ");
                }else{
                    diskon = 0.15;
                    System.out.print("diskon :" + diskon +" % ");
                }
                diskon =total_Belanja*diskon;
                total_Bayar = total_Belanja-diskon;
                System.out.println("potongan bayar Rp :" +diskon);
                System.out.println("total bayar :" +total_Bayar);
            break;
            default:
                System.out.println("jenis pelanggan tidak terdafatar");
                
        }

    }
}
