/*
 Buatlah algoritma dalam Bahasa Java Anda akan keluar membeli gorengan jika
mempunyai uang lebih besar dari 5000 (rupiah) dan hari tidak hujan, yang dapat
ditulis sebagai ekspresi: (uang > 5000) && (!hujan)

 */
package tugas2;

import java.util.Scanner;

public class soal_dua {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah uangmu: ");
        int uang = input.nextInt();
        System.out.print("Apakah di luar sedang hujan(true/false)?: ");
        boolean hujan = input.nextBoolean();
        if (uang > 5000 && !hujan) {
            System.out.println("Saya akan keluar membeli gorengan.");
        } else {
            System.out.println("Saya tidak bisa keluar.");
        }
        
        input.close();    
        
    }  
}
