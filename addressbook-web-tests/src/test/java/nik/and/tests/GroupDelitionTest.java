package nik.and.tests;

import nik.and.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDelitionTest extends TestBase {


    @Test
    public void testGroupDelition() {
        app.getNavigationHelper().goToGroupPage();
        int before = app.getGroupHelper().getGroupCount();
        if(! app.getGroupHelper().isThereAGroup()){
            app.getGroupHelper().createGroup(new GroupData("1", "2", "3"));
        }
        app.getGroupHelper().selectGroup(before - 1);
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
        int after = app.getGroupHelper().getGroupCount();
        app.logout();

        Assert.assertEquals(after, before-1);
    }

}
