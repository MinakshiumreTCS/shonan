package array;

public class Reverse_order_array {
	public static  void main(String[] args) {
	int a[] = new int[5];
	
    a[0]=100;
	a[1]=200;
	a[2]=300;
	a[3]=400;
	a[4]=500;
	System.out.println("Reverse Order of Array");
	
	for(int i =4; i>=0; i--) {
		System.out.println(a[i]);
		
	}
}
}
