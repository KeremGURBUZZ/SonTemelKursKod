package Diziler;

import java.util.Arrays;

public class Diziler08 {

    public static void main(String[] args) {
       
        int[] numbers = {18, 5, 7, 2, 25, 10, 3};

        
        System.out.println("Orijinal Dizi: " + Arrays.toString(numbers));

     
        Arrays.sort(numbers);
        System.out.println("Sıralanmış Dizi: " + Arrays.toString(numbers));

    
        int toplam = 0;
        for (int number : numbers) {
            toplam += number;
        }
        System.out.println("Dizinin Toplamı: " + toplam);

   
        int max = numbers[0]; 
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Dizinin En Büyük Elemanı: " + max);

        
        int min = numbers[0]; 
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Dizinin En Küçük Elemanı: " + min);


        int aranacakSayi = 10;
        boolean bulundu = false;
        for (int number : numbers) {
            if (number == aranacakSayi) {
                bulundu = true;
                break;
            }
        }
        if (bulundu) {
            System.out.println("Dizide " + aranacakSayi + " sayısı bulundu.");
        } else {
            System.out.println("Dizide " + aranacakSayi + " sayısı bulunamadı.");
        }

      
        int[] kareler = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            kareler[i] = numbers[i] * numbers[i];
        }
        System.out.println("Elemanların Karesi: " + Arrays.toString(kareler));

        
        double ortalama = (double) toplam / numbers.length;
        System.out.println("Dizinin Ortalaması: " + ortalama);

   
        int ciftSayilar = 0;
        int tekSayilar = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                ciftSayilar++;
            } else {
                tekSayilar++;
            }
        }
        System.out.println("Dizideki Çift Sayıların Sayısı: " + ciftSayilar);
        System.out.println("Dizideki Tek Sayıların Sayısı: " + tekSayilar);


        System.out.print("Ters Dizi: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
