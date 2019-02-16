package testframework.tests;

import org.testng.annotations.Test;

/**
 * created by FAMILY 16.02.2019
 */

public class HomeTest extends BaseTest{

    @Test
    public void invalidLogin(String name, String password){
        app.home.setLoginField(name);
        app.home.setPasswordField(password);
        app.home.clickLoginButton();
    }

}
