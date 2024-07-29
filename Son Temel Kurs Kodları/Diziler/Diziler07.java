package Diziler;

import java.util.Scanner;

public class Diziler07 {

	public static void main(String[] args) {
		
		String [] a = new String[12];
		a [9] = "Sıla Tekbaş";
		a [2] = "Hüseyin Sandal";
		a [3] = "Sıla Özçelik";
		a [7] = "İrem Ergin";
		String giris = "Pansiyonumuza hoş geldiniz \n"
				+ "Pansiyonumuzda 12 oda bulunmaktadır.\n"
				+ "Lütfen pansiyonumuzda kalmak için adınızı ve soyadınızı ve"
				+ "kalmak istediğiniz oda numarasını giriniz :";
		System.out.println(giris);
		System.out.println(" ");
		System.out.println(" ");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("ADINIZ :");
		String ad = scanner.nextLine();
		System.out.print("SOY ADINIZ :");
		String soyad = scanner.nextLine();
		while(true)
		{
			System.out.println("Hoşgeldiniz" + ad + "BEY/HANIM" + " " +"Lütfen kalmak istediğiniz oda numarısını giriniz :");
			int oda = scanner.nextInt();
			for(int i = 0; i<a.length; i++) 
			{
				if(a[oda]!=null) 
				{
					System.out.println("Resepsiyon uyarısı-->" + (oda) + "numaralı oda" + a[oda] + "bulunuyor.");
					System.out.println(" ");
					System.out.println(ad+"BEY/HANIM" + oda + "numaralı odamız doludur. "
							+"Lütfen başka bir oda seçiniz.");
					break;
				}
				else 
				{
					System.out.println(ad + "BEY/HANIM" + (oda) + "numaralı odamız boş"
							+ "Odanıza yerleşebilirsiniz.");
					return;
				}
			}
			}

	}

}
