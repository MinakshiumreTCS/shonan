package constructors;

public class Gun {// it is business logic class because of main method is absent
	
	String gunNAME;
	int noOfbullets;
	
	public void shoot() {//non static 
		
		for (int i=1; i<=noOfbullets;i++) {
			System.out.println("Dishkew");
		}
	}

}
