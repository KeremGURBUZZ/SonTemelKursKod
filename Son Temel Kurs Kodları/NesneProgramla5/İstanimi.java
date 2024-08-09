package NesneProgramla5;

public class İstanimi {

    private String ad;      
    private String soyad;   
    private int kimlikno;   

    
    public İstanimi(String ad, String soyad, int kimlikno) {
        this.ad = ad;
        this.soyad = soyad;
        this.kimlikno = kimlikno;
    }

    
    public String getAd() {
        return ad;
    }

    
    public void setAd(String ad) {
        this.ad = ad;
    }

    
    public String getSoyad() {
        return soyad;
    }

    
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    
    public int getKimlikno() {
        return kimlikno;
    }

    
    public void setKimlikno(int kimlikno) {
        this.kimlikno = kimlikno;
    }

    
    void yakakartı() {
        System.out.println("AD: " + ad);
        System.out.println("SOYAD: " + soyad);
        System.out.println("KİMLİK NO: " + kimlikno);
    }
}
