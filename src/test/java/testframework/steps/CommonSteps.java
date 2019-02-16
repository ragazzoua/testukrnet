package testframework.steps;

import testframework.pages.BasePage;

/**
 * created by FAMILY 16.02.2019
 */

public class CommonSteps extends BasePage {

    public void closeApp(){
        driver.quit();
    }
}
