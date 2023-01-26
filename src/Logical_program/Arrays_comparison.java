package Logical_program;

import java.util.Arrays;

public class Arrays_comparison {
	public static void main(String[]args) {
		int art1[] = {10,20,30,40};
	    int art2[] = {20,30,40,50}; 
		int art3[] ={10,20,30,40};
		
		// Arrays.equals()is use to compare 2 arrays
	    System.out.println(Arrays.equals(art1, art2));
	    System.out.println(Arrays.equals(art2, art3));
	    System.out.println(Arrays.equals(art1, art3));
	   
	}

}
