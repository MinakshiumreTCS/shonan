package string_class;

public class String_method {
	public static void main(String[] args) {
		String s1="velocity";
		String s2="VELOCITY";
		String s3="city";
		
		//length()
		System.out.println(s1.length());//8
		//toUppercase()
		System.out.println(s1.toUpperCase());//VELOCITY
		//toLowercase()
		System.out.println(s2.toLowerCase());//velocity
		//equals()
		System.out.println(s1.equals(s3));//false
		//equal ignore case()
		System.out.println(s1.equalsIgnoreCase(s2));
		//contains()
		System.out.println(s1.contains(s3));//true
		System.out.println(s2.contains(s3));//false
		//charAt()
		System.out.println(s1.charAt(7));//y
		//index of()
		System.out.println(s1.indexOf('y'));//7
		//concat()
		System.out.println(s1.concat(s3));//velocity city
		//substring()
		System.out.println(s1.substring(4));//city
		//starts with()
		System.out.println(s1.startsWith("ve"));//true
		//ends with()
		System.out.println(s1.endsWith("ty"));
		
		
	}
		

}
