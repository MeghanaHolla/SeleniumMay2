package kdf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Methods {
	static WebDriver driver;
	public static void openBrowser() {
		driver = new ChromeDriver();

	}

	public static void maiximizeBrowser() {
		driver.manage().window().maximize();
	}

	public static void implicitlyWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public static void navigateToApplication(String url) {
		driver.get(url);
	}

	public static void enterUserName(String uName, String locValue, String locName) {
		if(locName.equals("id")) {
			driver.findElement(By.id(locValue)).sendKeys(uName);
		}
		else if(locName.equals("name")) {
			driver.findElement(By.name(locValue)).sendKeys(uName);
		}
	}

	public static void enterPassword(String pass, String locValue, String locName) {
		if(locName.equals("id")) {
			driver.findElement(By.id(locValue)).sendKeys(pass);
		}
		else if(locName.equals("name")) {
			driver.findElement(By.name(locValue)).sendKeys(pass);
		}
	}

	public static void clickSignInButton(String locName,String locValue) {
		if(locName.equals("id")) {
			driver.findElement(By.id(locValue)).click();
		}
		else if(locName.equals("name")) {
			driver.findElement(By.name(locValue)).click();
		}
	}

	public static void verifyErrorMessage(String locValue,String expectedResult) {
		String actualMsg = driver.findElement(By.cssSelector(locValue)).getText();
		Assert.assertEquals(actualMsg, expectedResult);
	}

	public static void closeApplication() {
		driver.close();
	}
}
