import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen İşçinin Saatlik Ücretini Giriniz:");
        double saatlikUcret = scanner.nextDouble();
        
        System.out.println("Lütfen İşçinin Toplam Çalışma Saatini Giriniz:");
        double calismaSaati = scanner.nextDouble();

        double toplamMaas = saatlikUcret * calismaSaati;

        if (calismaSaati < 0 || saatlikUcret < 0) {
            System.out.println("Hatalı Bir Değer Girdiniz Lütfen Tekrar Deneyiniz!");
        } else {
            System.out.println("İşçinin Toplam Maaşı: " + toplamMaas + " TL");
        }
    }
}
