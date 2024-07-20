package Kosullar;

import java.util.Scanner;

public class Kosullar04 {

    public static void main(String[] args) throws InterruptedException {
        // KAHVE MAKİNASI YAZILIMI
        Scanner scanner = new Scanner(System.in);

        String kahvecesitleri =
                "1-) DİBEK KAHVESİ \n" +
                "2-) MENENGİÇ KAHVESİ\n" +
                "3-) ÇÖREKOTU KAHVESİ\n" +
                "4-) ADANA GAR KAHVESİ\n" +
                "5-) SÜTLÜ TÜRK KAHVESİ\n";
        System.out.print(kahvecesitleri);
        System.out.println();
        
        int kahvesecimi = getKahveSecimi(scanner);

        String seker = 
                "a-) Şekersiz\n" +
                "b-) Az şekerli\n" +
                "c-) Orta şekerli\n" +
                "d-) Şekerli\n";
        System.out.print(seker);
        
        String sekersayisi = getSekerSecimi(scanner);

        String secim = "";
        switch (sekersayisi) {
            case "a":
                secim = "Şekersiz";
                break;
            case "b":
                secim = "Az şekerli";
                break;
            case "c":
                secim = "Orta şekerli";
                break;
            case "d":
                secim = "Şekerli";
                break;
            default:
                System.out.print("Şeker seçiminiz hatalıdır lütfen a-b-c-d değerlerinden birini seçiniz.");
                return;
        }

        hazirlaKahve(kahvesecimi, secim);

        scanner.close();
    }

    private static int getKahveSecimi(Scanner scanner) {
        int kahvesecimi;
        while (true) {
            System.out.print("Almak istediğiniz kahvenin sayısını giriniz: ");
            if (scanner.hasNextInt()) {
                kahvesecimi = scanner.nextInt();
                if (kahvesecimi >= 1 && kahvesecimi <= 5) {
                    break;
                } else {
                    System.out.println("Lütfen 1 ile 5 arasında bir sayı giriniz.");
                }
            } else {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                scanner.next(); // Geçersiz girişi temizle
            }
        }
        return kahvesecimi;
    }

    private static String getSekerSecimi(Scanner scanner) {
        scanner.nextLine(); // Bir önceki nextInt'ten kalan newline'ı temizle
        String sekersayisi;
        while (true) {
            System.out.print("Kahvenizin şeker durumunu giriniz: ");
            sekersayisi = scanner.nextLine();
            if (sekersayisi.equals("a") || sekersayisi.equals("b") || sekersayisi.equals("c") || sekersayisi.equals("d")) {
                break;
            } else {
                System.out.println("Geçersiz giriş. Lütfen a, b, c veya d değerlerinden birini giriniz.");
            }
        }
        return sekersayisi;
    }

    private static void hazirlaKahve(int kahvesecimi, String secim) throws InterruptedException {
        System.out.print("Kahveniz hazırlanıyor...\n");
        Thread.sleep(2000);

        String kahveAdi = "";
        switch (kahvesecimi) {
            case 1:
                kahveAdi = "Dibek kahvesi";
                break;
            case 2:
                kahveAdi = "Menengiç kahvesi";
                break;
            case 3:
                kahveAdi = "Çörekotu kahvesi";
                break;
            case 4:
                kahveAdi = "Adana Gar kahvesi";
                break;
            case 5:
                kahveAdi = "Sütlü Türk kahvesi";
                break;
            default:
                System.out.println("Kahve seçiminiz hatalıdır.");
                return;
        }

        String bildirim = secim + " " + kahveAdi + " hazır\nAfiyet olsun!";
        System.out.print(bildirim);
    }
}
