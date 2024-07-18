import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Performans değerlendirme puanını gir
        System.out.println("Lütfen İşçinin Performans Değerlendirme Puanını Giriniz (0-100 arası):");
        int performansPuani = scanner.nextInt();
        
        if (performansPuani < 0 || performansPuani > 100) {
            System.out.println("Hatalı Bir Değer Girdiniz Lütfen Tekrar Deneyiniz!");
        } else if (performansPuani >= 90) {
            System.out.println("Performans Notu: Mükemmel");
        } else if (performansPuani >= 75) {
            System.out.println("Performans Notu: İyi");
        } else if (performansPuani >= 50) {
            System.out.println("Performans Notu: Orta");
        } else {
            System.out.println("Performans Notu: Zayıf");
        }
    }
}
