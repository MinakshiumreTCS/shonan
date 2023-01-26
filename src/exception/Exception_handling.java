package exception;

public class Exception_handling {//arithmetic_exp_handling 
	public static void main(String[] args) {
		int a =1/2;
		int b = 0/1;
		int c = 0;
		try  {// risky code
			 c= a/b; // arithmetic Exception
			 System.out.println(c);
		}
		
		catch (ArithmeticException  monkey ) {
			System.out.println("exception is handled");
		}
		System.out.println("hi");
	
	}

}
