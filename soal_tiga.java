/*
Buatlah algoritma dalam bahasa Java, menjumlahkan kode ASCII dari karakter ‘1’ dan
karakter ‘2’!
 */
package tugas2;

import java.util.Scanner;



public class soal_tiga {
     public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan karakter pertama: ");
        char char1 = scanner.next().charAt(0);
        
        System.out.print("Masukkan karakter kedua: ");
        char char2 = scanner.next().charAt(0);
       
        int ascii1 = (int) char1;
        int ascii2 = (int) char2;
        int jumlahAscii = ascii1 + ascii2;
 
        System.out.println("\nKode ASCII dari karakter '" + char1 + "': " + ascii1);
        System.out.println("Kode ASCII dari karakter '" + char2 + "': " + ascii2);
        System.out.println("Jumlah kode ASCII dari kedua karakter: " + jumlahAscii);
        
        scanner.close();
     
     
     
     }
    
}
