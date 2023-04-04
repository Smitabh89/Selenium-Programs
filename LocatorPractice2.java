import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(arg0, arg1)
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("password")).sendKeys("learning");
		//CSS selector with Regular Expression
		//driver.findElement(By.cssSelector("input[type=*'pass']")).sendKeys("learning");
		 driver.findElement(By.className("checkmark")).click();
	    driver.findElement(By.className("radiotextsty")).click();
	       driver.findElement(By.xpath("//option[@value='stud']")).click();
	      //  driver.findElement(By.xpath("//option[@value='teach']")).click();
	        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	       // driver.findElement(By.linkText("terms and conditions")).click();
	        //driver.findElement(By.id("signInBtn")).click();
	        driver.findElement(By.name("signin")).click();

	}

}


