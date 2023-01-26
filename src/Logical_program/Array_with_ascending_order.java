package Logical_program;

import java.util.Arrays;

public class Array_with_ascending_order {
	public static void main(String[] args) {
		int ar[]= {40,50,20,60,30};
		// we print array ascending order 
		Arrays.sort(ar);
		for(int i = 0;i<=ar.length-1;i++) {
		  System.out.println(ar[i]);
		}
		
		// descending array
		for(int i = ar.length-1;i>=0;i--) {
			System.out.println(ar[i]);
		}
	}

}
