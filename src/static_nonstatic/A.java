package static_nonstatic;

public class A {
	static int a=10;//
	int b=20;
	
public static void main(String[] args) {
	
	
  System.out.println(a);

	//object create
	A ref =new A();
	 System.out.println(ref);//it will print address of object
	 //object 2
	 A ref1 =new A();
	System.out.println(ref1);//IT will print address of object
	
	A ref2 = new A();
	System.out.println(ref2);
	
	
	
}
	
}
