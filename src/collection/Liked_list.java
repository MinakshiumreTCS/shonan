package collection;

import java.util.LinkedList;

public class Liked_list {
	public static  void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		l.add("Aai");
		l.add("Baba");
		l.add('$');
		l.add(null);
		l.add(null);
		l.add("Aai");
		
		System.out.println(l);
		
		System.out.println(l.size());
		System.out.println(l.contains("Aai"));
		System.out.println(l.isEmpty());
		System.out.println(l.get(0));
		l.add(1, 3);//
		System.out.println(l);
		l.remove(null);
		System.out.println(l);
		
		
	}

}
