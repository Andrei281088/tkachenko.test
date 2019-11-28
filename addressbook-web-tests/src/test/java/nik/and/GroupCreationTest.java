package nik.and;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

    @Test
    public void testCreationGroup() {

        goToGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("1", "2", "3"));
        submitGroupCreation();
        returnToGroupPage();
        logout();
    }

}
