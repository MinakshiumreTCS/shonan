package checked_exeption;

public class SIB {
	public static void main(String[] args) throws Throwable {
		
		System.out.println("hii");
		
		Thread.sleep (3000);// checked exception handle by compiler(compiler known exception)
		
		System.out.println("hlo");
		System.out.println("u need more study");
		
		Thread.sleep(3000);
		System.out.println("byee");// throws are declare multiple time in same class
	}



	}

