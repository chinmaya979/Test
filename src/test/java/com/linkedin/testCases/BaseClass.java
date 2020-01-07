package com.linkedin.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public String baseURL = "https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin";
	public String username = "sahoochinmaya979@gmail.com";
	public String password = "Chinmaya*1979";
	public static WebDriver driver;

	public static Logger logger;
	@BeforeClass
	public void setup() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		
		 logger=Logger.getLogger("Test");
		PropertyConfigurator.configure("Log4j.prperties");

	}

	@AfterClass
	public void tearDown() {

		driver.quit();
	}
}
