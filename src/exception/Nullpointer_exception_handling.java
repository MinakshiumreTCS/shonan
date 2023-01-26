package exception;

public class Nullpointer_exception_handling {

	int i = 10;
	 
	public static void main(String[] args) {
		
		Nullpointer_exception ref = null;
		System.out.println(ref.i);
		
		try {
			int c = ref.i;//Nullpointer_exception
			System.out.println("RESOLVED NullPointerException");
			
		}
		
		catch (NullPointerException DEMO) {
			System.out.println("RESOLVED NullPointerException");
			
		}
		
	}

}
