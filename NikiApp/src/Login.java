
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import io.appium.java_client.android.AndroidDriver;

public class Login {
	
	private static AndroidDriver driver; 
	
	
@Test(priority=1)
public void   title() throws MalformedURLException, InterruptedException  {
	DesiredCapabilities capabilities = new DesiredCapabilities();
	File appDir = new File("C:\\Users\\SAVITHRI\\Desktop\\framework\\NikiApp\\Apk");
    File app = new File(appDir, "app-niki-test.apk");
	 capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
	 capabilities.setCapability(CapabilityType.VERSION, "6.0.1");
	 capabilities.setCapability("deviceName", "Mi Phone");
	    capabilities.setCapability(CapabilityType.PLATFORM, "Android");
	    capabilities.setCapability("app", app.getAbsolutePath());
	    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	    driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	    
	
}
@Test(priority=2)
public void name() {

driver.findElement(By.xpath("android.widget.TextView[@index='1']")).sendKeys("897");
driver.findElement(By.className("android.widget.Button")).click();
	
	
}

}
