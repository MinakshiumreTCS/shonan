package chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\minak\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.google.com/");//it will open the url/++RUN......
		
		   String    title     = d.getTitle();
		   System.out.println(title);//give title of application/url/##RUN.....
		   
		   String ExepT = "Google";
		   
		   String actT = d.getTitle();
		   if (ExepT.equals(actT)) {
			   System.out.println("test case is pass");
		   }
		   else {
			   System.out.println("test case is fail");
		   }
	}

}
