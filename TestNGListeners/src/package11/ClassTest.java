package package11;
//These are test cases
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import graphql.Assert;

@Listeners(ClassListener.class)
public class ClassTest {
	@Test
	public  void GmailPage() throws Exception
	{		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.google.com/mail/");
		driver.quit();
	}

@Test
	public void TestFailCheck()
	{
		System.out.println("This is to check Test Case Failure");
		Assert.assertTrue(false);
	}

@Test
public void TestPassCheck()
{
	System.out.println("This is to check Test Case Passing");
	Assert.assertTrue(true);
}

}
