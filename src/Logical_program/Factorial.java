package Logical_program;

public class Factorial {
	public static void main(String[]args) {
		// print factorial from 1! to 5!
		int num = 5;
		int fact =1;
		for(int i = 1; i<=num;i++) {
			fact= fact*i;
			//System.out.println(fact);
		}
	
		/*// print factorial from 5! to 1!
		int num = 1;
		int fact =5;
		for(int i= 5; i>=num;i--) {
			fact= fact*i;
			System.out.println(i);
		}*/
	}

}
