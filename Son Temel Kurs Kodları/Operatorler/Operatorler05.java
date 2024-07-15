package Operatorler;

public class Operatorler05 {

	public static void main(String[] args) {
		
		String a = "KEREM GÜRBÜZ";
		String b = "KEREM GÜRBÜZ";
		System.out.println("String' in uzunluğu :" + a.length());
		System.out.println("J ile başlıyor mu ?" + a.startsWith("j"));
		System.out.println("Z ile bitiyor mu ?" + a.endsWith("Z"));
		System.out.println("5. indexteki karakter ?" + a.charAt(5));	
		System.out.println("Büyük harfler :" + a.toUpperCase());
		System.out.println("Küçük harfler :" + a.toLowerCase());
		System.out.println("Trim metodunu kullanmadan önce :" + a);
		System.out.println("Trim metodunu kullandıktan sonra :" + a.trim());
		System.out.println("a eşit mi b ye :" + a.equals(b));
	}

}
