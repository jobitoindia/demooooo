package testing;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowDemo {
	
	int mobileNumber=10;
	String name="lahu";
	
	public static void main(String[] args) throws InterruptedException {
	
		RegistrationPage rp=new RegistrationPage();
		rp.number1=10;
		
		
		
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Framework\\chromedriver_win32\\chromedriver.exe");  // set the broswer exe path
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement clickhere=driver.findElement(By.linkText("Click Here"));
		clickhere.click();
		String parentWindow=driver.getWindowHandle();  // ID of single window
		System.out.println(parentWindow);
		Set<String> allWindows=driver.getWindowHandles();  // list of ID's all window
		System.out.println(allWindows);
		Iterator<String> itr=allWindows.iterator();
		while(itr.hasNext()) {
			String childWindow=itr.next();
			if(!parentWindow.equalsIgnoreCase(childWindow)) {
					driver.switchTo().window(childWindow);
					Thread.sleep(3000);
					WebElement emailField=driver.findElement(By.xpath("//input[@name='emailid']"));
					emailField.sendKeys("hiii");
					WebElement login=driver.findElement(By.xpath("//input[@name='btnLogin']"));
					login.sendKeys("hiii");
					Thread.sleep(3000);
			}
		}
		
//		driver.close();   closes current window	
		driver.quit();     // it closes all the windows opened by the selenium		
	}
}
