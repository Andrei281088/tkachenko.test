package nik.and.tests;

import nik.and.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {
    @Test

    public void testContactCreation(){
        app.getNavigationHelper().goToHomePage();
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("Test_name", "Test_username", "1"), true);
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();
    }
}
