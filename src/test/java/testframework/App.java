package testframework;

import testframework.steps.CommonSteps;
import testframework.steps.HomeSteps;

/**
 * created by FAMILY 16.02.2019
 */

public class App {

    public CommonSteps common;
    public HomeSteps home;

    public App() {
        common = new CommonSteps();
        home = new HomeSteps();
    }
}
