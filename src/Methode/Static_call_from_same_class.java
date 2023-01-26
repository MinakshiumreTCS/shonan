package Methode;

public class Static_call_from_same_class {
	public static void main(String[] args) {
		
		
		f1();
		f2();
		f3();
		
	}
public static void f1() {
	System.out.println("I am from f1");
}
  public static void f2() {
	System.out.println("I am from f2");
}

public static void f3() {
	System.out.println("Iam from f3");
}

}
