import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsHandleChildWindow {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.className("blinkingText"))).click().build().perform();
		Set<String>windows=driver.getWindowHandles();
		
		Iterator<String> it=windows.iterator();
		String PatrenID=it.next();
		String ChildID=it.next();
		driver.switchTo().window(ChildID);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		
		

	}

}
