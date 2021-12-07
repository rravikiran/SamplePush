package MavenDotsExample.DotsTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumExample {
	@Test
	public void f() throws Exception {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ravikiran Reddy\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/dropdown");

		Thread.sleep(5000);

		Select se = new Select(driver.findElement(By.id("dropdown")));

		// se.selectByValue("2");

		se.selectByVisibleText("Option 1");
	}
}
