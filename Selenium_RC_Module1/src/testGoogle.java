import static org.junit.Assert.*;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.*;

public class testGoogle {
	@Test
	public void LaunchChrome_Method1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/gmail");
		assertEquals("Gmail", driver.getTitle());
		
		WebElement elementEmail = driver.findElement(By.name("identifier"));
		elementEmail.sendKeys("jsisco1010@gmail.com");
		
		WebElement elementHeading = driver.findElement(By.id("headingText"));
		assertEquals("Sign in", elementHeading.getText());
		
		WebElement elementOptions = driver.findElement(By.className("IMH1vc"));
		assertEquals("More options", elementOptions.getText());
		elementOptions.click();
		
		WebElement elementCreateAcc = driver.findElement(By.id("SIGNUP"));
		assertEquals("Create account", elementCreateAcc.getText());
		elementCreateAcc.click();
		
		WebElement elementNot = driver.findElement(By.id("PRIVATE_BROWSING"));
		assertEquals("Not your device?", elementNot.getText());
		elementNot.click();
		
		elementHeading.click();
		
		WebElement elementNext = driver.findElement(By.id("identifierNext"));
		assertEquals("NEXT", elementNext.getText());
		elementNext.click();
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		
		WebElement elementPswd = driver.findElement(By.name("password"));
		elementPswd.sendKeys("1234password");
		
		WebElement elementNext1 = driver.findElement(By.id("passwordNext"));
		assertEquals("NEXT", elementNext1.getText());
		elementNext1.click();
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains("Inbox"));
		driver.quit();
		
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.google.com/gmail");
		
		WebElement elementForgot = driver1.findElement(By.className("uBOgn"));
		assertEquals("Forgot email?", elementForgot.getText());
		elementForgot.click();
		
		new WebDriverWait(driver1, 10).until(ExpectedConditions.titleIs("Google Accounts"));
		driver1.quit();
	}
}
