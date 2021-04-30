package interview;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

	public WebDriver driver;

	public WebDriver browserinit() throws IOException {

		

		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\global.properties");

		prop.load(fis);
		
		
		String browserName = prop.getProperty("browser");
		
		String projectPath = System.getProperty("user.dir");
		
		if(browserName.equals("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", projectPath + "\\browsers\\chromedriver.exe");

		driver = new ChromeDriver();
		}
		
		
		
		else if (browserName.equals("firefox"))

		{

			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\browsers\\geckodriver.exe");

			driver = new FirefoxDriver();
		}

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));

		// PF = PageFactory.initElements(driver, Pageobject.class);

		return driver;

	}
	
	
	public String getScreenShot(String testName, WebDriver driver) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		String destinationFilPath = System.getProperty("user.dir") + "\\reports\\"+testName+".png";
		
		FileUtils.copyFile(source, new File(destinationFilPath));
		
		return destinationFilPath;
		
		
	}

}
