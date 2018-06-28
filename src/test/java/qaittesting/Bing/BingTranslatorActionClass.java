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
		//WebElement selectTag1= driver.findElement(By.cssSelector("#t_sl"));
		//selectTag1.findElement(By.xpath("//*[text()='Auto-Detect']")).click();



		/*	for(int indexForDropDown2=25; indexForDropDown2<=28; indexForDropDown2++ ){
		WebElement selectTag2= driver.findElement(By.cssSelector("#t_tl"));					
		selectTag2.findElement(By.cssSelector("option:nth-of-type("+indexForDropDown2 +")")).click();	
		}
		 */	
		WebElement selectTag2= driver.findElement(By.id("t_tl"));
		WebElement link = selectTag2.findElement(By.xpath("option[text()= '"+lang+"']"));
		link.click();
		String linkName = link.toString(); 


		return linkName;
	}

	public String enterText(){
		String text="I love India i."; 
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
	/*public void xyz(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		String str = driver.findElement(By.xpath("//div[@id='t_dummydiv']")).getAttribute("innerText");
		System.out.println("@@@"+str);

	}*/
}
