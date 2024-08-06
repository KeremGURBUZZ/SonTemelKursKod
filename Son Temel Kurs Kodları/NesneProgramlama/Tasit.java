package NesneProgramlama;

public class Tasit {
		
		private String renk ;
		private int model ;
		private int koltuksayisi;
		
		//constructors
		
		public Tasit(String renk , int model , int koltuksayisi) 
		{
			this.renk = renk;
			this.model = model;
			this.koltuksayisi = koltuksayisi;
		}
		
		public String getrenk() 
		{
			return renk;
		}
		public int getmodel() 
		{
			return model;
		}
		public int getkoltuksayisi() 
		{
			return koltuksayisi;
		}
		
		public void setRenk(String renk) 
		{
			this.renk = renk;
		}
		public void setModel(int model) 
		{
			this.model = model;
		}
		public void setKoltuksayisi(int koltuksayisi) 
		{
			this.koltuksayisi = koltuksayisi;
		}
		
		public void yazdir() 
		{
			System.out.println("TAŞITIMIZIN ÖZELLİKLERİ");
			System.out.println("Taşıtın rengi =" + this.renk);
			System.out.println("Taşıtın modeli =" + this.model);
			System.out.println("Taşıtın koltuksayısı =" + this.koltuksayisi);
		}



	

}
