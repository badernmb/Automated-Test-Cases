package test3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ripon on 11/19/2015.
 */
public class test4 {
	private WebDriver driver;
	public Google googlePage;
	public GoogleSearchPage searchPage;

	@Before
	public void setUp() throws Exception {
		String filepath = "C:/Users/dell/Desktop/selenium/chromedriver.exe";
		File file = new File(filepath);
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void testGoogleSearch2() {
		googlePage = new Google(driver);
		searchPage = googlePage.goToSearchPage2();
		searchPage.getNumberOfResults2();
	}
}