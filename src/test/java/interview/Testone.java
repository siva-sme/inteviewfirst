package interview;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testone extends Base {

	public Pageobjects PF;
	public WebDriver driver;
	
	
	@BeforeClass
	public void browseropen() throws IOException {
		
		driver = browserinit();

		PF = PageFactory.initElements(driver, Pageobjects.class);
	}
	

	@Test
	public void firstTest() throws IOException {

		

		System.out.println(PF.header_txt.getText());

		System.out.println(PF.radiobtn_header_txt.getText());

		PF.radio_btn1.click();

		Assert.assertTrue(PF.radio_btn1.isSelected());

		PF.radio_btn2.click();

		Assert.assertFalse(PF.radio_btn1.isSelected());

		System.out.println("Test Passed");

	}

	@Test
	public void dropDownTest() throws IOException {


		System.out.println(PF.header_txt.getText());

		System.out.println(PF.dropdown_header_txt.getText());

		Select s = new Select(PF.dropdown_option);

		s.selectByIndex(1);

		s.selectByValue("option2");

		s.selectByVisibleText("Option3");

		System.out.println("Test Passed");

	}

	@Test
	public void checkboxTest() throws IOException {

		System.out.println(PF.header_txt.getText());

		System.out.println(PF.checkbox_header_txt.getText());

		PF.checkBoxOption1.click();

		Assert.assertTrue(PF.checkBoxOption1.isSelected());

		PF.checkBoxOption2.click();

		Assert.assertTrue(PF.checkBoxOption1.isSelected());
		
		Assert.assertFalse(PF.checkBoxOption2.isSelected());

		System.out.println("Test Passed");

	}
	
	
	@AfterClass
	public void browserClose() {
		
		driver.quit();
	}

}
