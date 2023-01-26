package Condition_statement;

public class If_else_ladder {
public static void main(String[] args) {
	
	int marks=100;
	if(marks>=65) {
		System.out.println("Pass with Distriction");
	}
	
	else if (marks>=50) {
		System.out.println("pass with 1st class");
	}
	else if (marks>=40) {
		System.out.println("pass with 2nd class");
	}
	else if (marks>=30) {
		System.out.println("pass");
	}
	else {
		System.out.println("successfully FAIL");
	}
}
}
