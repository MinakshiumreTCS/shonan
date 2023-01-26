package array;

public class Array {//single diamenssional array 
	public static  void main(String[] args) {
		
		String ar[] = new String [4];
		
		ar[0]="dinesh";
		ar[1]="mahesh";
		ar[2]="suresh";
		ar[3]="ramesh";
		//ar[4]="abc";
				
		for(int i = 3;i>=0;i--) {
			
		System.out.println(ar[i]);// here if we print only ref. then o/p will get address of object
		/*System.out.println(ar[0]);
		//System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		System.out.println(ar[4]);*/
		}
	}

}
