package sample;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepository.JewelryChain;

public class JewelryChain_TC extends BaseClass{
	
	@Test
	
	public void JewelryChainDescription() {
		
		String ExpectedJewelryClick="Demo Web Shop. Jewelry";
		String ExpectedChainClick="Demo Web Shop. Create Your Own Jewelry";
		
		JewelryChain chain= new JewelryChain(driver);
		
		chain.getJewelryClick().click();
		assertEquals(ExpectedJewelryClick,driver.getTitle(),"Jewelry module click failed");
		Reporter.log("Jewelry module is selected",true);
		
		chain.getChainImageClick().click();
		assertEquals(ExpectedChainClick,driver.getTitle(),"chain image click failed");
		Reporter.log("chain is selected",true);
		
		
		chain.getLengthSendkeys().sendKeys("50");;
		Reporter.log("length of 50 giver",true);
		
		
		chain.getQtySendkeys().sendKeys("2");
		Reporter.log("qty of 2 is given",true);
		
		
		chain.getAddtoWishlistClickButton().click();
		//assertEquals(ExpectedJewelryClick,driver.getTitle(),"Jewelry module click failed");
		Reporter.log("added to wishlist",true);
		
		
		chain.getCheckboxClick().click();
	//	assertEquals(ExpectedJewelryClick,driver.getTitle(),"Jewelry module click failed");
		Reporter.log("added to cart",true);
		
		
		
	}

}
