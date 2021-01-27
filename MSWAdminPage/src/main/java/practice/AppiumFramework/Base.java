package practice.AppiumFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public WebDriver driver;


	public WebDriver initialiseDriver() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Ummid\\eclipse-workspace\\MavenJava\\src\\main\\java\\practice\\AppiumFramework\\data.properties");
		
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
//			System.setProperty(prop.getProperty("chromedriver"), prop.getProperty("chromedriverLocation"));
			driver = new ChromeDriver();
			
		}
		else if(browserName.equals("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			// for firefox
			
		}
		else if(browserName.equals("IE")) {
			
			WebDriverManager.iedriver().setup();
			// for Internet Explorer
			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		return driver;
		
//		public static AndroidDriver<AndroidElement> Capabilities(String appName) throws MalformedURLException {
//		// TODO Auto-generated method stub
//		
//		File appDir = new File("src");
//		File app = new File(appDir, appName);
//		 
//		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "FourthEmulator"); 
//		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
//		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
//		cap.setCapability("newCommandTimeout", 0);
//		
//		AndroidDriver<AndroidElement> driver = new AndroidDriver<> (new URL("http://127.0.0.1:4723/wd/hub"), cap);
//		
//		return driver;
//
//	}
		
	}

}