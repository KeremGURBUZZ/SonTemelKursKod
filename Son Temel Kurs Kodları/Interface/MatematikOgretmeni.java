package Interface;

public class MatematikOgretmeni implements OkulYonetimi{

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
