package NesneProgramlama;

public class Firma {

	public static void main(String[] args) {
		
		Yolcu y = new Yolcu("Sıla Tekbaş","Köprü ");
		Yolcu y2 = new Yolcu("Merve Demir","Ofis ");
		y.yazdır();
		y2.yazdır();
		System.out.println("Otobüsteki yolcu sayısı :" + Yolcu.getYolcusayisi());

	}

}
