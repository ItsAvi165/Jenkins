package basic;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxTest{
	WebDriver driver;
	
	
	
	
	@Test
	public void selectCheckBox()
	{ WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://echoecho.com/htmlforms09.htm");
		 driver.manage().window().maximize();
		 
		List<WebElement> chkboxes = driver.findElements(By.cssSelector("td.table5>input"));
		for (WebElement ch : chkboxes)
		{
			if(ch.getAttribute("value").equalsIgnoreCase("milk"))
			{
				if(!ch.isSelected())
				{
					ch.click();
					break;
				}
			}
		}
	}
}