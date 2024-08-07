package NesneProgramlama4;

import java.util.Scanner;

public class Muhasebe {
	
	private String ad;
	public Muhasebe(String ad) 
	{
		this.ad = ad;
	}
	public void degerlendirme(Sekreter s) throws InterruptedException {
		while(true) 
		{
			Scanner scanner = new Scanner(System.in);
			int faturanumarası;
			String a = "Merhaba ben bu kursun muhasebesinden sorumluyum.\n"
					+ "Lütfen kayıt işlemini tamamlamak için fatura numarasını giriniz :";
			System.out.println(a);
			faturanumarası = scanner.nextInt();
			if(faturanumarası==s.getFaturano()) 
			{
				System.out.println(" ");
				System.out.println("Fatura  numarası kontrol ediliyor...");
				Thread.sleep(3000);
				String message = "Kursun muhasebe biriminden sorumlu" + ad + " tarafından kontrol edildi ve doğru olduğu görüldü.\n"
						+ "Kursumuza hoşgeldiniz.";
				System.out.println(message);
				return;
			}
			else 
			{
				System.out.println(" ");
				System.out.println("Fatura numarası kontrol ediliyor...");
				Thread.sleep(3000);
				String message2 = "Kursun muhasebe biriminden sorumlu " + ad + " tarafından kontrol edildi ve yanlış olduğu görüldü.\n"
						+ "Lütfen fatura numarasını tekrar giriniz.";
				System.out.println(message2);
			}
		}
	}

}
