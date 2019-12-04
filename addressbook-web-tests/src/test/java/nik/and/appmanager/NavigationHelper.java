package nik.and.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void goToGroupPage() {
        click(By.xpath("//li[3]/a"));
    }

    public void goToHomePage(){
        click(By.xpath("//li/a"));
    }
}
