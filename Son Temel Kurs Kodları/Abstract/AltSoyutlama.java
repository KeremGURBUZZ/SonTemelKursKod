package Abstract;

public class AltSoyutlama extends Soyutlama{

	public AltSoyutlama(String isim) {
		super(isim);
	}
	
	@Override
	void isim() 
	{
		super.isim();
	}

	@Override
	void soyutmetod() {
		System.out.println("Metod gövdeli hale getirildi.");
		
	}

}
