package tests;

import appmanager.ApplicationManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HbTests {

    public ApplicationManager app = new ApplicationManager();


    @Test
    public void connectionTest() throws InterruptedException {
        System.out.println(app.db().getAccountById(1).getAccountIdValue());
    }
}
