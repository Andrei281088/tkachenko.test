package nik.and.tests;

import nik.and.model.GroupData;
import org.testng.annotations.Test;

public class GroupDelitionTest extends TestBase {


    @Test
    public void testGroupDelition() {
        app.getNavigationHelper().goToGroupPage();
        if(! app.getGroupHelper().isThereAGroup()){
            app.getGroupHelper().createGroup(new GroupData("1", "2", "3"));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
        app.logout();
    }

}
