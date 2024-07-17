package Kosullar;

import java.util.Scanner;

public class Kosullar01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("LÜTFEN ALDIĞINIZ NOTU GİRİN :");
		
		int not ;
		
		not = scanner.nextInt();
		
		if(not >= 90) {
			System.out.println("HARF NOTU 'A'");
		}else if(not >= 80) {
			System.out.println("HARF NOT 'B'");
		}else if(not >= 70) {
			System.out.println("HARF NOTU 'C'");
		}else if(not >= 60) {
			System.out.println("HARF NOTU 'D'");
		}else {
			System.out.println("HARF NOTU 'F'");
		}

	}

}
