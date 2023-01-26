package array;

public class MultiDiamenssion_array {
	public static void main(String[] args) {
		
		int ar[][] = new int[2][2];
		
		ar[0][0]=34;
		ar[0][1]=31;
		ar[1][0]=44;
		ar[1][1]=54;
		//ar[5][1]=64;
		
		for(int i= 0;i<=1;i++) {//outer for loop
			
			for(int j= 0; j<=1;j++) {
				System.out.print(ar[i][j] +"   ");
			}
			System.out.println();
		}
	}

}
