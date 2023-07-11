package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class seleniumDemo2 {
	public WebDriver driver;

	@BeforeMethod
	public void beforeDemo() {
		System.setProperty("webdriver.chrome.driver", "D:\\sel\\chromedriver.exe"); 
		driver=new ChromeDriver();
	}
	
	@Test(priority = 1)
	public void a() {
		
		try {
			driver.get("https://demo.guru99.com/test/upload/");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// if it exceeds 10 secs, then it will thorw nosuchElementFouncException
			
			WebElement browsrBtn=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
			
			WebDriverWait wait=new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(browsrBtn));
			
//			Wait<WebDriver> flwait=new FluentWait<WebDriver>(driver).withTimeout(10,TimeUnit.SECONDS).pollingEvery(2,TimeUnit.SECONDS).ignoreAll(NoSuchFieldError.class);
			
			
			
			
			
			
			
			
			Thread.sleep(5000);
			browsrBtn.sendKeys("E:\\Notes\\Manual_Testing\\ScreenShotsTest\\BUG.png");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	@AfterMethod
	public void afterDemo() {
		System.out.println("i am into after method");
	}
	
	
	
	
//	
//	@Test
//	public void e() {
//		System.out.println("I am from method e");
//	}
//	
//	@Test
//	public void k() {
//		System.out.println("I am from method k");
//	}
	
	
}
