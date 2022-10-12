package Collection;

import java.util.Vector;

public class Vectors {
	public static void main(String[] args) {
		
	Vector v=new Vector();
	v.add("tushar");
	v.add(100);
	v.add(null);
	v.add(null);
	v.add("bhamare");
	v.add(5000);
	System.out.println(v.size());
	System.out.println(v.capacity());
	System.out.println(v.isEmpty());
	System.out.println(v.contains(200));
	System.out.println(v.get(0));
	v.add(0,"Tushki");
	System.out.println(v);
	
	}


	}



