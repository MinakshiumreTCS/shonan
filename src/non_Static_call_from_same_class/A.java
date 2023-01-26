package non_Static_call_from_same_class;

public class A {
	public static void main(String[] args) {
		A a = new A();
		a.m7();
		a.m8();
		a.m9();
	}
	public  void m7() {
		System.out.println("I am from m7");
		
		
	}
	public void m8() {
		System.out.println("I am from m8");
	}
public void m9() {
	System.out.println("I am from m9");
}
}
