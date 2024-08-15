package Koleksiyanlar;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<String>();
        linked.add("çağla");
        linked.add("kerem");
        linked.add("velat");
        linked.add("tahir");

        for (String s : linked) 
        {
            System.out.println("üye-" + s);
        }
        System.out.println("3. indexteki eleman :" + linked.get(3));
        System.out.println(" ");
        linked.add(0,"berat");
        for(int i = 0;i<linked.size();i++) 
        {
        	System.out.println("üye-" + linked.get(i));
        }
        linked.clear();
        System.out.println(" ");
        linked.add("süleyman");
        for(String s2:linked) 
        {
        	System.out.println("üye-" + s2);
        }
    }
}
