package dummy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@id = 'searchDropdownDescription']/..")).click();
		WebElement element = driver.findElement(By.id("searchDropdownBox"));
		Select select = new Select(element);
		select.selectByVisibleText("Arts & Crafts");
		
		Actions action = new Actions(driver);
		action.build().perform();
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(), 'Departments')]/.."))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(), 'Kindle Store')]/.."))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(), 'Kindle Store')]/.."))).click();
		
		
		WebDriverWait w = new WebDriverWait(driver, 30000);
		
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'Kindle Store')]/..")));
		
		
		
		

	}

}
