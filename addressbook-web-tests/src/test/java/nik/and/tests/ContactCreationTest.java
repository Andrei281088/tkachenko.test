package nik.and.tests;

import nik.and.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {
    @Test

    public void testContactCreation(){
        app.getNavigationHelper().goToHomePage();
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("Test_name", "Test_username", "test"), true);
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();
        int after = app.getContactHelper().getContactCount();

        Assert.assertEquals(after, before + 1);
    }
}
