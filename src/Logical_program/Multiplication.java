package Logical_program;

public class Multiplication {
	public static void main(String[] args) {
		int num = 10;
		int product =1;
		for(int i = 1; i<=num; i++) {
			product = product*i;
			//System.out.println(product);// if we print inside of for loop then only we get factorial result
		}
		System.out.println(product);// if we print outside of for loop then only get product result
	}

}
