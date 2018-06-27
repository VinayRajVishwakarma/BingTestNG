package qaittesting.Bing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BingTranslatorActionClass {

	WebDriver driver;
	public BingTranslatorActionClass(WebDriver driver){
		this.driver=driver;
	}
	
	public String selectLanguage(String lang){
		WebElement selectTag1= driver.findElement(By.cssSelector("#t_sl"));
		WebElement link = selectTag1.findElement(By.xpath("//*[text()= '"+lang+"' ]"));
		link.click();
		String linkName = link.toString(); 
		
		for(int indexForDropDown1=25; indexForDropDown1<=28; indexForDropDown1++ ){
		WebElement selectTag2= driver.findElement(By.cssSelector("#t_tl"));					
		selectTag2.findElement(By.cssSelector("option:nth-of-type("+indexForDropDown1 +")")).click();	
		}
		return linkName;
		}
	
	public String enterText(){
		String text="I love India."; 
		driver.findElement(By.cssSelector("textarea#t_sv")).sendKeys(text);	
		 
		 return text;
	}
	
	public void swapButton(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("a#t_revIcon.ttop_switch")).click(); 
	}
}
