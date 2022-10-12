package Collection;

import java.util.ArrayList;

public class arraylist {
public static void main(String[] args) {
	ArrayList al=new ArrayList ();
	al.add("Tushar");
	al.add("143");
	al.add("Bhamare");
	al.add(null);
	al.add('A');
	System.out.println(al);
	System.out.println(al.size());
	System.out.println(al.contains("bhamare"));
	System.out.println(al.add("3,120"));
}

}
