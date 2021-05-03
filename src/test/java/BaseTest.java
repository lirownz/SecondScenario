import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTest{

    public WebDriver driver;

    @BeforeClass
    public void setUpTest() {
        //setting Chrome driver from Maven
        WebDriverManager.chromedriver().setup();
        //Create a Chrome driver. All test classes use this.
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterClass
    public void teardown () {
        //setting FF driver to quit after finishing all tests
        driver.quit();
        System.out.println("Test Completed");
    }
}