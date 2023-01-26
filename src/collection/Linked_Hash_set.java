package collection;

import java.util.LinkedHashSet;

public class Linked_Hash_set {
	public static void main(String[] args) {
		LinkedHashSet lh = new LinkedHashSet();
		
		lh.add(45);
		lh.add("pu");
		lh.add('*');
		lh.add(null);
		lh.add("pu");
		
		System.out.println(lh);
		
		System.out.println(lh.getClass());
		
	   System.out.println(lh.add('*'));
		
	   System.out.println(lh.isEmpty());
		
		System.out.println(lh.size());
		
		
		
	}

}
