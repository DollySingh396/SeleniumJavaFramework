import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElements {


	public static void main(String[] args) throws InterruptedException {


		//Opening Chrome Browser

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com/");

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("RavindraBabuRavula");

		Thread.sleep(3000);

		driver.close();
		driver.quit();

	}
}