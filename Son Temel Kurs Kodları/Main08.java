import java.util.Scanner;

public class Main08 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        
        while (continueLoop) {
            try {
                System.out.print("Lütfen bir sayı giriniz: ");
                int sayi = scanner.nextInt();
                
                System.out.println("0 ile " + sayi + " arasındaki tek sayılar:");
                for (int i = 0; i < sayi; i++) {
                    if (i % 2 != 0) {
                        System.out.println(i + " - Bu bir tek sayıdır.");
                    }
                }
                
                continueLoop = false; // Döngüden çıkmak için koşulu güncelliyoruz
            } catch (Exception e) {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                scanner.next(); // Hatalı girişi temizlemek için
            }
        }
        
        scanner.close();
    }
}
