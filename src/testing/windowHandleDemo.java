package testing;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandleDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub     7B2BB2B3ABC93FB5912D94EAE84812E2
		
		System.setProperty("webdriver.chrome.driver", "D:\\Framework\\chromedriver_win32\\chromedriver.exe");  // set the broswer exe path
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		String currrentPage=driver.getCurrentUrl();
	
		System.out.println(driver.getTitle());
		
//		WebElement imgImnage=driver.findElement(By.xpath("//input[@id='email']"));
////		
////		imgImnage.isDisplayed();   //whether webElement is appearinng on web page
////		imgImnage.isEnabled();    // whether they clickale or not
////		imgImnage.isSelected();   // whether option is selected or not
//		
//		
//		if(currrentPage.contains("home")) {
//			System.out.println("i am naviagte to home page");
//		}
//		
//		
//		
//		
//		driver.switchTo().frame(imgImnage);
//		
//		WebElement imgBanner=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
//		imgBanner.click();
		
		Thread.sleep(5000);
		
	}

}
