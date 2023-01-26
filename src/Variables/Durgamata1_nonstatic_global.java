package Variables;

public class Durgamata1_nonstatic_global{
	int i =20;//non-static variable(we need to create object)
	
public static void main(String[] args) {
   Durgamata1_nonstatic_global d = new Durgamata1_nonstatic_global ();// object creation
	System.out.println(d.i);
	
}

}
