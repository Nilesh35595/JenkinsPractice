package githubrun.githubrun;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends BaseTestPage {

	
	
	@Test
	public void test1() {		
		WebDriver driver = DriverManager.getDriver();
		driver.get("https:www.google.com/");
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("oogle"));
	}
	
	@Test
	public void test2() {
		WebDriver driver = DriverManager.getDriver();
		driver.get("https:facebook.com/");
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("acebook"));
	}
	
//	@Test
//	public void test3() {
//		WebDriver driver = DriverManager.getDriver();
//		driver.get("https:youtube.com/");
//		String title = driver.getTitle();
//		Assert.assertTrue(title.contains("outube"));
//	}
//	
//	@Test
//	public void test4() {
//		WebDriver driver = DriverManager.getDriver();
//		driver.get("https://www.whatsapp.com/");
//		String title = driver.getTitle();
//		Assert.assertTrue(title.contains("WhatsApp"));
//	}
}
