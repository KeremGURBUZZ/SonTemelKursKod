package NesneProgramla5;

public class Kardiyoloji extends İstanimi {

    private String unvan;  

    public Kardiyoloji(String unvan, String ad, String soyad, int kimlikno) {
        super(ad, soyad, kimlikno);  
        this.unvan = unvan;  
    }

    void riskhesapla() throws InterruptedException {
        System.out.println(unvan + " doktor " + getAd() + " tarafından kalp krizi hesaplanıyor..");
        Thread.sleep(3000);  
        System.out.println("İnceleme başarıyla tamamlandı.");
    }
    
    void ekg() throws InterruptedException {
        System.out.println(unvan + " doktor " + getAd() + " tarafından EKG çekimi tamamlanıyor...");
        Thread.sleep(3000);  
        System.out.println("EKG başarıyla çekildi.");
    }
 
    @Override
    void yakakartı() {
        super.yakakartı();  
        System.out.println("Unvan : " + unvan);  
    }
}
