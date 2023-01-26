package sib;

public class SIB {//Static initializer block
	public static void main(String[] args) throws Throwable {
		System.out.println("hii i am executing  after static block");
		System.out.println("hlo");
		Thread.sleep(3000);
	}
static {
	System.out.println("althrough i am after main(-) still executing before main  method");
}
}
