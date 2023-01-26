package Logical_program;

// palindrome means after reversing the string the String value will be same

public class Palindrome {
	public static void main(String[]args) {
		String org = "MINAKSHI";
		String rev = "";
		for (int i= org.length()-1;i>=0;i--) {
			rev=rev+org.charAt(i);
		}
		System.out.println(rev);
		
		if(org.equals(rev)) {
			System.out.println("Given string is palindrome");
			
		}
		else {
			System.out.println("Given string is not palindrome");
		}
	}

}
