package interview;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.apache.logging.log4j.*;
import org.testng.ITestListener;

public class Testthree extends Base{

	public Pageobjects PF;
	public WebDriver driver;
	private static Logger log = LogManager.getLogger(Testthree.class.getName());
	

	@BeforeClass
	public void browseropen() throws IOException {

		driver = browserinit();

		PF = PageFactory.initElements(driver, Pageobjects.class);
	}

	@Test(enabled = false)
	public void mouseHoverTest() throws IOException, InterruptedException {

		System.out.println(PF.header_txt.getText());

		System.out.println(PF.mousehover_header_txt.getText());

		Actions a = new Actions(driver);

		a.moveToElement(PF.mouseHover_btn).click().build().perform();

		Thread.sleep(3000);

		a.moveToElement(PF.top_button).click().build().perform();

		Thread.sleep(3000);

		System.out.println("Test Passed");

		System.out.println("\n -------------------- ********************** ------------------------ \n");

	}

	@Test
	public void autoDropdownTest() throws IOException, InterruptedException {

		System.out.println(PF.header_txt.getText());

		System.out.println(PF.suggession_Class_header_txt.getText());

		PF.select_countries.sendKeys("ind");

		int count = driver.findElements(By.xpath("//ul/li[@class='ui-menu-item']/div")).size();

		int i = 1;
		
		String country = null;
		
		log.debug("Debug Message");

		while (i <= count) {

			PF.select_countries.sendKeys(Keys.ARROW_DOWN);

			country = driver.findElement(By.xpath("//ul/li[@class='ui-menu-item'][" + i + "]/div")).getText();

			if (country.equals("India")) {

				PF.select_countries.sendKeys(Keys.ENTER);
				
				log.error("Error Message");
				break;

			}

			i++;

		}
		
		System.out.println("Country : " + country);

		System.out.println("Test Passed");

		System.out.println("\n -------------------- ********************** ------------------------ \n");

	}

	@Test(enabled = false)
	public void frameTest() throws IOException {

		System.out.println(PF.header_txt.getText());

		System.out.println(PF.frame_header_txt.getText());

		driver.switchTo().frame(PF.frame_element);

		System.out.println(PF.frame_text.getText());

		driver.switchTo().defaultContent();

		System.out.println("Test Passed");

		System.out.println("\n -------------------- ********************** ------------------------ \n");

	}

	@AfterClass
	public void browserClose() {

		driver.quit();
		
		//java -jar jenkins.war --enable-future-java --httpPort=8080
	}

}
