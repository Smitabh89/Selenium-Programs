import java.awt.Dimension;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.airvistara.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("domain-done")).click();
		Thread.sleep(3000);
		WebElement source= driver.findElement(By.xpath("//input[@name='flightSearchFrom']"));
		source.sendKeys("Mu");
		int i=0;

		while(i<3)
		{

		Thread.sleep(3000);

		source.sendKeys(Keys.DOWN);

		i++;

		}
		source.sendKeys(Keys.ENTER);
		
	/*	Thread.sleep(3000);
		List<WebElement> options =driver.findElements(By.xpath("//div[@id='departsfrom-div']//div[@class='scombobox-list']"));

		for(WebElement option :options)
		{	
			//equalsIgnoreCase("Chandigarh (IXC)")
			
			if(option.getText().equalsIgnoreCase("Mumbai (BOM)"))
			{
					option.click();
					break;
			}
			else
			{
				System.out.println(option.getText());
			}
		}*/
		//driver.findElement(By.xpath("//*[@name='or-src']/following-sibling::div/div/div[4]")).click();
		//driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[3]/div[1]/div[1]/div/div/div/div/div[4]")).click();
		/*WebElement element= driver.findElement(By.xpath("//*[@name='or-src']/following-sibling::div/div/div[4]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("div[2].click()",element);*/
		//System.out.println("Test");
		//Thread.sleep(2000L);
	//	driver.findElement(By.xpath("//*[@name='or-dest']/following-sibling::div/div/div[8]")).click();

	}

}
