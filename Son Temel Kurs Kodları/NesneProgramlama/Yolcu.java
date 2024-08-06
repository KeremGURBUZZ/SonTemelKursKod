package NesneProgramlama;

public class Yolcu {
	
	private static int yolcusayisi =0;
	private String yolcuadi;
	private String durakadi;
	
	public Yolcu(String yolcuadi, String durakadi) 
	{
		this.yolcuadi = yolcuadi;
		this.durakadi = durakadi;
		yolcusayisi++;
	}
	
	public static int getYolcusayisi() 
	{
		return yolcusayisi;
	}
	public static void setYolcusayisi(int yolcusayisi) 
	{
		Yolcu.yolcusayisi = yolcusayisi;
	}
	public String  getYolcuadi() 
	{
	    return yolcuadi;
	}
	public void setYolcuadi(String yolcuadi) 
	{
		this.yolcuadi = yolcuadi;
	}
	public String getDurakadi() 
	{
		return durakadi;
	}
	public void setDurakadi(String durakadi) 
	{
		this.durakadi = durakadi;
	}
	public void yazdır() 
	{
		String yolcubilgisi = yolcuadi + " Otobüsümüze " + durakadi + "Durağında bindi..";
		System.out.println(yolcubilgisi);
	}

}
