package Kosullar;

import java.util.Scanner;

public class Kosullar03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("1,2 veya 3 numaralı rakamlardan birini seçiniz :");
		int islem = scanner.nextInt();
		
		switch(islem)
		{
		case 1: System.out.println("Kullanıcı tarafında 1 numaralı rakam seçildi.");
		break;
		
		case 2: System.out.println("Kullanıcı tarafında 2 numaralı rakam seçildi.");
		break;
		
		case 3: System.out.println("Kullanıcı tarafında 3 numaralı rakam seçildi.");
		break;
	default: System.out.println("1,2 ve 3 rakamlarından herhangi biri seçilmedi.");	
		}

	}

}
