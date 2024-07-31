import java.util.Scanner;

public class Fonksiyonlar01 {
	
	static void cikti() 
	{
		System.out.println("Değer");
	}
	
	static void yazdir(int x , int y) 
	{
		System.out.println("parametre x'değeri :" + x + " parametre y'nin değeri :" + y);
	}
	static int faktoriyel(int a) 
	{
		
		if(a<=1) 
		{
			return(1);
		}
		else  
		{
			return(a * faktoriyel(a-1));
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Birinci");
		cikti();
		System.out.println("İkici");
		int a = 3;
		int b = 5;
		System.out.println("Değişken a nın değeri :" + a + " Değişken b nin değeri :" + b);
		yazdir(a,b);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Faktoriyel sayısı :");
		int sayi = scanner.nextInt();
		faktoriyel(sayi);
		if(sayi<0) 
		{
			System.out.println("Lütfen 0 veya 0 dan büyük bir değer giriniz ");
		}
		else 
		{
			System.out.println(sayi + "!=" + faktoriyel(sayi));
		}

	}

}
