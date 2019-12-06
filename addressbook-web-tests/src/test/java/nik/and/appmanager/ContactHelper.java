package nik.and.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import nik.and.model.ContactData;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ContactHelper extends HelperBase {

    public ContactHelper (WebDriver driver){
        super(driver);
    }

    public void initContactCreation(){
        click(By.xpath("//div[@id='nav']/ul//a[@href='edit.php']"));
    }

    public void fillContactForm (ContactData contactData, boolean creation){
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("lastname"), contactData.getLastname());

        if(creation){
            new Select(driver.findElement(By.name ("new_group"))).selectByVisibleText(contactData.getGroup());
        }else{
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }

    public void submitContactCreation(){
        click(By.name("submit"));
    }

    public void returnToHomePage(){
        click(By.linkText("home page"));
    }

    public void initContactModification(){
        click(By.cssSelector("img[alt='Edit']"));
    }

    public void submitContactModification(){
        click(By.name("update"));
    }

    public int getContactCount(){
        return driver.findElements(By.name("selected[]")).size();
    }

}
