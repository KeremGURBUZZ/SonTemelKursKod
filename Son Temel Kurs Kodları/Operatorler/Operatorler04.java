package Operatorler;

import java.util.Scanner;

public class Operatorler04 {

	public static void main(String[] args) {
		//ALAN HESAPLAMASI YAPAN UYGULAMA
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dörtgenin kısa kenasını girin :");
		int kısa = scanner.nextInt();
		System.out.println("Dörtgenini uzun kenarını girin :");
		int uzun = scanner.nextInt();
		int alan = uzun * kısa ;
		System.out.println("Dörtgenin alanı :"+ alan);
		
		

	}

}
