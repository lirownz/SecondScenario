import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    private HomePage homePage;

    @BeforeClass
    public void setup() {
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void setupMethod() {
        homePage.goToURL();
    }

    @Test(priority = 1)
    public void checkRedirectingURL() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com");
    }

    @Test(priority = 2)
    public void checkingCreateAnAcc() {
        driver.findElement(By.linkText("Create New Account")).isDisplayed();

    }

    @Test(priority = 3)
    public void registertion() {
        //enter registration page
        driver.findElement(By.linkText("Create New Account")).click();
        //fill first name
        driver.findElement(By.name("firstname")).sendKeys("Ewave");
        //fill sure name
        driver.findElement(By.name("lastname")).sendKeys("Ewave");
        //fill email
        driver.findElement(By.name("reg_email__")).sendKeys("0509998888");
        //fill new password
    }

    @Test(priority = 4)
    public void dateOfBirth() {
        driver.findElement(By.id("password_step_input")).sendKeys("Ewave");
        //fill birth month
        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByValue("3");
        //fill birth day
        Select day = new Select(driver.findElement(By.id("day")));
        day.selectByValue("24");
        //fill birth year
        Select year = new Select(driver.findElement(By.id("year")));
        year.selectByValue("1988");
    }

    @Test(priority = 5)
    public void genderPick() {
        //select gender
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[3]/input")).click();
    }

    @Test(priority = 6)
    public void signUp() {
        //clicking signUp button
        driver.findElement(By.name("websubmit")).click();
        }

    @Test(priority = 7)
    public void closeBrowser () {
        teardown();
        }
    }

