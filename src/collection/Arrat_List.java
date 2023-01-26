package collection;

import java.util.ArrayList;//collections are present in java.util pkg

public class Arrat_List {
	 public static void main(String[] args) {
			
		
		 ArrayList al = new ArrayList ();// in collection constructor name and class in is diff.
		 
		 al.add("ganesh ");
		 al.add("DINESH");
		 al.add(210);
		 al.add(21.02);
		 al.add(null);
		 al.add(210.25);
		 al.add(215);
		 al.add(null);
		 al.add('q');
		 al.add("geeta");
		 al.add('b');
		 al.add(10.55);

		
	 
	 System.out.println(al);// print all data
	 
	 System.out.println(al.size());//it will check the size of array
	 
	 System.out.println(al.isEmpty()); // it will check array set is empty or not 
	 
	System.out.println(al.contains(100));// it will check the particular data is contain or not
	
	System.out.println(al.contains(210));
	
	System.out.println(al.get(2));// insertion(right shift operator)
	al.add(2,5000);
	System.out.println(al.get(2));
	
	System.out.println(al);//right shift operation
	
	al.remove(2);//remove the data (left shift operation
	
	System.out.println(al);//left shift

	
	
	
	
	
	
	 
	 
	 }
	

}
