package Logical_program;

public class Palindrome2 {
	 public static void main(String []args){

		 String org = "NAYAN";
		 String rev = "";
		  
		 for(int i = org.length()-1;i>=0;i--){

		 rev=rev+org.charAt(i);

		 }
		 System.out.println(rev);
		 if(org.equals(rev)){
		 System.out.println("String is plindrome");
		 }
		 else{
		 System.out.println("String is not plindrome");
		 }
		 }
		 }

