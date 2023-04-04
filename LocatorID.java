import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorID {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		/*driver.findElement(By.xpath("//a[@href='https://www.etihadguest.com/']")).click();
		//driver.findElement(By.xpath("//nav[@class='header-navbar-main-container']/ul/li[6]/a")).click();
		//driver.findElement(By.xpath("//li[@class=\'book-link         \']/following-sibling::li[2]")).click();
		driver.findElement(By.id("emailOrGuestNumber")).sendKeys("jbkedar44@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Shrig@nesh12");
		driver.findElement(By.partialLinkText(partialLinkText));
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@id='submitLogin']")).click();*/
	/*	driver.findElement(By.xpath("//a[@title='Flights']/span[2]")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//a[@title='Hotels']/span[2]")).click();
		Thread.sleep(2000L);
		//driver.findElement(By.id("Covid19info")).click();
		//Thread.sleep(2000L);
		driver.findElement(By.xpath("//a[@title='Flight Status']/span[2]")).click();
		Thread.sleep(2000L);
		driver.navigate().back();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//span[text()='Check-In']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.id("BookingRetrieveInputSearch1WebCheckinSearchView_ConfirmationNumber")).sendKeys("123456");
		driver.findElement(By.id("BookingRetrieveInputSearch1WebCheckinSearchView_CONTACTEMAIL1")).sendKeys("santosh@santosh.com");
		Thread.sleep(2000L);
		driver.findElement(By.id("BookingRetrieveInputSearch1WebCheckinSearchView_ButtonRetrieve")).click();
		Thread.sleep(2000L);
		System.out.println(driver.findElement(By.xpath("//div[@id='errorSectionContent']/p")).getText());
		Thread.sleep(2000L);
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='Manage My Booking']/span[2]")).click();
		*/
		
		driver.findElement(By.xpath("//li[@class='book_flight']/a/span[2]")).click();
		System.out.println("Test1");
		Thread.sleep(4000L);
		driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();
		System.out.println("Test2");
		Select sAdult=new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']")));
		System.out.println("Test3");
		sAdult.selectByIndex(2);
		Select sChild=new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Child']")));
		//Thread.sleep(4000L);
		sChild.selectByValue("2");
		Select sInfant=new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Infant']")));
		//Thread.sleep(4000L);
		sInfant.selectByVisibleText("3");
	}

}
