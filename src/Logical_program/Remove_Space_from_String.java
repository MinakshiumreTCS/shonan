package Logical_program;

public class Remove_Space_from_String {
	public static void main(String[] args) {
		String s = "MI NAKSHI";
	/*String correctName = s.replace(" ","");
	System.out.println(correctName);*/
	
		// using replace method we can add any thing and delete any thing
		
	String correct = s.replace(" ","#");
	System.out.println(correct);
	}

}
