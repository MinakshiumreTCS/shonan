package constructors;

public class Gun1 {
	String gunNAME;
	int noOfbullets;
	//constructor
	public Gun1 (String gunNAME,int noOfbullets) {
	
		this.gunNAME=gunNAME;
		this.noOfbullets=noOfbullets;
		
	}//non static method
	public void shoot() {//non static 
		
		for (int i=1; i<=noOfbullets;i++) {
			System.out.println("Dishumm");
		}
	}


}
