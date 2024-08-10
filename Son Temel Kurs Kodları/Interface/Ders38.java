package Interface;

import java.util.Scanner;

public class Ders38 {

    public static void main(String[] args) throws InterruptedException {

        String message = "Eğitim kururmumuzun iş başvurusuna hoşgeldiniz.\n"
                + "İlk olarak matematik öğretmenleri mülakata alınacaktır.\n"
                + "Aşağıdaki soruları sırayla cevaplayınız.\n"
                + "1-) Kaç yaşındasınız?";
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        int yasa = scanner.nextInt();
        MatematikOgretmeni m = new MatematikOgretmeni();
        m.yas(yasa);

        System.out.println(" ");

        String message2 = "2-) Kaç yıldır eğitim sektöründesiniz?";
        System.out.println(message2);
        int yıla = scanner.nextInt();
        scanner.nextLine(); // int bir verinin ardından String veri girmek için bir kere nextLine komutunu girmelisiniz!
        m.egitimtecrubesi(yıla);

        System.out.println(" ");

        String message3 = "3-) Evli veya bekar mısınız?";
        System.out.println(message3);
        String durum = scanner.nextLine();
        m.medenihali(durum); 
        Thread.sleep(3000);
        System.out.println(" ");

        String messageb = "Rehberlik danışmanı mülakatımız başlamıştır.\n"
                + "Aşağıdaki soruları sırası ile cevaplayınız.\n"
                + "1-) En son nerede çalıştınız (Özel sektör veya devlet kurumu)?";
        System.out.println(messageb);
        RehberlikOgretmeni r = new RehberlikOgretmeni();
        String cevap = scanner.nextLine();
        r.soncalistigikurum(cevap);

        String messageb2 = "2-) Kaç yaşındasınız?";
        System.out.println(messageb2);
        int cevap2 = scanner.nextInt();
        r.yas(cevap2);

        String messageb3 = "3-) Kaç yıldır eğitim sektöründesiniz?";
        System.out.println(messageb3);
        int cevap3 = scanner.nextInt();
        r.egitimtecrubesi(cevap3);

        scanner.nextLine();

        String messageb4 = "4-) Evli veya bekar mısınız?";
        System.out.println(messageb4);
        String cevap4 = scanner.nextLine();
        r.medenihali(cevap4);

        System.out.println("Matematik öğretmenliği mülakat sonuçları değerlendiriliyor...");
        Thread.sleep(3000);
        if (yasa < 40 && yıla >= 3 && durum.equals("Bekar")) {
            System.out.println("Matematik öğretmeni mülakatınız başarıyla tamamlandı.");
        } else {
            System.out.println("Üzgünüz, şartları sağlayamadığınız için mülakatı geçemediniz.");
        }

        System.out.println("Rehberlik öğretmenliği mülakat sonuçları değerlendiriliyor...");
        Thread.sleep(3000);
        if (cevap.equals("Devlet kurumu") && cevap2 < 50 && cevap3 >= 4 && !cevap4.equals(null)) {
            System.out.println("Rehberlik öğretmeni mülakatınız başarıyla tamamlandı.");
        } else {
            System.out.println("Üzgünüz, şartları sağlayamadığınız için mülakatı geçemediniz.");
        }
    }
}
