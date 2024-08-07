package NesneProgramlama4;

import java.util.Random;

public class Sekreter {
	
	Random rnd = new Random();
	private String ad;
	private int ucret = 5000;
	private int faturano = rnd.nextInt(50);
	
	public Sekreter(String ad) 
	{
		this.ad = ad;
	}
	public Random getRnd() 
	{
		return rnd;
	}
	public void setRnd(Random rnd) 
	{
		this.rnd = rnd;
	}
	public String getAd() 
	{
		return ad;
	}
	public void setAd(String ad) 
	{
		this.ad = ad;
	}
	public int getUcret() 
	{
		return ucret;
	}
	public void setUcret(int ucret) 
	{
		this.ucret = ucret;
	}
	public int getFaturano() 
	{
		return faturano;
	}
	public void setFaturano(int faturano) 
	{
		this.faturano = faturano;
	}
	
	void yazdır() 
	{
		String yazdır = "Kurs kayıt işleminiz " + ad + " tarafından işleme alınmıştır.\n"
				+ "Lütfen ilgili fatura numarasını muhasebe birimine iletiniz.\n"
				+ "Fatura numaranız : " + faturano;
		System.out.println(yazdır);
	}
	
}
