package Abstract;

public abstract class Soyutlama {
	abstract void soyutmetod();
	private String isim;
	void isim() 
	{
		System.out.println("Benim adım : " + isim);
	}
	public Soyutlama(String isim) 
	{
		this.isim = isim;
	}
		public String getİsim(String isim) 
		{
			return isim;
		}
		public void setİsim(String isim) 
		{
			this.isim = isim;
		}

}
