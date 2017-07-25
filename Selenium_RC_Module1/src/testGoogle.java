import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
//import org.openqa.selenium.firefox.*;
//import org.openqa.selenium.ie.*;

public class testGoogle {
	@Test
	public void LaunchChrome_Method1() {
		WebDriver driver = new ChromeDriver();
		driver.get("localhost:8081");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}
}
