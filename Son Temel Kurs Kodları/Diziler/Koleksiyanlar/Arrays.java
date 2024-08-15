package Koleksiyanlar;

import java.util.ArrayList;
import java.util.List;

public class Arrays {

	public static void main(String[] args) {
		
	   List<String>a1 = new ArrayList();
	   ArrayList<String>a2 = new ArrayList<String>();
	   
	   a1.add("Çağla Gürbüz");
	   a1.add("Kerem Gürbüz");
	   a1.add("Velat Şengül");
	   a1.add("Tahir Kutlay");
	   System.out.println(a1);
	   System.out.println(" ");
	   
	   
	   for(String s : a1) 
	   {
		   System.out.println("Üye :" + s);
	   }
	   
	   a1.remove(2);
	   System.out.println(" ");
	   
	   
	   for(int i = 0; i<a1.size(); i++) 
	   {
		   System.out.println("Üye :" + a1.get(i));
	   }
	}

}
