package Utilities;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserFactory {

	
	
	public static WebDriver startApp(WebDriver driver,String browserName, String URL){
		
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe"); 
			//WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			
			}
		else if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe"); 
			 driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("We do not support the browser");
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
	}
       public static void quiteBrowser(WebDriver driver){
           driver.quit();
}

}
