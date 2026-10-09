package PERTEMUAN6;
import java.util.Scanner;
public class tokobuku25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean hari, hariRabu;
        int jumlahBuku;
        String jenisBuku;
        double diskon;
/* diskon dasar kamus = 8 + (25%5) = 8
jumlah buku kamus = 2 (25 % 2) = 3
diskon dasar novel = 5 + (25% 4) = 6
jumlah buku novel = 3 + (25%2) = 4
diskon buku selain kamus, novel = 3 + (25 % 4) =4
jumlah buku = 3 + (25%2) = 4
 */
        System.err.println("Apakah hari ini hari Rabu: (ya/tidak)");
        hari = sc.nextBoolean();
        sc.nextLine();
        System.out.println("Jenis buku");
        jenisBuku = sc.nextLine();
        System.out.println("Jumlah buku");
        jumlahBuku = sc.nextInt();
        if (hari = true) {
            if (jenisBuku.equalsIgnoreCase ("kamus")){
                diskon = 0.08;
                if (jumlahBuku > 3) {
                    diskon = 0.08 + 0.02;
                 } else if (jenisBuku.equalsIgnoreCase("novel")) {
                        diskon = 0.06;
                     }else if (jumlahBuku>=4 ) 
                            diskon = 0.06 + 0.01; 
                }else {
                    if (jumlahBuku>4) {
                    diskon = 0.04;
                }else {
                    diskon = 0;
                } 
            }
            System.out.println("diskon" +diskon * 100 +"%");
        } 
         
    } 
}

                        

                    
        

    
