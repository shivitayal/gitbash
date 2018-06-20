package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class b {
	public InternetExplorerDriver driver;
	@Test(priority=3)
	public void login5()
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities = new DesiredCapabilities();
	System.setProperty("webdriver.ie.driver", "C:\\Users\\shitayal\\Downloads\\IEDriverServer_Win32_3.12.0\\IEDriverServer.exe");
	
	capabilities = DesiredCapabilities.internetExplorer();
	capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
	//capabilities.setCapability(CapabilityType.PLATFORM, "Windows 7");
	//capabilities.setCapability("screenResolution", "1280x1024");
	//capabilities.setCapability(CapabilityType.VERSION, "11");
	driver = new InternetExplorerDriver(capabilities); 
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//input[@id = 'lst-ib']")).sendKeys("Shivangibb");
	System.out.println("shivangibb");
	}

}
