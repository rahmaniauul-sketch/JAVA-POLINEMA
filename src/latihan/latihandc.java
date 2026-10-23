package latihan;

import java.util.Scanner;

public class latihandc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai_Tugas, Nilai_UTS, Nilai_UAS, nilai_Akhir, rata_rata_Nilai_Akhir;
        String nama_Mahasiswa, NIM, kategori, Kode_kategori;
        int rata_rata;
        /*nama, nim, nilai*/
        System.out.print("Masukkan nama mahasiswa :");
        nama_Mahasiswa = sc.next();
        System.out.print("Masukkan NIM mahasiswa :");
        NIM = sc.next();
        System.out.print("Masukkan nilai Tugas mahasiswa :");
        nilai_Tugas= sc.nextDouble();
        System.out.print("Masukkan nilai UTS mahasiswa :");
        Nilai_UTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS mahasiswa :");
        Nilai_UAS = sc.nextDouble();
        nilai_Akhir = ((Nilai_UTS * 0.3) + (Nilai_UAS * 0.4) + (nilai_Tugas * 0.3));
        if (nilai_Akhir >= 85 && nilai_Akhir <= 100) {
            Kode_kategori = "A";

            } else if ( nilai_Akhir >= 75 && nilai_Akhir <=84.99) {
                Kode_kategori = "B";
                } else if ( nilai_Akhir >= 60 && nilai_Akhir <= 74.99) {
                Kode_kategori = "C";
        }else {
        Kode_kategori = "D";
        }
        switch (Kode_kategori) {
            case "A":
                System.out.println("kategori A");
                if (nilai_Akhir>= 60 && nilai_Akhir <= 100) {
                    System.out.println("mahasiswa lulus");
                }else {
                    System.out.println("mahasiswa tidak lulus");
                }
                break;
            case "B" :
                System.out.println("kategori B");
                if (nilai_Akhir>= 60 && nilai_Akhir <= 100) {
                    System.out.println("mahasiswa lulus");
                }else {
                    System.out.println("mahasiswa tidak lulus");
                }
            case "C" :
                if (nilai_Akhir>= 60 && nilai_Akhir <= 100) {
                    System.out.println("mahasiswa lulus");
                }else {
                    System.out.println("mahasiswa tidak lulus");
                }
            case "D" :
                if (nilai_Akhir>= 60 && nilai_Akhir <= 100) {
                    System.out.println("mahasiswa lulus");
                }else {
                    System.out.println("mahasiswa tidak lulus");
                }
            default:
                System.out.println("kode kategori tidak tersedia");
                
        }
        
        

    }
    }

