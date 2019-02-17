package testframework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * created by FAMILY 16.02.2019
 */

public class HomePage extends BasePage {

    @FindBy(xpath = "/html/body/form/div[2]/label")
    private WebElement loginField;

    @FindBy(id = "id-input-password")
    private WebElement passwordField;

    @FindBy(xpath = "/html/body/form/div[6]/button")
    private WebElement loginButton;

    public void setLoginField(String login) {
        loginField.sendKeys(login);
    }

    public void setPasswordField(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
