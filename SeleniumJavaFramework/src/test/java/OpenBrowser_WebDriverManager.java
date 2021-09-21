import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser_WebDriverManager {

	public static void main(String[] args) throws InterruptedException {

		//Open Chrome Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://google.com/");
		Thread.sleep(3000);
		driver.close();

		//Open Firefox Browser
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver1 = new ChromeDriver();

		driver1.get("https://google.com/");
		Thread.sleep(3000);
		driver1.close();

	}

}
