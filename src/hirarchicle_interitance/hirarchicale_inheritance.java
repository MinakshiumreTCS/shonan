package hirarchicle_interitance;

public class hirarchicale_inheritance {
	public static void main(String[] args) {
		Son1 s1 = new Son1 ();// object1
		s1.car();
		s1.home();
		s1.lappy();
		s1.money();
		System.out.println("properties of Son1");
		System.out.println("s1");
		
		Son2 s2 = new Son2 ();
		s2.car();
		s2.home();
		s2.money();
		s2.Bike();
		System.out.println("I am son2");
		System.out.println("I have second hand bike");
		
		
		Son3 s3 = new Son3 ();
		s3.car();
		s3.home();
		s3.money();
		s3.mobile();		
		
		 
		
	}

}
