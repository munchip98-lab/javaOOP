package Baitap.Common;

public class BaseTest {
    public void createDriver() {
        System.out.println("Browser " + Constants.browser);
        System.out.println("Report " + Constants.report);
        System.out.println("Headless " + Constants.headless);
    }

    public void createDriver(String browser) {
        System.out.println("Browser " + browser);
        System.out.println("Report  " + Constants.report);
        System.out.println("Headles " + Constants.headless);
    }


    public void closedDriver(String browser) {
        System.out.println("Closed browser" + browser);

    }

    public void closedDriver() {
        System.out.println("Closed browser" + Constants.browser);
    }
}
