
package luaslingkaran_persegipanjang;
import java.util.Scanner;

public class LuasLingkaran_persegipanjang {

    
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        int pilih;
        do {
            
            System.out.println("=====================================================");
            System.out.println(" Program Menghitung Luas Lingkaran & Persegi Panjang ");
            System.out.println(" 1. Luas Lingkaran " + "\n"+ " 2. Luas Persegi Panjang " + "\n" + " 3. Selesai " );
            System.out.print(" Masukkan Pilihan Anda: ");
            pilih = input.nextInt();
            
            switch (pilih){
                
                case 1 :{
                    luasLingkaran();
                    break;
                }
                
                case 2 : {
                    luaspp();
                    break;
                }
                }
                }
               while(pilih !=3 );      
  };
    
    
    
    public static void luasLingkaran(){
        
        Scanner input = new Scanner(System.in);
        
        double luas , phi=3.14;
        int r;
        
        System.out.print(" Masukkan Jari-jari : ");
        r= input.nextInt();
        
        luas = phi*r*r;
        
        System.out.println(" Luas Lingkaran = " +luas);
 
    }
    
    public static void luaspp(){
        
        Scanner input = new Scanner(System.in);
        
        int panjang, lebar, luas;
        
        System.out.print(" Masukkan Panjang : ");
        panjang = input.nextInt();
        System.out.print(" Masukkan Lebar : ");
        lebar = input.nextInt();
        
        luas = panjang * lebar;
        
        System.out.println(" Luas Persegi Panjang : " + luas);
        
    }
    
}
