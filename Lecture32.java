import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lecture32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(arg0, arg1);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Smita");
		driver.findElement(By.name("pass")).sendKeys("1234");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("12345");
		driver.findElement(By.className("inputtext _9o1w")).sendKeys("123456");
		//driver.findElement(By.id("did_submit")).click();
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("78945");
		driver.findElement(By.id("did_submit")).click();
      
	}

}