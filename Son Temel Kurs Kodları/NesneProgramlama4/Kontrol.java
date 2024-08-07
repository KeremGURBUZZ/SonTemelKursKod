package NesneProgramlama4;

import java.util.Scanner;

public class Kontrol {

	public static void main(String[] args) throws InterruptedException {
		
		Sekreter s = new Sekreter("Çağla");
		Scanner scanner = new Scanner(System.in);
		String giris = "Kurs kayıt birimine hoş geldiniz.\n"
				+ "Ben bu kursta sekreter biriminden sorumlu " + s.getAd() + "\n"
						+ "Genel olarak kurs hakkında bilgi vermek gerekirse \n"
						+ "JAVA , Php , C# , .NET , C++ , C  yazılım dillerinde eğitim vermekteyiz\n"
						+ "Kurs ücretimiz 5000 TL'dir.\n"
						+ "Kursumuza kayıt yaptırmak için ücreti peşin ödemelisiniz.";
		System.out.println(giris);
		System.out.println(" ");
		System.out.print("Lütfen kaydolmak istediğiniz kursun adını giriniz :");
		String kursadi = scanner.nextLine();
		System.out.print("Lütfen kursa kaydolmak için muhasebeye yatıracağınız parayı giriniz :");
		int yatırılacakpara = scanner.nextInt();
		if(yatırılacakpara==s.getUcret()) 
		{
			System.out.println(" ");
			s.yazdır();
			Muhasebe m = new Muhasebe(" Kerem");
			m.degerlendirme(s);
		}
		else 
		{
			System.out.println("Ücretin tamamını ödemediğiniz için başvurunuz reddedildi.");
			return;
		}
				

	}

}
