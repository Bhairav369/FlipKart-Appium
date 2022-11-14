package flipkart;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base_Class {

	 
	static AndroidDriver<AndroidElement> driver = null;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
			capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 300);
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
			capabilities.setCapability(MobileCapabilityType.UDID, "09623081222042F8");
//			capabilities.setCapability(MobileCapabilityType.APP, "D:\\App\\app-production-release (130).apk");
			
			
			
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.flipkart.android");
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.flipkart.android.SplashActivity");
			
			
			
			driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), capabilities);

			System.out.println("App Launch");
			
			Thread.sleep(5000);
			
		driver.findElement(By.xpath("(//*[contains(@text, 'English')])[1]")).click();
		System.out.println("Ckick on English ");
		
		driver.findElement(By.xpath("//*[@resource-id='com.flipkart.android:id/select_btn']")).click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		/*driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.google.android.gms:id/cancel']")).click();
		System.out.println("Successfully Clicked on the None Of The Above Option");
		
		
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.flipkart.android:id/phone_input']")).click();
		System.out.println("Successfully Clicked on the Phone Number field");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='phone_input']")).sendKeys("7676312103");
		System.out.println("Successfully Passed the Phone Number ");*/
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='076763 12103']")).click();
		System.out.println("Successfully Clicked on the phone number from the popup");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@resource-id='com.flipkart.android:id/button']")).click();
		System.out.println("Successfully Clicked on the Continue Option");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='phone_input']")).sendKeys("Shree@369");
		System.out.println("Successfully passed the password");
		
		driver.findElement(By.xpath("//*[@id='button']")).click();
		
			
			if(driver.findElements(By.xpath("//*[@class='android.widget.ImageView']")).size()!=0)
			{
				System.out.println("FlipKart menu icon is displayed ");
			}
			
			else {
				System.out.println("Flipkart Menu Icon is Not Displayed");
			}
			
			Thread.sleep(3000);
		/*WebElement el=	driver.findElement(By.xpath("//*[@class='android.widget.TextView'][@text='Search for products']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", el);*/
			
			driver.findElement(By.xpath("//*[@text='Search for products']")).click();
		
			System.out.println("Successfully Clicked on the Search Bar");
			
			driver.findElement(By.xpath("//*[@class='android.widget.EditText'][@text='Search for Products, Brands and More']")).sendKeys("Nautica");
			System.out.println("Successfully passed the products name");
			
		/*WebElement element=	driver.findElement(By.xpath("//*[@id='0_resource_name_obfuscated' and @class='android.widget.ImageView' and ./parent::*"
					+ "[@class='android.widget.FrameLayout' and ./parent::*[@id='key_pos_ime_action']] and "
					+ "(./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.ImageView']]"));
		
	
		
		js.executeScript("arguments[0].click();", element);*/
			
			driver.findElement(By.xpath("//*[@id='0_resource_name_obfuscated' and @class='android.widget.ImageView' and ./parent::*[@class='android.widget.FrameLayout' and ./parent::*[@id='key_pos_ime_action']] and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.ImageView']]")).click();
		
			System.out.println("Successfully Clicked on the Search button in keypad");
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//*[@id='allow_button']")).click();
			
			System.out.println("Successfully Clicked on the Allow Option from the Location Access popup");
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
			
			driver.findElement(By.xpath("//android.widget.Button[@text='WHILE USING THE APP']")).click();
			
			System.out.println("Successfully Clicked on the While Using the App option from the device location popup");
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			if(driver.findElements(By.xpath("//*[@id='search_icon']")).size()!=0)
			{
				System.out.println("Search Icon Is Displayed");
			}
			else {
				System.out.println("Search Icon Is Not Displayed");
			}
			
		boolean voiceIcon=	driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.flipkart.android:id/search_by_voice_icon']")).isDisplayed();
		System.out.println(" If Voice Icon Option Is Available than return as a true else false == " + "" +voiceIcon);
		
		if(driver.findElements(By.xpath("//android.widget.ImageView[@resource-id='com.flipkart.android:id/search_using_image_icon']")).size()!=0)
		{
			System.out.println("Camera Icon Is DIsplayed");
		}
		else {
			System.out.println("Camera Icon IS Not Displayed");
		}
		
		if(driver.findElements(By.xpath("//android.widget.ImageView[@id='cart_bg_icon']")).size()!=0)
		{
			System.out.println("The Cart Icon Is Displayed");
		}
		else {
			System.out.println("The Cart Icon Is Not Displayed");
		}
		
	
		boolean sort=driver.findElement(By.xpath("//android.widget.TextView[@text='Sort']")).isDisplayed();
		System.out.println("If Sort Option Is Available than return as a true else false == "+ " " + sort);
		
		String deleteCmd = "adb shell pm clear com.flipkart.android";      
        Runtime runtime = Runtime.getRuntime();
        runtime.exec(deleteCmd);
        System.out.println("Successfully Cleared the app data");
		
	}

}
