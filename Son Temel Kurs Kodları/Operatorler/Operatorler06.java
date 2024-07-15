package Operatorler;

import java.util.Scanner;

public class Operatorler06 {

	public static void main(String[] args) {
		
		double faiz_orani = 24;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Yatırmak istediğiniz para tutarını giriniz :");
		double ana_para = scanner.nextDouble();
		System.out.print("Vade süresini giriniz (yıl cinsinde) :");
		int vade_suresi = scanner.nextInt();
		
		double faiz_getirisi = (ana_para) * (faiz_orani/100) * vade_suresi;
		double toplam_getiri = ana_para+faiz_getirisi;
		System.out.print("faiz getirisi :" + faiz_getirisi + "TL' DİR.");
		System.out.print("faiziyle beraber alınan tutar :" + toplam_getiri + "TL'DİR.");
		

	}

}
