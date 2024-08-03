
import java.util.Scanner;

//0 ile x (x kullanıcıdan alınacak) arasında olan asal sayıları bulan program

public class Main05 { 
	
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Lütfen asal sayıları bulmak için bir değer giriniz :");
    	
    	int sayi=scanner.nextInt();
    	
    	boolean asalMi=true;
    	
    	for(int i = 1; i< sayi; i++) {
    		for(int j = 2;j < i; j++) {
    			if(i%j==0) {
    				asalMi=false;
    			}
    		}
    		if(asalMi==false) {
    			System.out.println(i +"Sayisi Asal Değildir.");
    		}else {
    			System.out.println(i +"Sayisi Asaldır.");
    		}
    		asalMi=true;
    	}
    	
    	
    }
    
}

