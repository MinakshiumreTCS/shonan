package Logical_program;

public class Palindrome1 {
	public static void main(String[]args) {
		String org = "NITIN";
		String rev = "";
		
		for(int i = org.length()-1; i>=0;i--) {
			rev= rev+org.charAt(i);
		}
		System.out.println(rev);
		if(org.equals(rev)) {
			System.out.println("Given String is palindrome");
			
		}
		else {
			System.out.println("Given String is not palindrome");
		}
	}

}
