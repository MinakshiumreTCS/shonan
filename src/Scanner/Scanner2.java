package Scanner;

import java.util.Scanner;

public class Scanner2 {
	public static void main(String[] args) {
		
	
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter any num value");
	
	   int num = s.nextInt();
   if (num%2==0) {
	   System.out.println("Given num is even ");
   }
   else {
	   System.out.println("Given num is odd");
   }
}
}
