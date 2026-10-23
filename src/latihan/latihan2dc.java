package latihan;
import java.util.Scanner;
public class latihan2dc {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String kode_barang, status_Member, nama_Pembeli, kode_jenis_Barang;
        int jumlah_barang, nilai_Belanja;
        double harga_satuan, diskon, total_Bayar, biaya_diskon, biaya_Akhir;
        System.out.println("---Kode Jenis Barang---");
        System.out.println(" A. Makanan");
        System.out.println("B. Minuman");
        System.out.println("C. Alat Tulis");
        System.out.print("Masukkan nama pembeli : ");
        nama_Pembeli = sc.next();
        System.out.print("Masukkan jumlah barang :");
        jumlah_barang = sc.nextInt();
        System.out.print("Masukkan kode jenis barang :");
        kode_jenis_Barang = sc.next();
            switch (kode_jenis_Barang) {
                case "A":
                    sc.nextLine();
                    System.out.println("makanan");
                    System.out.print("Masukkan harga satuan :");
                    harga_satuan = sc.nextDouble();
                    System.out.print("Masukkan status member (ya/tidak) :");
                    status_Member = sc.next();
                    System.out.print("Masukkan nilai belanja :");
                    nilai_Belanja = sc.nextInt();
                    if (status_Member.equalsIgnoreCase("ya") && nilai_Belanja >= 100000 && jumlah_barang >= 10) {
                        diskon = 0.15 + 0.05;
                        biaya_diskon = nilai_Belanja*diskon;
                        biaya_Akhir = nilai_Belanja - biaya_diskon;
                        System.out.println("total biaya Rp " +biaya_Akhir);
                    }else if (status_Member.equalsIgnoreCase("ya") && jumlah_barang >= 5 ) {
                            diskon = 0.1 + 0.05;
                            total_Bayar = harga_satuan*jumlah_barang;
                            biaya_diskon = total_Bayar*diskon;
                            biaya_Akhir = total_Bayar-biaya_diskon;
                            System.out.println("total bayar RP :" +biaya_Akhir);
                                if (jumlah_barang>=10){
                                    diskon = 0.15;
                                    total_Bayar = harga_satuan*jumlah_barang;
                                    biaya_diskon = total_Bayar*diskon;
                                    biaya_Akhir = total_Bayar-biaya_diskon;
                                    System.out.println("total bayar RP :" +biaya_Akhir);
                                }else {
                                    if (status_Member.equalsIgnoreCase("ya") && nilai_Belanja >= 100000 && jumlah_barang >= 5 && jumlah_barang<=10) {
                                        diskon = 0.1;
                                        biaya_diskon = nilai_Belanja*diskon;
                                        biaya_Akhir = nilai_Belanja - biaya_diskon;
                                        System.out.println("total biaya Rp " +biaya_Akhir);
                                }
                            }
                    }else {
                        diskon = 0;
                        total_Bayar = harga_satuan*jumlah_barang;
                        biaya_diskon = total_Bayar*diskon;
                        biaya_Akhir = total_Bayar-biaya_diskon;
                        System.out.println("total bayar RP :" +biaya_Akhir);
                    }
                    break;
                case "B":
                    System.out.println("Minuman");
                    System.out.print("Masukkan status member (ya/tidak) :");
                    status_Member = sc.next();
                    System.out.print("Masukkan harga satuan :");
                    harga_satuan = sc.nextDouble();
                    System.out.print("Masukkan nilai belanja :");
                    nilai_Belanja = sc.nextInt();
                    if (status_Member.equalsIgnoreCase("ya") && nilai_Belanja >= 100000 && jumlah_barang >= 10) {
                        diskon = 0.15 + 0.05;
                        biaya_diskon = nilai_Belanja*diskon;
                        biaya_Akhir = nilai_Belanja - biaya_diskon;
                        System.out.println("total biaya Rp " +biaya_Akhir);
                        }else if (jumlah_barang>=10) {
                                diskon = 0.15;
                                total_Bayar = harga_satuan*jumlah_barang;
                                biaya_diskon = total_Bayar*diskon;
                                biaya_Akhir = total_Bayar-biaya_diskon;
                                System.out.println("total bayar RP :" +biaya_Akhir);
                    if (jumlah_barang>=5 && jumlah_barang<10){
                        diskon = 0.1;
                        total_Bayar = harga_satuan*jumlah_barang;
                        biaya_diskon = total_Bayar*diskon;
                        biaya_Akhir = total_Bayar-biaya_diskon;
                        System.out.println("total bayar RP :" +biaya_Akhir);
                    }else if (status_Member.equalsIgnoreCase("ya") && nilai_Belanja >= 100000 && jumlah_barang >= 5) {
                            diskon = 0.1 + 0.05;
                            biaya_diskon = nilai_Belanja*diskon;
                            biaya_Akhir = nilai_Belanja - biaya_diskon;
                            System.out.println("total biaya Rp " +biaya_Akhir);
                    }else {
                        diskon = 0;
                        total_Bayar = harga_satuan*jumlah_barang;
                        biaya_diskon = total_Bayar*diskon;
                        biaya_Akhir = total_Bayar-biaya_diskon;
                        System.out.println("total bayar RP :" +biaya_Akhir);
                    }
                    }
                    break;
                case "C":
                    System.out.println("alat tulis");
                    System.out.print("Masukkan status member : (ya/tidak)");
                    status_Member = sc.next();
                    System.out.print("Masukkan harga satuan :");
                    harga_satuan = sc.nextDouble();
                    System.out.print("Masukkan nilai belanja :");
                    nilai_Belanja = sc.nextInt();
                    if (status_Member.equalsIgnoreCase("ya") && nilai_Belanja >= 100000 && jumlah_barang >= 10) {
                        diskon = 0.15 + 0.05;
                        biaya_diskon = nilai_Belanja*diskon;
                        biaya_Akhir = nilai_Belanja - biaya_diskon;
                        System.out.println("total biaya Rp " +biaya_Akhir);
                        }else if (jumlah_barang>=10) {
                                diskon = 0.15;
                                total_Bayar = harga_satuan*jumlah_barang;
                                biaya_diskon = total_Bayar*diskon;
                                biaya_Akhir = total_Bayar-biaya_diskon;
                                System.out.println("total bayar RP :" +biaya_Akhir);
                    if (jumlah_barang>=5 && jumlah_barang<10){
                        diskon = 0.1;
                        total_Bayar = harga_satuan*jumlah_barang;
                        biaya_diskon = total_Bayar*diskon;
                        biaya_Akhir = total_Bayar-biaya_diskon;
                        System.out.println("total bayar RP :" +biaya_Akhir);
                    }else if (status_Member.equalsIgnoreCase("ya") && nilai_Belanja >= 100000 && jumlah_barang >= 5) {
                            diskon = 0.1 + 0.05;
                            biaya_diskon = nilai_Belanja*diskon;
                            biaya_Akhir = nilai_Belanja - biaya_diskon;
                            System.out.println("total biaya Rp " +biaya_Akhir);
                    }else {
                        diskon = 0;
                        total_Bayar = harga_satuan*jumlah_barang;
                        biaya_diskon = total_Bayar*diskon;
                        biaya_Akhir = total_Bayar-biaya_diskon;
                        System.out.println("total bayar RP :" +biaya_Akhir);
                    }
                    }
                    break;
                default:
                    System.out.println("kode jenis barang tidak tersedia");
        }
            }
        
        


    }

