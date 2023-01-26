package exception;

public class Use_throw {
	public static void main(String[] args) throws Throwable { // throws are outside the main()
		System.out.println("exception");
		
		throw new Exception ();// throw is inside the main()
		
		
	}

}
