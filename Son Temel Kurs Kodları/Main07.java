import java.util.Scanner;

public class Main07{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ürün fiyatlarını kullanıcıdan al
        System.out.println("Lütfen ürün fiyatlarını giriniz:");
        int urunFiyati1 = scanner.nextInt();
        int urunFiyati2 = scanner.nextInt();
        int urunFiyati3 = scanner.nextInt();

        // Ürünlerin toplam fiyatını hesapla
        int urunToplami = urunFiyati1 + urunFiyati2 + urunFiyati3;
        System.out.println("Toplam Ücret: " + urunToplami);

        // Kargo ücretini kontrol et
        if (urunToplami > 100) {
            System.out.println("Kargonuz ücretsizdir.");
        } else {
            System.out.println("Kargonuz ücretlidir. Ücret 10 TL'dir.");
        }
    }
}
