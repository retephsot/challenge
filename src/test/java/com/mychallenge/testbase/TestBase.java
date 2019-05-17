package com.mychallenge.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.text.ParseException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


import com.mychallenge.pages.LandingPage;
import com.mychallenge.util.JsonReader;
import com.mychallenge.util.WebDriverSetUp;

public class TestBase {
	
	protected WebDriver driver;
	protected LandingPage landingpage;
	protected static Properties testConfig;
	protected static Logger LOGGER = null;
	public String baseUrl;
	
	@BeforeSuite()
	public void beforSuite() throws FileNotFoundException, IOException {
		testConfig = new Properties();
		testConfig.load(new FileInputStream("UITestConfig.properties"));
		System.setProperty("log4j.configurationFile","log4j2Config.xml");
        LOGGER = LogManager.getLogger();
	}

	@BeforeMethod	
	@Parameters({"browserRemote"})
	
	  public void beforeMethod(@Optional String browserRemote) throws MalformedURLException, InstantiationException, IllegalAccessException
	  {
		
		driver = WebDriverSetUp.createDriver(testConfig.getProperty("browser"), testConfig.getProperty("runFromSuite"), browserRemote);	
		baseUrl = testConfig.getProperty("baseUrl");	
		driver.get(baseUrl);
		landingpage = new LandingPage(driver);

	}

	@DataProvider(name = "dataProvider")
	 public Object[][] passData(Method method) throws IOException, ParseException
		{
		 	testConfig = new Properties();
			testConfig.load(new FileInputStream("UITestConfig.properties"));
			
			return JsonReader.getdata(testConfig.getProperty("jsonDataLocation")+"TestDataSet.json", method.getName());
		}

	@AfterMethod
	public void afterMethod(ITestResult result) throws Exception
	  {
		
			 if(ITestResult.FAILURE==result.getStatus()) {				 
					try{
						TakesScreenshot screenshot = (TakesScreenshot)driver;
						File srs = screenshot.getScreenshotAs(OutputType.FILE);
						
						String osName = System.getProperty("os.name");
						System.out.println(System.getProperty("os.name"));				
						if(osName.contains("Windows")) {
							FileUtils.copyFile(srs, new File(".\\printscreen\\failureprintscreen"+result.getName()+".png"));								
						}
						else {
							FileUtils.copyFile(srs, new File("printscreen/failureprintscreen"+result.getName()+".png"));
						}
						System.out.println("Successfully captured a screenshot");
					}catch (Exception e){
						System.out.println("Exception while taking screenshot "+e.getMessage());
					}					
			 }
			 
			 WebDriverSetUp.quitDriver(driver);
		 }
		 	 
		
}
