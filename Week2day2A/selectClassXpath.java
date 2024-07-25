package Week2day2A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectClassXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Mahendran Parasuraman");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select dd1 = new Select(industry);
		dd1.selectByIndex(3);
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select dd2 = new Select(ownership);
		dd2.selectByVisibleText("S-Corporation");
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select dd3 = new Select(source);
		dd3.selectByValue("LEAD_EMPLOYEE");
		driver.findElement(By.className("smallSubmit")).click();
	    driver.close();

	}

}
