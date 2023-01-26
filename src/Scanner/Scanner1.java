package Scanner;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		System.out.println("Enter first value");
		int num = s.nextInt();
		System.out.println("Enter second value");
		int num1 = s.nextInt();
		System.out.println("enter 3rd value"+(num+num1));
	}
}
