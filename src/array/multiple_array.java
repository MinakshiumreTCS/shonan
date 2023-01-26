package array;

public class multiple_array {//multiple diamession array
	public static void main(String[] args) {
		int ar[][]=new int[2][2];
		ar[0][0]=10;//[0][0]mains matrix of 0,0
		ar[0][1]=20;//[0][0]mains matrix of 0,1
		ar[1][0]=30;//[0][0]mains matrix of 1,0
		ar[1][1]=40;//[0][0]mains matrix of 1,1
//		System.out.println(ar[1][1]);//40
//		System.out.println(ar[0][0]);
		//print entire matrix
		for(int i=0;i<=1;i++) {//outer for loop
			for(int j=0;j<=1;j++) {//inner for loop
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
			
		}
	}
		

	

}
