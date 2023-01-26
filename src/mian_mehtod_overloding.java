//can we orverload main() in java
// yes we can overload the main() in java we won't get any compilation error but jvm calls only public static void main (String [] args) method. 
//it won't call any userdefined
public class mian_mehtod_overloding {

	 
	public static void main(String [] args){
		
		//mian_mehtod_overloding m = new mian_mehtod_overloding();
		
		 

	System.out.println("hii");
	}
	public static void main(int [] args){

	System.out.println(10);
	}
	static public void main(char args ){
	 
	System.out.println('a');
	}

	static public void main(short args){

	System.out.println(10);
	}
	public static void main(byte args){

	System.out.println(1);

	}
	
	
	
	
	}

