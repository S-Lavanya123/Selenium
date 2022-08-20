package sample;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepository.Camera;

public class Camera_TC extends BaseClass{
	 @Test
	 public void cameraDescription() {
		 
		 String Product="Demo Web Shop. Electronics";
		 String ProdCamera="Demo Web Shop. Camera, photo";
		 String Cart="Demo Web Shop. Digital SLR Camera 12.2 Mpixel";
		 String MailAFriend="Demo Web Shop. Email A Friend. Digital SLR Camera 12.2 Mpixel";
		// String ToMail="";
		// String Sendmail="";
		 
		 Camera cam = new Camera(driver);
		 cam.getCameraproductselect().click();
		 assertEquals(Product, driver.getTitle(),"Product module select failed");
		 Reporter.log("module is selected",true);
		 
		 cam.getCameraproduct().click();
		 assertEquals(ProdCamera,driver.getTitle(),"Camera select failed");
		 Reporter.log("Camera is selected",true);
		 
		 cam.getCamerashoppingcart().click();
		 assertEquals(Cart,driver.getTitle(),"Camera added to cart  failed");
		 Reporter.log("Camera is added to cart ",true);
		 
		 cam.getMailafrd().click();
		 assertEquals(MailAFriend,driver.getTitle(),"Mail a friend is failed");
		 Reporter.log("mail a friend is selected",true);
		 
		 cam.getTofrdmail().sendKeys("pallavi@gmail.com");
	//	 assertEquals(ToMail,driver.getTitle(),"Camera select failde");
		 Reporter.log("to mail address is entered",true);
		 
		 cam.getSendmail().click();
	//	 assertEquals(ProdCamera,driver.getTitle(),"Camera select failde");
		 Reporter.log("mail is sent",true);
		 
		 
	 }

}
