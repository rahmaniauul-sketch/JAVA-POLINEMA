package PERTEMUAN2;
import java.util.Scanner;
public class studikasus2_25 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int lebarTanah, panjangTanah, diameterKolam, panjangSisiTaman, luasTanahAwal, luasPanjangTaman;
double luasTanahSisa, luasKolam, pi = 3.14, jariJari;
System.out.println("Masukkan lebar tanah");
lebarTanah = sc.nextInt();
System.out.println("Masukkan panjang tanah");
panjangTanah = sc.nextInt();
System.out.println("Masukkan diameter kolam");
diameterKolam = sc.nextInt();
System.out.println("Masukkan panjang sisi taman");
panjangSisiTaman = sc.nextInt();
luasTanahAwal = panjangTanah*lebarTanah;
jariJari = 0.5*diameterKolam;
luasKolam = pi*Math.pow(jariJari, 2);
luasPanjangTaman = panjangSisiTaman*panjangSisiTaman;
luasTanahSisa = luasTanahAwal - luasKolam - luasPanjangTaman;
System.out.println("luas tanah sisa" + luasTanahSisa);
    }
}
