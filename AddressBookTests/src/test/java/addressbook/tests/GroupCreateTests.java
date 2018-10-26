package addressbook.tests;

import addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreateTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.goToGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("Test1", "Test2", "Test3"));
        app.submitGroupCreation();
        app.returnToGroupPage();
    }

}
