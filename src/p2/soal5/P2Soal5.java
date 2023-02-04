package p2.soal5;
import java.util.Scanner;
/**
 *
 * @author Muhamad Mathar Rizqi
 */
public class P2Soal5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //membuat objek Scanner bernama scan yang digunakan untuk membaca input dari user
        String[] platNumbers = scan.nextLine().split(" "); //menmisahkan string jika ada spasi dan menyimpannya dalam array of string bernama platNumbers
        
        int gabungan = 0;
        for (String platNumber : platNumbers) {
            /*
                loop yang berfungsi untuk mengiterasi tiap digit dalam platNumbers, 
                mengubah setiap digit menjadi integer, dan menambahkan hasilnya ke variable gabungan.
            */
            gabungan += Integer.parseInt(platNumber);
        }
        
        if (gabungan % 5 == 0) {
            /*
                menentukan apakah gabungan dari tiap digit bisa dibagi 5 (modulus 5 = 0), jika bisa, 
                maka outputkan "Jalan", jika tidak bisa, maka outputkan "Berhenti".
            */
            System.out.println("Jalan");
        } else {
            System.out.println("Berhenti");
        }
    }
}