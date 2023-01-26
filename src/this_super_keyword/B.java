package this_super_keyword;

public class B extends A {
	
	int b = 60;//global from same class
	
	public void m1() {
		System.out.println(this.b);
		System.out.println(super.a);// global from diff. class
		
	}
	public static void main(String[] args) {
		B b = new B();
		b.m1();
	}

}
