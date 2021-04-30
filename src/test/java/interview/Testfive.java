package interview;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testfive extends Base {

	public Pageobjects PF;
	public WebDriver driver;

	@BeforeClass
	public void browseropen() throws IOException {

		driver = browserinit();

		PF = PageFactory.initElements(driver, Pageobjects.class);
	}

	@Test
	public void gitTest() throws IOException, InterruptedException, SQLException {

		System.out.println("Git Passed");

		System.out.println("Clone test Passed");

		System.out.println("Clone test updated Passed");

		System.out.println("\n -------------------- ********************** ------------------------ \n");

	}

	@AfterClass
	public void browserClose() {

		driver.quit();

		// java -jar jenkins.war --enable-future-java --httpPort=8080
	}

}
