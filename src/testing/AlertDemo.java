package testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Framework\\chromedriver_win32\\chromedriver.exe");  // set the broswer exe path		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/text-box");
		
		WebElement chBox=driver.findElement(By.xpath("//span[text()='Check Box']"));
		chBox.click();
		
		Thread.sleep(3000);
		
		WebElement rdBtn=driver.findElement(By.xpath("//span[text()='Radio Button']"));
		rdBtn.click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		
		

	}

}
