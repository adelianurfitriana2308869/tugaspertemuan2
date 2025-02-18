/*
Buatlah algoritma dalam bahasa Java, menjumlahkan kode ASCII dari karakter ‘1’ dan
karakter ‘2’!
 */
package tugas2;


public class soal_tiga {
     public static void main(String[] args){
        
        char char1 = '1';
        char char2 = '2';

       
        int ascii1 = (int) char1;
        int ascii2 = (int) char2;
        int jumlahAscii = ascii1 + ascii2;

        
        System.out.println("Kode ASCII dari karakter '" + char1 + "': " + ascii1);
        System.out.println("Kode ASCII dari karakter '" + char2 + "': " + ascii2);
        System.out.println("Jumlah kode ASCII dari '" + char1 + "' dan '" + char2 + "': " + jumlahAscii);
     
     
     }
    
}
