package sample;

import static org.testng.Assert.assertEquals;

//import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepository.Apperal;

public class Apperal_TC extends BaseClass {
	@Test

	public void ApperalDescription() {
		Apperal apperal = new Apperal(driver);

		String ExpectedApparelModule = "Demo Web Shop. Apparel & Shoes";
		String ExpectedBag = "Demo Web Shop. Genuine Leather Handbag with Cell Phone Holder & Many Pockets";
		String ExpectedCart = "Demo Web Shop. Genuine Leather Handbag with Cell Phone Holder & Many Pockets";
		String ExpectedShopCart = "Demo Web Shop. Shopping Cart";
		String ExpectedContinueShopping = "Demo Web Shop. Apparel & Shoes";

		apperal.getApparel().click();
		assertEquals(ExpectedApparelModule, driver.getTitle(), "Apperal module click failed");
		Reporter.log("Apperal module is selected", true);

		apperal.getBag().click();
		assertEquals(ExpectedBag, driver.getTitle(), "Bag select is  failed");
		Reporter.log("Bag is selected", true);

		apperal.getCart().click();
		assertEquals(ExpectedCart, driver.getTitle(), "Bag to cart failed");
		Reporter.log("Bag is added to cart", true);

		apperal.getShoppingcart().click();
		assertEquals(ExpectedShopCart, driver.getTitle(), "Shopping cart click failed");
		Reporter.log("Shoping cart is clicked", true);

		apperal.getContinueShopping().click();
		assertEquals(ExpectedContinueShopping, driver.getTitle(), "Continue shoping click is failed");
		Reporter.log("Continue shoping button is clicked", true);

	}

}
