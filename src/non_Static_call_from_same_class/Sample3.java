package non_Static_call_from_same_class;

public class Sample3 {
	public static void main(String[] args) {
		System.out.println("main method started");
		Sample3 s=new Sample3();
		s.m1();
		s.m2();
		
		System.out.println("main method ends");
	}
	public void m1() {//method declaration
		System.out.println("I am from m1 nonstatic method");//method implementation
	}
	public void m2() {//method declaration
		System.out.println("I am from m2 non-static method");//method implementation
	}

}
