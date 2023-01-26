package collection;

import java.util.Vector;

public class Vector_ {
	public static void main(String[] args) {
		Vector v = new Vector();
		
		v.add("Minal");
		v.add("minakshi");
		v.add('#');
		v.add("minakshi");
		v.add(null);
		v.add(null);
		
		System.out.println(v.capacity());//by default capacity is 10
		
		System.out.println(v);
		 
		System.out.println(v.size());// check the size vector
		
		System.out.println(v.contains('#'));//check particular data is contain or not
		
		System.out.println(v.isEmpty());//check it is empty or not
		
		System.out.println(v.get(2));
		
		v.add(3, "minu");
		System.out.println(v);//right shift operator
		
		v.remove(3);//lift shift
		
		System.out.println(v);
		
		
		
		
	}

	

}
