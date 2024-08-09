package NesneProgramla5;

public class Bashekim extends İstanimi {

    private String unvan; 
    private String uzmanlıkalanı; 
    private int hizmetsuresi; 

    public Bashekim(String ad, String soyad, String unvan, String uzmanlıkalanı, int hizmetsuresi, int kimlikno) {
        super(ad, soyad, kimlikno);
        this.unvan = unvan;
        this.uzmanlıkalanı = uzmanlıkalanı;
        this.hizmetsuresi = hizmetsuresi;
    }

    
    void calis() throws InterruptedException {
        String s1 = "Başhekim " + getAd() + " doktorların yıllık iznini denetliyor...";
        Thread.sleep(3000); 
        String s2 = "Başhekim " + getAd() + " laboratuvar hizmetlerini denetliyor...";
        Thread.sleep(3000); 
        System.out.println(s1);
        System.out.println(s2);
    }

    
    @Override
    void yakakartı() {
        super.yakakartı(); 
        System.out.println("UNVAN: " + unvan);
        System.out.println("UZMANLIK ALANI: " + uzmanlıkalanı);
        System.out.println("HİZMET SÜRESİ: " + hizmetsuresi);
    }
}
