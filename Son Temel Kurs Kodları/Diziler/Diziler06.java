package Diziler;

import java.util.Scanner;

public class Diziler06 {
	
	public static int toplamaliyet(int toplamsure)
	{
		int havaalanıgirisucreti = 50;
		int dkmaliyet = 2;
		return (toplamsure * dkmaliyet + havaalanıgirisucreti);
	}
	public static int toplamaliyet(int toplamsure, int otoparksuresi)
	{
		int havaalanıgirisucreti = 50;
		int dkmaliyet = 2;
		int otoparkmaliyeti = 3;
		return ((toplamsure * dkmaliyet) + (otoparksuresi * otoparkmaliyeti)  + havaalanıgirisucreti);
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		String message = "Havaalanımıza hoşgeldiniz\n"
				+ "Havaalanı giriş ücreti 50 TL'dir.\n"
				+ "Havaalanı araçsız girişler için A'kapısından araçlı "
				+ "girişler için B'kapısından giriş yapınız.\n"
				+ "Havaalanında geçirdiğiniz her süre için ücrete tabi tutulacaksınız\n"
				+ "ve bu ücreti çıkışta ödeyeceksiniz.\n"
				+ "Havaalanında geçirdiğiniz her dakika için 2TL ücret alınır\n"
				+ "Havaalanında aracınızla geçirdiğiniz her dakika için 2 TL ve ek olarak"
				+ " otoparkta geçirdiğiniz her dakika için 3 TL ücret alınır\n";
		System.out.println(message);
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Lütfen kapıyı seçiniz :");
		String kapısecimi = scanner.nextLine();
		while(true)
		{
			if(kapısecimi.equals("A")) 
			{
				String c1 = "Havaalanı çıkış gişesine hoş geldiniz.\n"
						+ "Lütfen havaalanında geçirdiğiniz toplam dakikayı giriniz :";
				System.out.println(c1);
				int toplamsure = scanner.nextInt();
				System.out.println("Toplam ödeme miktarı :" + toplamaliyet(toplamsure) + " TL'dir");
				System.out.println("Ödeme işleminiz gerçekleşiyor...");
				Thread.sleep(3000);
				System.out.println("Ödeme işleminiz başarıyla gerçekleşti iyi günler dileriz.");
				return;
			}
			else if(kapısecimi.equals("B")) 
			{
				String c2 = "Havaalanı çıkış gişesine hoş geldiniz.\n"
						+ "Lütfen havaalanında geçirdiğiniz toplam dakikayı giriniz :";
				System.out.println(c2);
				int toplamsure = scanner.nextInt();
				System.out.println("Aracınızın otoparkta kaldığı toplam süre :");
				int otoparksuresi = scanner.nextInt();
				System.out.println("Toplam ödeme miktarı :" + toplamaliyet(toplamsure,otoparksuresi) + " TL'dir");
				System.out.println("Ödeme işleminiz gerçekleşiyor...");
				Thread.sleep(3000);
				System.out.println("Ödeme işleminiz başarıyla gerçekleşti iyi günler dileriz.");
				return;
			}
			else 
			{
				System.out.println("Geçersiz bir seçim yaptınız.");
				break;
			}
		}
	
	}

}
