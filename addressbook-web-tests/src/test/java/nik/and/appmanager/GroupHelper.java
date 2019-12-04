package nik.and.appmanager;

import nik.and.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper extends HelperBase{

    public GroupHelper(WebDriver driver) {
        super(driver);
    }

    public void returnToGroupPage() {
        click(By.xpath("//i/a"));
    }

    public void submitGroupCreation() {
        click(By.xpath("//input[@name='submit']"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
    }

    public void initGroupCreation() {
        click(By.xpath("//input[@name='new']"));
    }

    public void deleteSelectedGroups() {
        click(By.xpath("//input[@name='delete']"));
    }

    public void selectGroup() {
        click(By.xpath("//input[@name='selected[]']"));
    }

    public void initGroupModification() {
        click(By.xpath("//input[@name='edit']"));

    }

    public void submitGroupModification() {
        click(By.xpath("//input[@name='update']"));
    }

    public boolean isThereAGroup() {

        return isElementPresent(By.xpath("//input[@name='selected[]']"));
    }


    public void createGroup(GroupData group) {
        initGroupCreation();
        fillGroupForm(group);
        submitGroupCreation();
        returnToGroupPage();
    }
}
