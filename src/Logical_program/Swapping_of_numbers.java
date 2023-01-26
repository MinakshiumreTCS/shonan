package Logical_program;
// swapping means interchanging or replacement
public class Swapping_of_numbers {
	public static void main(String[] args) {
		
		int a = 10;
		int b= 20;
	
	
	/*	//using 3rd variable
		int c =a;//10
		    a=b;//20
		    b=c;//10
		System.out.println(a);
		System.out.println(b);    */
		
		// without using 3rd variable
		b=b-a;//10
		a=a+b;//20
		System.out.println(a);
		System.out.println(b);
		
	}

}
