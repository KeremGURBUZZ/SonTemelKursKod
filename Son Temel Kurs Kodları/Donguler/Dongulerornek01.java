package Donguler;

import java.util.Random;
import java.util.Scanner;

public class Dongulerornek01 {
	
     public static void main(String[] args) {
    	 
    	 int tahminhakki = 6;
    	 String message1 = "Sayı tahmin oyunumuza hoşgeldiniz\n"
    	 		+ "Oyunumuzdaki tahmin edilecek sayı 0 ile 20 arasındadır ve 6 tahmin hakkınız bulunmaktadır.\n"
    	 		+ "Tahmin bitince oyun sonlanır.\n"
    	 		+ "Ancak eğer isterseniz tekrar rastgele bir sayı atayarak oyunu baştan başlatabilirsiniz.\n"
    	 		+ "Oyun başladı\n Başarılar...\n"
    	 		+ "LÜTFEN TAHMİNİNİZİ GİRİNİZ :";
    	 		
    	       
    	 while(true)
    	 {
    		 System.out.println(message1);
    		 Random random = new Random();	
    		 int tahminedileceksayi = random.nextInt(21); // 0-20
    		 Scanner scanner = new Scanner(System.in);
    		 for(int i = tahminhakki; i > 0; i--)
    		 {
    			int tahminedilensayi = scanner.nextInt();
    			if(tahminedileceksayi == tahminedilensayi) 
    			{	
    				String message2 = "Tebrikler sayıyı doğru tahmin ettiniz\n"
    						+ "Tekrar oynamak için 1'e çıkmak için 0'basınız.";
    				System.out.println(message2);
    				int cevap = scanner.nextInt();
    				if(cevap == 0) 
    				{
    					System.out.println("Çıkış yapılıyor...");
    				}
    				else 
    				{
    					break;		
    				}
    			}
    			else if(tahminedileceksayi != tahminedilensayi)
    			{
    				System.out.println("Hatalı bir tahmin yaptınız." + " " + "Kalan tahmin hakkı : " + (i - 1));
    				if(i == 1)
    				{
    					String massage3 = "Tahmin hakkınız bitti.\n"
    							+ "Tekrar oynamak için 1'e çıkmak için 2'ye basınız.";
    					System.out.println(massage3);
    					int cevap = scanner.nextInt();
    					if(cevap == 0) 
    					{
    						System.out.println("Çıkış yapılıyor...");
    					}
    					else 
    					{
    						break;
    					}
    					tahminorani (tahminedilensayi , tahminedileceksayi);
    				}
    				
    			}
    		 }
    	 }
    	 
	
  }
     static void tahminorani (int tahminedilensayi , int tahminedileceksayi)
     {
              int f = tahminedileceksayi - tahminedilensayi;
              if(f <= 0  &&  f > -2  ||  f >= 0  &&  f < 2 )
              {
            	System.out.println("Sayıya çok yaklaştınız!");  
              }
              else if(f <= -2  &&  f > -4  ||  f >= 2  &&  f < 4 )
              {
            	System.out.println("Sayıya yaklaşıyorsunuz!");  
              }
              else if(f <= -4  &&  f > -14  ||  f >= 4  &&  f < 14 )
              {
            	System.out.println("Sayıdan uzaklaşıyorsunuz!");  
              }
              else if(f <= -15  &&  f > -19  ||  f >= 15  &&  f < 19 )
              {
            	System.out.println("Sayıdan çok uzaklaştınız!");  
              }
     }
}
