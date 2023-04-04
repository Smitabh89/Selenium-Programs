import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicdropNew {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
	//	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTNR")).click();
		//driver.findElement(By.xpath("//option[(@value='BLR']")).click();
	
		//driver.findElement(By.xpath("//a[value='BLR']")).click();
		driver.findElement(By.className(".ui-state-default ui-state-highlight")).click();
	
	}

}
