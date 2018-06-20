package testNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNgC 
{
	public InternetExplorerDriver driver;
	SoftAssert sa = new SoftAssert();
	
	@BeforeTest
	public void startup() throws InterruptedException
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
	String s = "fgd";
	if (s.equals("fgd"))
	{
	sa.assertTrue(true, "passssss");
	System.out.println("shivangipass");
	
	
	}
	else
		{sa.assertFalse(true, "faillll");
	System.out.println("shivangifailll");}
	}
	@Test
	public void login()
	{
		
	
	driver.findElement(By.xpath("//input[@id = 'lst-ib']")).sendKeys("Shivangi");
	System.out.println("shivangi");
	//b B = new b();
	//B.login(driver);
	}
	
	@Test(priority=1)
	public void login1()
	{
		
	
	driver.findElement(By.xpath("//input[@id = 'lst-ib']")).sendKeys("Shivangi");
	System.out.println("shivangi1");
	}
	@Test(priority=2)
	public void login2()
	{
		
	
	driver.findElement(By.xpath("//input[@id = 'lst-ib']")).sendKeys("Shivangi");
	System.out.println("shivangi2");
	driver.close();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}

