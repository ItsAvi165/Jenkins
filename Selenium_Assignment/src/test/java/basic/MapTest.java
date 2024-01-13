package basic;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MapTest {
	@Test
	public void mapTest()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/maps/dir///@18.5369849,73.806616,15z/data=!4m4!4m3!1m1!4e2!1m0?entry=ttu");
		
		WebElement source = driver.findElement(By.xpath("//*[@id=\"sb_ifc50\"]/input"));
		source.sendKeys("Kolhapur  ");
//		driver.findElement(By.id("txtPassword")).sendKeys("test@113");
//		driver.findElement(By.name("Butsub")).click();
		
		WebElement destination = driver.findElement(By.xpath("//*[@id=\"sb_ifc51\"]/input"));
		destination.sendKeys("Rahuri Ahamadnagar  ");
		driver.findElement(By.xpath("//*[@id=\"directions-searchbox-1\"]/button[1]")).click();
		
//		WebElement lblError = driver.findElement(By.id("lblMsg"));
//		String actError = lblError.getText();
//		assertEquals(actError, "Invalid Username/Password");
	}
}
