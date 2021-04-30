package interview;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pageobjects {

	@FindBy(xpath = "//h1[text()='Practice Page']")
	public WebElement header_txt;

	@FindBy(xpath = "//*[text()='Radio Button Example']")
	public WebElement radiobtn_header_txt;

	@FindBy(xpath = "//*[@value='radio1']")
	public WebElement radio_btn1;

	@FindBy(xpath = "//*[@value='radio2']")
	public WebElement radio_btn2;

	@FindBy(xpath = "//*[@value='radio3']")
	public WebElement radio_btn3;

	@FindBy(xpath = "//*[text()='Dropdown Example']")
	public WebElement dropdown_header_txt;

	@FindBy(id = "dropdown-class-example")
	public WebElement dropdown_option;

	@FindBy(xpath = "//*[text()='Checkbox Example']")
	public WebElement checkbox_header_txt;

	@FindBy(id = "checkBoxOption1")
	public WebElement checkBoxOption1;

	@FindBy(id = "checkBoxOption2")
	public WebElement checkBoxOption2;

	@FindBy(id = "checkBoxOption3")
	public WebElement checkBoxOption3;
	
	

	@FindBy(xpath = "//*[text()='Switch Window Example']")
	public WebElement switchWindow_header_txt;

	@FindBy(css = "button[class*='btn-style']")
	public WebElement openWindow_btn;

	@FindBy(xpath = "//*[text()='Switch Tab Example']")
	public WebElement switchTab_header_txt;

	@FindBy(css = "*[id='opentab']")
	public WebElement openTab_btn;

	@FindBy(xpath = "//*[text()='Switch To Alert Example']")
	public WebElement switchAlert_header_txt;

	@FindBy(xpath = "//input[@id='name']")
	public WebElement name_text;

	@FindBy(xpath = "//input[@id='alertbtn']")
	public WebElement alert_button;
	
	@FindBy(xpath = "//input[@id='confirmbtn']")
	public WebElement confirm_button;
	
	
	@FindBy(xpath = "//*[text()='Mouse Hover Example']")
	public WebElement mousehover_header_txt;

	@FindBy(xpath = "//*[@id='mousehover']")
	public WebElement mouseHover_btn;

	@FindBy(xpath = "//*[text()='Top']")
	public WebElement top_button;
	
	@FindBy(xpath = "//*[text()='Reload']")
	public WebElement reload_button;
	
	@FindBy(xpath = "//*[text()='iFrame Example']")
	public WebElement frame_header_txt;
	
	@FindBy(xpath = "//*[@id='courses-iframe']")
	public WebElement frame_element;

	@FindBy(xpath = "//*[text()='Register']")
	public WebElement frame_text;
	
	@FindBy(xpath = "//*[text()='Suggession Class Example']")
	public WebElement suggession_Class_header_txt;
	
	@FindBy(xpath = "//*[@id='autocomplete']")
	public WebElement select_countries;

}
