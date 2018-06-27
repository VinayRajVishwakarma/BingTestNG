package qaittesting.Bing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BingTranslatorTestClass {
	
	WebDriver driver;
	BingTranslatorActionClass action;
	@BeforeClass
	public void test00(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinayvishwakarma\\Downloads\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.bing.com/translator");
		driver.manage().window().maximize();
		
		action = new BingTranslatorActionClass(driver);
	}
	
	@Test
	public void test01_GivenLanguageIsSelectedInDropDown(){
		Assert.assertTrue(action.selectLanguage("English").contains("English"),"you failed horribly");
	}
	@Test
	public void test02_InputAreaHasTextInIt(){
		Assert.assertFalse(action.enterText().equals(""));
	}
}
