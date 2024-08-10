package Polymorphism;

public class Cokluclass {
	
	void sescikar() 
	{
		System.out.println("Hayvan ses çıkarıyor...");
	}

	public static void main(String[] args) {
		
		Cokluclass [] x = new Cokluclass [3];
		x [0] = new Kopek();
		x [1] = new Kedi();
		x [2] = new Aslan();
		for(int i = 0; i < x.length; i++) 
		{
			x[i].sescikar();
		}

	}

}

class Kopek extends Cokluclass
{
	@Override 
	void sescikar() 
	{
		super.sescikar();
		System.out.println("Köpek havlıyor...");
	}
}
class Kedi extends Cokluclass
{
	@Override 
	void sescikar() 
	{
		super.sescikar();
		System.out.println("Kedi miyavlıyor...");
	}
}
class Aslan extends Cokluclass
{
	@Override 
	void sescikar() 
	{
		super.sescikar();
		System.out.println("Aslan kükrüyor...");
	}
}
