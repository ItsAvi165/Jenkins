package test;

import static test.Utils.input;
import static test.Utils.launchBrowser;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class YelpTest {

	WebDriver driver = launchBrowser("https://www.yelp.com/");

	@Test
	public void testInputSearch() {
		By by = By.xpath("//input[@id='search_description']");
		input(driver, by, "restaurant");
		Assert.assertEquals(driver.getTitle(),"TOP 10 BEST Restaurant in San Francisco, CA - January 2024 - Yelp");
	}

}
