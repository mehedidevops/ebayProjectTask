package com.collibra.qa.tests;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.collibra.qa.main.FunctionalTest;
import com.collibra.qa.main.ProductPage;

public class ProductSearchTest extends FunctionalTest {
	
	ProductPage productpage;
	
	@Test
	public void searchTest() {
		driver.get("http://www.ebay.com");
		productpage = new ProductPage(driver);
		
		assertTrue(productpage.isInitialized());
		
		productpage.productSearch();
		productpage.validSearchPage();
	}
}
