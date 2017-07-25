import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class ExpressNodeTest1 {

	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		
		driver.get("localhost:6069");
		System.out.println(driver.getTitle());
	}

}
