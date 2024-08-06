package NesneProgramlama;

public class Otomobil extends Tasit{

	public Otomobil(String renk, int model, int koltuksayisi) {
		super(renk, model, koltuksayisi);
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		Tasit tasit = new Tasit("Siyah" , 2019 , 4);
		//Tasit tasit2 = new Tasit("Siyah");
		System.out.println("Otomobilin rengi = " + tasit.getrenk());
		System.out.println("Otomobilin koltuk sayısı = " + tasit.getkoltuksayisi());
		tasit.setKoltuksayisi(5);
		System.out.println("Otomobilin koltuk sayısı = " + tasit.getkoltuksayisi());
		System.out.println(" ");
		System.out.println(" ");
		
		
		Tasit tasit2 = new Tasit("Siyah" , 2020 , 6);
		tasit2.yazdir();
		
		
	}

}
