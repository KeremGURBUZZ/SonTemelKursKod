package NesneProgramla5;

public class Noroloji extends İstanimi {

    private String diplomaaldigikurum;

    public Noroloji(String ad, String soyad, int kimlikno, String diplomaaldigikurum) {
        super(ad, soyad, kimlikno);
        this.diplomaaldigikurum = diplomaaldigikurum; 
    }


    void uykubozuklugu() throws InterruptedException {
        System.out.println("Doktor " + getAd() + " tarafından uyku bozukluğuna yönelik tedavi uygulanıyor...");
        Thread.sleep(3000); 
        System.out.println("Tedavi başarıyla gerçekleşti.");
    }

    void basagrisi() throws InterruptedException {
        System.out.println("Doktor " + getAd() + " tarafından baş ağrısına yönelik tedavi uygulanıyor...");
        Thread.sleep(3000); 
        System.out.println("Tedavi başarıyla gerçekleşti.");
    }

    @Override
    void yakakartı() {  
        super.yakakartı(); 
        System.out.println("DİPLOMA ALDIĞI KURUM: " + diplomaaldigikurum); 
    }
}
