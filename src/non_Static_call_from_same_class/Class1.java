package non_Static_call_from_same_class;

public class Class1{//Non_static_method_call_form_different_class
	public static void main(String[] args) {
		// object creation
		Class2 c= new Class2();

		c.m3();
		c.m4();
	}
}


