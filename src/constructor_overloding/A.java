package constructor_overloding;

public class A {
	
	    A(int a,int b) {
		System.out.println(a+b);
	    }
		
	    A (int a, int b, int c) {
		System.out.println(a+b+c);
	    }
			
		A (int a , int b, int c, int d){
			System.out.println(a+b+c+d);
		}
		public static void main(String[] args) {
			A a = new A(20, 30);
			A b = new A(20,30,40);
			A c = new A(20,30,40,50);
			
		}

	}


