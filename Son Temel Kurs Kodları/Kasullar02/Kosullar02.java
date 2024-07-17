package Kosullar;

import java.util.Scanner;

public class Kosullar02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String kadi1 = "KEREMGRBZ";
		String ksifre1 = "112233";
		
		
		System.out.print("LÜTFEN KULLANICI ADINI GİRİNİZ :");
		String kadi2 = scanner.nextLine();
		System.out.print("LÜTFEN ŞİFRENİZİ GİRİNİZ :");
		String ksifre2 = scanner.nextLine();
		
		if(kadi1.equals(kadi2) && ksifre1.equals(ksifre2)) 
		{
			System.out.println("GİRİŞ BAŞARILI \n HOŞGELDİNİZ.");
			
		}
		else if(kadi1.equals(kadi2) &&! ksifre1.equals(ksifre2))
		{
			System.out.println("GİRMİŞ OLDUĞUNUZ ŞİFRE HATALIDIR.");
		}
		else if(!kadi1.equals(kadi2) && ksifre1.equals(ksifre2))
		{
			System.out.println("GİRMİŞ OLDUĞUNUZ KULLANICI ADI HATALIDIR.");
		}
		else
		{ 
			System.out.println("GİRMİŞ OLDUĞUNUZ KULLANICI ADI VE ŞİFRE HATALIDIR.");
		}
   scanner.close();
	}

}
