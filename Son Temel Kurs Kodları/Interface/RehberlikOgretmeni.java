package Interface;

public class RehberlikOgretmeni implements OkulYonetimi{
	
	String soncalistigikurum(String soncalisilankurum) 
	{
		return soncalisilankurum;
	}

	@Override
	public int yas(int basvuranyasi) {
		return basvuranyasi;
	}

	@Override
	public int egitimtecrubesi(int basvurantecrubesi) {
		return basvurantecrubesi;
	}

	@Override
	public String medenihali(String medenihal) {
		return medenihal;
	}
	

}
