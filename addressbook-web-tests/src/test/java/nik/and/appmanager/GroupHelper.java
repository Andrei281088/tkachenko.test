package nik.and.appmanager;

import nik.and.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper {
    private WebDriver driver;

    public GroupHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void returnToGroupPage() {
        driver.findElement(By.xpath("//i/a")).click();
    }

    public void submitGroupCreation() {
        driver.findElement(By.xpath("//input[@name='submit']")).click();
    }

    public void fillGroupForm(GroupData groupData) {
        driver.findElement(By.name("group_name")).clear();
        driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
        driver.findElement(By.name("group_header")).clear();
        driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
        driver.findElement(By.name("group_footer")).clear();
        driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    public void initGroupCreation() {
        driver.findElement(By.xpath("//input[@name='new']")).click();
    }

    public void deleteSelectedGroups() {
        driver.findElement(By.xpath("//input[@name='delete']")).click();
    }

    public void selectGroup() {
        driver.findElement(By.xpath("//input[@name='selected[]']")).click();
    }
}
