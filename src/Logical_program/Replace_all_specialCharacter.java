package Logical_program;

public class Replace_all_specialCharacter {
	public static void main(String[] args) {
		
	//it very important
	String s = "M@A$Y%U^R&I";
String correct = s.replaceAll("[^a-zA-Z]","");
	System.out.println(correct);
	
	// if we want to print only special character present on string
String correctName = s.replaceAll("[a-zA-Z]","");
System.out.println(correctName);
	}
}
