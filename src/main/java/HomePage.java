import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    //Constructor
    public HomePage (WebDriver driver) {
        super(driver);
    }

    //Page Variables
    String baseURL = "http://www.fb.com";

    //Page Methods
    //Go to Homepage
    public HomePage goToURL(){
        driver.get(baseURL);
        return this;
    }
}