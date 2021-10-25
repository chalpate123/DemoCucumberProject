package CommonSteps;
import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.bytebuddy.utility.RandomString;

public class CommonBrowserSteps {

	private WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void teardown() throws InterruptedException, IOException {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String str = RandomString.make(2);
		File dest = new File("C:\\New folder\\NewProject\\screenshot" + str + ".png");
		FileUtils.copyFile(src, dest);

		driver.quit();
		Thread.sleep(2000);

	}



	public WebDriver getdriver() {
		return driver;

	}
	



}