package Tests.TestPlanTests;

import Methods.Profile.LoginPage;
import Methods.TestPlan.TestPlan;
import Tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by Admin on 14-Feb-17.
 */
public class CreateTestplan extends BaseTest {


    @Test
    public void newTestplan() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, "viktor.hryhorevskiy@thinkmobiles.com", "vitya9595");
    TestPlan testPlan = new TestPlan();
    testPlan.addTestplan(driver, "test");
    }

    @Test
    public void newTestplanEmpty() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, "viktor.hryhorevskiy@thinkmobiles.com", "vitya9595");
        TestPlan testPlan = new TestPlan();
        testPlan.addTestplan(driver, "");
        Thread.sleep(2000);
        WebElement errorMessage = driver.findElement(By.className("message"));
        assertTrue(errorMessage.getText().contains("can't be blank"));
    }
}
