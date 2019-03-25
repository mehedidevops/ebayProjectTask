package com.collibra.qa.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProductPage extends PageObject {

	@FindBy(id = "gh-shop-ei")
	WebElement shopCategory;

	@FindBy(linkText = "Computers & tablets")
	WebElement electronics;

	@FindBy(xpath = "//*[@id=\"w1-w0-w3-toggle-button\"]/span")
	WebElement computerDriveStorage;

	@FindBy(linkText = "Hard Drives (HDD, SSD & NAS)")
	WebElement hardDrives;

	@FindBy(linkText = "External Hard Disk Drives")
	WebElement externalDrives;

	@FindBy(linkText = "1TB")
	WebElement storageCapacity;

	@FindBy(linkText = "USB 3.0")
	WebElement driveInterface;

	@FindBy(linkText = "Under $75.00")
	WebElement price;

	@FindBy(xpath = "/html/body/div[3]/div[2]/h1/span")
	WebElement validPage;
	
	public ProductPage(WebDriver driver) {
        super(driver);
    }
	
	public boolean isInitialized() {
		String title = driver.getTitle();
		System.out.println("PAGE TITLE=="  + title);
		return true;
	}
	
	public void productSearch() {
		shopCategory.click();
		electronics.click();
		computerDriveStorage.click();
		hardDrives.click();
		externalDrives.click();
		storageCapacity.click();
		driveInterface.click();
		price.click();
	}
	

	public void validSearchPage() {
		String pageAssert = validPage.getText();
		System.out.println("VALID SEARCH PAGE=="  + pageAssert);
	}

}
