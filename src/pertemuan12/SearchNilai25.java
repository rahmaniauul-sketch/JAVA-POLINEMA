/*PARAMETER UNIK :
Bagian A : key : 20 + (25%50) = 45
Bagian B : 20 + (25 % 60) = 45
B[0] = 45
B[1] = 45 + 15 = 60
B[2] = 45-8 = 37
B[3] = 45 + 30 = 75
B[4] = 45-20 = 25
B[5] = 45 + 5 = 50*/
package pertemuan12;
public class SearchNilai25 {
    public static void main(String[] args) {
    int [] nilai = {45, 60, 37, 75, 25, 50};
    int key = 45;
    boolean ditemukan = false;
    for (int i = 0; i < nilai.length; i++) {
        if (nilai[i] == key) {
            System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
            ditemukan = true;
            break;
        }
    }
    if (!ditemukan) {
        System.out.println("Nilai " + key + " tidak ditemukan.");
    }
    }
}
