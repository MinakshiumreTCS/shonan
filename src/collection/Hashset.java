package collection;

import java.util.HashSet;

public class Hashset {
	public static void main(String[] args) {
		HashSet hs =new HashSet();
		
		hs.add("shri");
		hs.add("null");//null value is one allow
		hs.add("null");
		hs.add("789");
		hs.add('e');
		hs.add("10.52");
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.contains("789"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.getClass());
		System.out.println(hs.isEmpty());
		System.out.println(hs.remove("10.52"));
		
	}

}
