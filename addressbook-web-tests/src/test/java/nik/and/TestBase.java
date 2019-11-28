package nik.and;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class TestBase {
    public WebDriver driver;
    private String baseUrl;
    public boolean acceptNextAlert = true;
    public StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        driver = new FirefoxDriver();
        baseUrl = "https://www.katalon.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        login("admin", "secret");
    }

    private void login(String username, String password) {
        driver.get("http://localhost/addressbook/");
        driver.findElement(By.name("user")).clear();
        driver.findElement(By.name("user")).sendKeys(username);
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.xpath("//input[3]")).click();
    }

    protected void logout() {
        driver.findElement(By.xpath("//a")).click();
    }

    protected void returnToGroupPage() {
        driver.findElement(By.xpath("//i/a")).click();
    }

    protected void submitGroupCreation() {
        driver.findElement(By.xpath("//input[@name='submit']")).click();
    }

    protected void fillGroupForm(GroupData groupData) {
        driver.findElement(By.name("group_name")).clear();
        driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
        driver.findElement(By.name("group_header")).clear();
        driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
        driver.findElement(By.name("group_footer")).clear();
        driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    protected void initGroupCreation() {
        driver.findElement(By.xpath("//input[@name='new']")).click();
    }

    protected void goToGroupPage() {
        driver.findElement(By.xpath("//li[3]/a")).click();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
    
    protected void deleteSelectedGroups() {
        driver.findElement(By.xpath("//input[@name='delete']")).click();
    }

    protected void selectGroup() {
        driver.findElement(By.xpath("//input[@name='selected[]']")).click();
    }
}
