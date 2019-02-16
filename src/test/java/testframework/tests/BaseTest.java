package testframework.tests;

import org.testng.annotations.AfterSuite;
import testframework.App;

/**
 * created by FAMILY 16.02.2019
 */

public class BaseTest {
    public static App app = new App();

    @AfterSuite
    public void tearDown() {
        app.common.closeApp();
    }
}