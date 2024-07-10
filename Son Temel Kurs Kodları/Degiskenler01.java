
public class Degiskenler01 {

	public static void main(String[] args) {
        
		int koyun = 5;
		int kedi = 9;
		int kopek = 4;
		int inek = 6;
		
		int sutSatısFiyati = 5;
		float gunlukSutMiktari = 158.45f;
		
		System.out.println("Koyun sayısı :"+ koyun);
		System.out.println("Köpek sayısı :"+ kopek);
		System.out.println("Kedi sayısı :"+ kedi);
		System.out.println("İnek sayısı :"+ inek);
		
		double sutGeliri = sutSatısFiyati * gunlukSutMiktari;
		int toplamHayvanSayısı = koyun+kedi+kopek+inek;
		
		System.out.println("Çiftlikteki hayvan sayısı :" + toplamHayvanSayısı);
		System.out.println("Toplam süt geliri :" + sutGeliri);

	}

}
