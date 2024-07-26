package Diziler;

public class Diziler03 {

	public static void main(String[] args) {
		
		int [] a ;
		int [] b ;
		a = new int [] {4,5,7};
		b = a;
		diziyibastir(b);
	}
static void diziyibastir(int [] b) 
   {
	for(int i :b)
	{
		System.out.println("Dizideki değerler :" + i);
	}
   }


}
