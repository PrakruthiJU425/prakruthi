package ju;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//pgm to write login page of actitime
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
		
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		
		driver.findElement(By.cssSelector("a[id='loginButton']")).sendKeys(Keys.ENTER);
		
		

}
