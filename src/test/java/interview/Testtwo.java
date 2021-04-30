package interview;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testtwo extends Base {

	public Pageobjects PF;
	public WebDriver driver;

	@BeforeClass
	public void browseropen() throws IOException {

		driver = browserinit();

		PF = PageFactory.initElements(driver, Pageobjects.class);
	}

	@Test
	public void windowSwitchTest() throws IOException {

		System.out.println(PF.header_txt.getText());

		System.out.println(PF.switchWindow_header_txt.getText());

		PF.openWindow_btn.click();

		Set<String> ids = driver.getWindowHandles();

		Iterator<String> it = ids.iterator();

		String parentWindow = it.next();

		String childWindow = it.next();

		driver.switchTo().window(childWindow);

		System.out.println("Child URL:" + driver.getCurrentUrl());

		System.out.println("Child Window Title:" + driver.getTitle());
		
		driver.close();

		driver.switchTo().window(parentWindow);
		
		System.out.println("Parent URL:" + driver.getCurrentUrl());

		System.out.println("Parent Window Title :" + driver.getTitle());

		System.out.println("Test Passed");
		
		System.out.println("\n -------------------- ********************** ------------------------ \n");

	}

	@Test
	public void windowTabTest() throws IOException, InterruptedException {

		System.out.println(PF.header_txt.getText());

		System.out.println(PF.openTab_btn.getText());

		PF.openTab_btn.click();
		
		PF.openTab_btn.click();
		
		PF.openTab_btn.click();

		Set<String> ids = driver.getWindowHandles();

		Iterator<String> it = ids.iterator();

		String parentWindow = it.next();
		
		int i = 1;

		while (it.hasNext()) {
			
			String childWindow = it.next();

			driver.switchTo().window(childWindow);

			Thread.sleep(3000);

			System.out.println("Child URL:" + driver.getCurrentUrl());

			System.out.println("Child Window Title -" + i + " :" + driver.getTitle());

			i++;

		}

		driver.switchTo().window(parentWindow);
		
		System.out.println("Parent URL:" + driver.getCurrentUrl());

		System.out.println("Parent Window Title :" + driver.getTitle());

		System.out.println("Test Passed");
		
		System.out.println("\n -------------------- ********************** ------------------------ \n");

	}

	@Test
	public void alertTest() throws IOException {

		System.out.println(PF.header_txt.getText());

		System.out.println(PF.switchAlert_header_txt.getText());

		PF.name_text.sendKeys("Siva");

		PF.alert_button.click();

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();

		PF.name_text.sendKeys("Siva");

		PF.confirm_button.click();

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();

		PF.name_text.sendKeys("Siva");

		PF.confirm_button.click();

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().dismiss();

		System.out.println("Test Passed");
		
		System.out.println("\n -------------------- ********************** ------------------------ \n");

	}

	@AfterClass
	public void browserClose() {

		driver.quit();
	}

}
