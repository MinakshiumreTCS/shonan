package this_super_keyword;

public class This_key {
	//BLC it does not have main method
	
	 int a = 10 ;// global variable
	 
     public  void test() {
		  int a = 20;
		System.out.println(a);// now i will print global variable from same class
		
		System.out.println(this.a);
		
	}
     public static void main(String[] args) {
		This_key t = new This_key();
		    t.test();
	}

}
