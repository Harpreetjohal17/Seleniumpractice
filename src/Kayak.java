import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Kayak {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\parde\\Desktop\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kayak.co.in/");
		
		Thread.sleep(3000);
		//WebdriverWait wt = new WebDriverwait(driver,20);
		driver.manage().window().maximize();
		
		//Source Selection
		driver.findElement(By.xpath("(//div[@aria-label='Remove'])[1]")).click();
		driver.findElement(By.xpath("//input[@placeholder='From?']")).sendKeys("San Fran");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From?']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@placeholder='From?']")).sendKeys(Keys.ENTER);
		
		//Destination Selection
		driver.findElement(By.xpath("//input[@placeholder='To?']")).sendKeys("Del");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='To?']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@placeholder='To?']")).sendKeys(Keys.ENTER);
		
		//Source Date
		driver.findElement(By.xpath("//span[@aria-label='Start date calendar input']")).click();
		while(true)
		{
			String Text = driver.findElement(By.cssSelector("//div[contains(text(),'October 2022')]")).getText();
			if(Text.contains("November"))
				 {
				break;
				 }
				else {
					driver.findElement(By.xpath(" //body/div[12]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/button[1]/div[1]/div[1]/span[1]/*[1]")).click();
				}
		}
	}
}
