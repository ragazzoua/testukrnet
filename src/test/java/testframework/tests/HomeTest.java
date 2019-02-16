package testframework.tests;

import org.testng.annotations.Test;

import java.util.Set;

/**
 * created by FAMILY 16.02.2019
 */

public class HomeTest extends BaseTest {

    @Test
    public void invalidLogin() {
        app.home.setLoginField("test");
        app.home.setPasswordField("passtest");
        app.home.clickLoginButton();
    }

}
