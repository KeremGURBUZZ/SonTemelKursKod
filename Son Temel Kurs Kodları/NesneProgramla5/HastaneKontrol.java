package NesneProgramla5;

import java.util.Scanner;

public class HastaneKontrol {

    public static void main(String[] args) throws InterruptedException {

        
        Bashekim b = new Bashekim("Profesör", "Kalp Hastalıkları", "Gürbüz", "Çağla", 8, 8888);

        Kardiyoloji k = new Kardiyoloji("Kerem", "Gürbüz", "Doçent", 18);

        Noroloji n = new Noroloji("Velat", "Şengül", 31, "Dicle Üniversitesi");

        Scanner scanner = new Scanner(System.in);

        String komut = "Hastane sistemine hoş geldiniz...\n"
                + "Yapılabilecek işlemler:\n"
                + "Başhekim birimleriyle ilgili işlemler için 1'e\n"
                + "Kardiyoloji birimleriyle ilgili işlemler için 2'ye\n"
                + "Nöroloji birimleriyle ilgili işlemler için 3'e\n"
                + "Sistemden çıkmak için 0'a basınız.";
        
        while (true) {
            System.out.println(komut);
            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
            String secim = scanner.nextLine();
            System.out.println(" ");
            
            if (secim.equals("0")) {
                System.out.println("Sistemden çıkılıyor...");
                Thread.sleep(3000);
                break;
            } else if (secim.equals("1")) {
                System.out.println("Başhekim birimine hoş geldiniz.\n"
                        + "Başhekim bilgileri tanımlanıyor.");
                b.yakakartı(); 
                b.calis(); 
                System.out.println("Başhekim çalışmasını bitirdi.");
            } else if (secim.equals("2")) {
                System.out.println("Kardiyoloji birimine hoş geldiniz.\n"
                        + "Kardiyoloji doktorunun bilgileri tanımlanıyor.");
                k.yakakartı();
                String s = "Kalp krizi riski hesaplamak için 1'e\n"
                        + "EKG çektirmek için 2'ye basınız.";
                System.out.println(s);
                String secim2 = scanner.nextLine();
                if (secim2.equals("1")) {
                    k.riskhesapla();
                } else if (secim2.equals("2")) {
                    k.ekg();
                } else {
                    System.out.println("Hatalı bir seçim yaptınız.");
                }
            } else if (secim.equals("3")) {
                System.out.println("Nöroloji birimine hoş geldiniz.\n"
                        + "Nöroloji doktorunun bilgileri tanımlanıyor.");
                n.yakakartı();
                String s2 = "Başağrısı tedavisi için 1'e\n"
                        + "Uyku bozukluğu tedavisi için 2'ye basınız."; 
                System.out.println(s2);
                String secim3 = scanner.nextLine();
                if (secim3.equals("1")) {
                    n.basagrisi();
                } else if (secim3.equals("2")) {
                    n.uykubozuklugu();
                } else {
                    System.out.println("Hatalı bir seçim yaptınız.");
                }
            } else {
                System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin.");
            }
        }

        scanner.close(); 

    }

}
