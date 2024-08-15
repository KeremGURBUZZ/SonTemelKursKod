package Koleksiyanlar;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorExample {

	public static void main(String[] args) {
	
		LinkedList<String>linked1 = new LinkedList();
		linked1.add("kerem");
		linked1.add("çağla");
		linked1.add("velat");
		linked1.add("tahir");
		
		Iterator<String> i1 = linked1.iterator();
		while(i1.hasNext()) 
		{
			System.out.println("üye- " + i1.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		yazdir(linked1);
		

	}
 // public static void yazdir(LinkedList<String>linked1) 
  {
	//  ListIterator<String>a = linked1.listIterator();
	//  while(a.hasNext()) 
	  {
	//  System.out.println("üye- " + a.next());
	  }
  }
}
