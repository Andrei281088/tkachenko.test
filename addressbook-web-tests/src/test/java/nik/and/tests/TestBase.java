package nik.and.tests;

import nik.and.appmanager.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class TestBase {

    //Choose one of BrowserTypes:
    //BrowserType.CHROME
    //BrowserType.IE
    //BrowserType.OPERA
    //BrowserType.FIREFOX

    final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        app.init();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        app.stop();
    }

}