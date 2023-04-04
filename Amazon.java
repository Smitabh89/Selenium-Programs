import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//driver.findElement(By.xpath("//a[@href='/deals?ref_=nav_cs_gb']")).click();
		driver.findElement(By.xpath(//a[contains(text()='Todays Deals'])).click();

	}

}
