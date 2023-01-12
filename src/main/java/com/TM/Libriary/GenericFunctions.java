package com.TM.Libriary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericFunctions {
	public static WebDriver driver;

	public static void launchBrowser(String browserName) {
		switch (browserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			break;
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	public static void launchApp(String url) {
		driver.get(url);

	}

	public static void clickElement(String xpath) {

		driver.findElement(By.xpath(xpath)).click();
		System.out.println("User is able to click the element");

	}

	public static void testSendkeys(String xpath, String data) {
		WebElement ele=driver.findElement(By.xpath(xpath));
		
		ele.click();
		ele.clear();
		ele.sendKeys(data);
		System.out.println("print sendkeys.......");
	}
	
	
	public static void selectByText(String xpath,String text) {
		
		WebElement ele=driver.findElement(By.xpath(xpath));
		Select sc=new Select(ele);
		sc.selectByVisibleText(text);
		System.out.println();
		
		System.out.println("vardhan2 update code");
		
		
		
	}

}
