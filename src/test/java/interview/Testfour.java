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

public class Testfour extends Base{

	public Pageobjects PF;
	public WebDriver driver;
	
	

	@BeforeClass
	public void browseropen() throws IOException {

		driver = browserinit();

		PF = PageFactory.initElements(driver, Pageobjects.class);
	}

	@Test
	public void mouseHoverTest() throws IOException, InterruptedException, SQLException {
		
		


		System.out.println(PF.header_txt.getText());

		System.out.println(PF.switchAlert_header_txt.getText());
		
		String host = "localhost";

		String port = "3306";

		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/interview", "root",
				"SIVA@pavana10");

		Statement s = con.createStatement();

		ResultSet rs = s.executeQuery("select * from Firstinterview where Id='2'");

		String name = null;

		String place = null;

		while (rs.next()) {

			name = rs.getString("Name");

			place = rs.getString("Location");

			System.out.println(name);

			System.out.println(place);

		}
		
		
		PF.name_text.sendKeys(name);

		PF.alert_button.click();

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();

		Thread.sleep(3000);

		System.out.println("Test Passed");

		System.out.println("\n -------------------- ********************** ------------------------ \n");
		
		
		System.out.println("Git Passed");
		
		System.out.println("Clone test Passed");
		
		System.out.println("Clone test updated Passed");

	}


	@AfterClass
	public void browserClose() {

		driver.quit();
		
		//java -jar jenkins.war --enable-future-java --httpPort=8080
	}

}
