package mavensel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demoprgm1 {
	WebDriver driver;
	@Test
	public void test()

	{
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
	}
}
