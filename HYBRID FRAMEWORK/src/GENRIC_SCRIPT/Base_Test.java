package GENRIC_SCRIPT;

import java.lang.reflect.GenericArrayType;
import java.util.concurrent.TimeUnit;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Frameworks_constant
{
	public WebDriver driver;
	@BeforeMethod
	public void openApp()
	{
		System.setProperty(chrome_key,chrome_value);
		new ChromeDriver
		driver.manage().window().maximize();
		driver.get("base_url");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeApp(ITestResult res)
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			Take_sreenshot.getphoto(driver);
		}
		driver.close();
	}

}
