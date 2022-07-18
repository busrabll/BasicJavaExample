
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lütfen bir sayý giriniz:");
        
        int sayi = scanner.nextInt();
        
        int sayac = 0,
                toplam = 0,
                gecicisayi1 = sayi,
                gecicisayi2 = gecicisayi1,
                a;
        
        double b;
        
        while(sayi > 0)
        {
            sayi /= 10;
            
            sayac++;
        }
        
        do{
            
            a = gecicisayi1%10;
            
            b = Math.pow(a,sayac);
            
            gecicisayi1 /= 10;
            
            toplam += b;
            
        }while(gecicisayi1 > 0);
        
        if(gecicisayi2 == toplam){
            
            System.out.println("Girdiðiniz sayý armstrong sayýdýr.");
        }
        else{
            
            System.out.println("Girdiðiniz sayý armstrong sayý deðildir.");
        }

    }
}
