package chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\minak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver m = new ChromeDriver();
		
		m.get("http://www.bamu.ac.in/");//call get method for open the link
		
		Thread.sleep(4000);
		
		m.manage().window().maximize();// it will maximize the url
		
		//Thread.sleep(5000);
		m.close();//it will close the url
		
		
		
		
	}

}
