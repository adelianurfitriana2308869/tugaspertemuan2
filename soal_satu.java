/*
Buatlah algoritma dalam bahasa Java, yang menerima inputan tiga buah masukan
bilangan bulat dan menampilkan hasil operasi (+,-,*,/) ketiga bilangan!

*/
package tugas2;

import java.util.Scanner;


public class soal_satu {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print( "Masukkan angka pertama: ");
      int angkaPertama = input.nextInt();
      System.out.print( "Masukkan angka kedua: ");
      int angkaKedua = input.nextInt();
      System.out.print( "Masukkan angka ketiga: ");
      int angkaKetiga = input.nextInt();
      
      System.out.println("hasil output penjumlahan: ");
      System.out.println(angkaPertama + angkaKedua + angkaKetiga);
      
      System.out.println("hasil output perkalian: ");
      System.out.println(angkaPertama * angkaKedua * angkaKetiga);
      
      System.out.println("hasil output pengurangan: ");
      System.out.println(angkaPertama - angkaKedua - angkaKetiga);
      
      System.out.println("hasil output pembagian: ");
      System.out.println(angkaPertama / angkaKedua / angkaKetiga);        
        
    }
}
