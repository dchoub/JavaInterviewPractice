package dummy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://mail.google.com");
	
	driver.findElement(By.cssSelector("#identifierId")).sendKeys("dhwani.choubisa@gmail.com");
	driver.findElement(By.cssSelector("#identifierNext")).click();
	driver.findElement(By.xpath("//input[@name= 'password']")).sendKeys("Baujia24@");
	driver.findElement(By.cssSelector("#passwordNext")).click();
	

	}

}
