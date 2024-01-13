package basic;

import java.util.List;

//import static org.junit.Assert.assertEquals;

//import static org.testng.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextBoxTesting {

	@Test
	public void BoxTesting()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
//		WebElement txtusername = driver.findElement(By.id("txtCustomerID"));
//		txtusername.sendKeys("testuser");
//		driver.findElement(By.id("txtPassword")).sendKeys("test@113");
//		driver.findElement(By.name("Butsub")).click();
//		
//		WebElement lblError = driver.findElement(By.id("lblMsg"));
//		String actError = lblError.getText();
//		assertEquals(actError, "Invalid Username/Password");
		
		WebElement FirstName = driver.findElement(By.cssSelector("input[ng-model='FirstName']"));
		FirstName.sendKeys("Avishkar");
		System.out.println("test first name");

		WebElement LastName = driver.findElement(By.cssSelector("input[ng-model='LastName']"));
		LastName.sendKeys("Hongekar");
		
		WebElement email =driver.findElement(By.cssSelector("input[ng-model='EmailAdress']"));
		email.sendKeys("avishkar@gmail.com");
//		driver.close();
		
		List<WebElement> chkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
		for (WebElement ch : chkboxes)
		{
			if(ch.getAttribute("value").equalsIgnoreCase("Movies"))
			{
				if(!ch.isSelected())
				{
					ch.click();
					
				}
				break;
			}
		}
		
		
		
		List<WebElement> radio =driver.findElements(By.cssSelector("input[ng-model='radiovalue']"));
		for(WebElement rd : radio) {
			if(rd.getAttribute("value").equalsIgnoreCase("Male")) {
				rd.click();
				break;
			}
		}
		WebElement dropdown = driver.findElement(By.id("Skills"));
		Select db =new Select(dropdown);
		List<WebElement> options = db.getOptions();
		for(WebElement op : options) {
			if(op.getAttribute("Value").equalsIgnoreCase("CSS")) {
				db.selectByValue("CSS");
				break;
			}
		}
		WebElement datedropdown = driver.findElement(By.id("yearbox"));
		Select datedb =new Select(datedropdown);
		List<WebElement> dateoptions = datedb.getOptions();
		for(WebElement op : dateoptions) {
			if(op.getAttribute("Value").equalsIgnoreCase("2001")) {
				datedb.selectByValue("2001");
				break;
			}
		}
		
		 datedropdown = driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(11) > div:nth-child(3) > select"));
		 datedb =new Select(datedropdown);
		dateoptions = datedb.getOptions();
		for(WebElement op : dateoptions) {
			if(op.getAttribute("Value").equalsIgnoreCase("October")) {
				datedb.selectByValue("October");
				break;
			}
		}
		datedropdown = driver.findElement(By.cssSelector("#daybox"));
		datedb =new Select(datedropdown);
		dateoptions = datedb.getOptions();
		for(WebElement op : dateoptions) {
			if(op.getAttribute("Value").equalsIgnoreCase("29")) {
				datedb.selectByValue("19");
				break;
			}
		}
		
	}
}