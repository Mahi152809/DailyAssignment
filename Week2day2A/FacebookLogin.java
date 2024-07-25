package Week2day2A;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Mahi");
		driver.findElement(By.name("lastname")).sendKeys("P");
		driver.findElement(By.name("reg_email__")).sendKeys("+916374946913");
		driver.findElement(By.id("password_step_input")).sendKeys("Test@12345");
		WebElement day = driver.findElement(By.id("day"));
		Select date = new Select(day);
		date.selectByIndex(16);
		WebElement month = driver.findElement(By.id("month"));
		Select mon = new Select(month);
		mon.selectByIndex(8);
		WebElement year = driver.findElement(By.id("year"));
		Select yea = new Select(year);
		yea.selectByVisibleText("1991");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.name("websubmit")).click();
		
		
	}
		
		
		}


