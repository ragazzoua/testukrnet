package testframework.pages;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static testframework.common.Constants.BASE_URL;


/**
 * created by FAMILY 16.02.2019
 */

public class BasePage {

    protected static WebDriver driver;

    static {
        ChromeDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public BasePage() {
        PageFactory.initElements(driver, this);
    }

}
