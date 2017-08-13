import static org.testng.Assert.assertEquals;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;

public class LoginTestNg {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/gmail");
		assertEquals("Gmail", driver.getTitle());
		
		WebElement elementEmail = driver.findElement(By.name("identifier"));
		elementEmail.sendKeys("jsisco1010@gmail.com");
		
		WebElement elementHeading = driver.findElement(By.id("headingText"));
		assertEquals("Sign in", elementHeading.getText());
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
		
		try {
			new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.name("knowledgeLoginLocationInput")));
			
			WebElement elementVerification = driver.findElement(By.name("knowledgeLoginLocationInput"));
			elementVerification.sendKeys("Tracy, CA");
			
			WebElement elementNext2 = driver.findElement(By.id("next"));
			assertEquals("NEXT", elementNext2.getText());
			elementNext2.click();
		} catch(Exception e) {}
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains("Inbox"));
	}
	
	/*@Test(priority=1, description="Testing the forgot email feature, does not work multiple times as there are security features for continous attempts") 
	public void loginForgotEmail() {
		
		WebElement elementForgot = driver.findElement(By.className("uBOgn"));
		elementForgot.click();
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.id("identifier")));
	
		WebElement elementRecover = driver.findElement(By.id("identifier"));
		elementRecover.sendKeys("schahil31@gmail.com");
		
		WebElement elementNext = driver.findElement(By.id("next"));
		elementNext.click();
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.name("GivenName")));
		
		WebElement elementFirstName = driver.findElement(By.name("GivenName"));
		elementFirstName.sendKeys("Jack");
		
		WebElement elementLastName = driver.findElement(By.name("FamilyName"));
		elementLastName.sendKeys("Sisco");
		
		WebElement elementNext1 = driver.findElement(By.id("submit"));
		elementNext1.click();
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.id("submit")));
		
		WebElement elementSend = driver.findElement(By.id("submit"));
		elementSend.click();
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.id("pin")));
		
		WebElement elementPin = driver.findElement(By.id("pin"));
		elementPin.sendKeys("374564");
		
		WebElement elementNext2 = driver.findElement(By.id("submit"));
		elementNext2.click();
		
		new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.id("choose-account-0")));
		
		WebElement elementChoose = driver.findElement(By.id("choose-account-0"));
		elementChoose.click();
	}*/
	
	@Test(priority = 1, description="Testing for Side Bar functionality once logged into email")
	public void sideBarTest() {
		
		WebElement elementStarred = driver.findElement(By.xpath("//a[@title='Starred']"));
		elementStarred.click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains("Starred"));
		
		WebElement elementSent = driver.findElement(By.xpath("//a[@title='Sent Mail']"));
		elementSent.click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains("Sent Mail"));
		
		WebElement elementDrafts = driver.findElement(By.xpath("//a[@title='Drafts']"));
		elementDrafts.click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains("Drafts"));
		
		WebElement elementMoreLabels = driver.findElement(By.xpath("//div[@class='aBA']"));
		elementMoreLabels.click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='aBA aBB']")));
		
		WebElement elementImportant = driver.findElement(By.xpath("//a[@title='Important']"));
		elementImportant.click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains("Important"));
		
		WebElement elementMoreLabels1 = driver.findElement(By.xpath("//div[@class='aBA']"));
		elementMoreLabels1.click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='aBA aBB']")));
		
		WebElement elementChats = driver.findElement(By.xpath(".//a[@title='Chats']"));
		elementChats.click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains("Chats"));
		
		WebElement elementMoreLabels2 = driver.findElement(By.xpath("//div[@class='aBA']"));
		elementMoreLabels2.click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='aBA aBB']")));

		WebElement elementAllMail = driver.findElement(By.xpath(".//a[@title='All Mail']"));
		elementAllMail.click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains("All Mail"));
		
		WebElement elementMoreLabels3 = driver.findElement(By.xpath("//div[@class='aBA']"));
		elementMoreLabels3.click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='aBA aBB']")));

		WebElement elementSpam = driver.findElement(By.xpath(".//a[@title='Spam']"));
		elementSpam.click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains("Spam"));
		
		WebElement elementMoreLabels4 = driver.findElement(By.xpath("//div[@class='aBA']"));
		elementMoreLabels4.click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='aBA aBB']")));
		
		WebElement elementTrash = driver.findElement(By.xpath(".//a[@title='Trash']"));
		elementTrash.click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains("Trash"));
		
		WebElement elementMoreLabels5 = driver.findElement(By.xpath("//div[@class='aBA']"));
		elementMoreLabels5.click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='aBA aBB']")));
		
		
		try {
			WebElement elementCategories = driver.findElement(By.xpath("//div[@title='Expand label: Categories']"));
			elementCategories.click();
			new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//div[@title='Collapse label: Categories']")));
		} catch(Exception e) {}
		
		WebElement elementSocial = driver.findElement(By.xpath("//a[@title='Social']"));
		elementSocial.click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains("Social"));
		
		WebElement elementMoreLabels6 = driver.findElement(By.xpath("//div[@class='aBA']"));
		elementMoreLabels6.click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='aBA aBB']")));

		WebElement elementPromotions = driver.findElement(By.xpath("//a[@title='Promotions']"));
		elementPromotions.click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains("Promotions"));
		
		WebElement elementMoreLabels7 = driver.findElement(By.xpath("//div[@class='aBA']"));
		elementMoreLabels7.click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='aBA aBB']")));
		
		WebElement elementUpdates = driver.findElement(By.xpath("//a[@title='Updates']"));
		elementUpdates.click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains("Updates"));
		
		WebElement elementMoreLabels8 = driver.findElement(By.xpath("//div[@class='aBA']"));
		elementMoreLabels8.click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='aBA aBB']")));
		
		WebElement elementForums = driver.findElement(By.xpath("//a[@title='Forums']"));
		elementForums.click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains("Forums"));
		
		WebElement elementMoreLabels9 = driver.findElement(By.xpath("//div[@class='aBA']"));
		elementMoreLabels9.click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='aBA aBB']")));
		
		WebElement elementManage = driver.findElement(By.xpath("//a[@href='https://mail.google.com/mail/#settings/labels']"));
		elementManage.click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains("Settings"));
		
		WebElement elementMoreLabels10 = driver.findElement(By.xpath("//div[@class='aBA']"));
		elementMoreLabels10.click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='aBA aBB']")));
	}
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}
	
}
