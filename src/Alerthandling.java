import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\parde\\Desktop\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//Thread.sleep(2000);

		Alert alrt = driver.switchTo().alert();
		

		System.out.println(alrt.getText());
		alrt.accept();
		Thread.sleep(2000);
		Alert alrt1 = driver.switchTo().alert();
		System.out.println(alrt.getText());
		alrt.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Harpreet");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Alert alrt2 = driver.switchTo().alert();
		System.out.println(alrt.getText());
		alrt.dismiss();
		

	}

}
