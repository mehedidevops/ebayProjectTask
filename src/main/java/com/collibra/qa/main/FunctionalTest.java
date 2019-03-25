package com.collibra.qa.main;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class FunctionalTest {

	protected static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\MyDevNewEclipse\\ebayProject\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	

	@AfterClass
	public static void tearDown() {
		driver.close();
	}
}
