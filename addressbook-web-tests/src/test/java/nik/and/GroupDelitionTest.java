package nik.and;

import org.testng.annotations.Test;

public class GroupDelitionTest extends TestBase {


    @Test
    public void testGroupDelition() {
        goToGroupPage();
        selectGroup();
        deleteSelectedGroups();
        returnToGroupPage();
        logout();
    }

}
