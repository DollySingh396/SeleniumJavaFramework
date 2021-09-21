import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowser {

	public static void main(String[] args) {

		//Opening Firefox Browser
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectPath+"/src/test/resources/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com/");
		driver.close();
		driver.quit();

		//Opening Chrome Browser
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://google.com/");
		driver1.close();
		driver1.quit();
		
		//Opening IE Browser
		System.setProperty("webdriver.ie.driver", projectPath+"/src/test/resources/Drivers/IEDriverServer.exe");
		WebDriver driver2 = new InternetExplorerDriver();
		driver2.get("https://google.com/");
		driver2.close();
		driver2.quit();
			
		
	}
}
