package array;

public class Array1 {
public static void main(String[] args) {
	
	String ar[] = new String [5];
	
	ar[0]="mini";
	ar[1]="max";
	ar[2]="fast";
	ar[3]="low";
	ar[4]="dc";
	ar[5]="decrease";//there is no data if we try to print it then we ends up with
	//array index out of bound exception 
	
	System.out.println(ar[0]);
	System.out.println(ar[1]);
	System.out.println(ar[2]);
	System.out.println(ar[3]);
	System.out.println(ar[4]);
	System.out.println(ar[5]);
	
	
}
}
