package Tests.TestPlanTests;


import Methods.Profile.LoginPage;
import Methods.TestPlan.TestCase;
import Tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by Admin on 17-Feb-17.
 */
public class CreateTestcase extends BaseTest {

    @Test
    public void newTestcase() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, "viktor.hryhorevskiy@thinkmobiles.com", "vitya9595");
        TestCase testCase = new TestCase();
        testCase.addTestCase(driver,"Plan", "Module","Case");
    }

    @Test
    public void newTestcaseEmpty() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, "viktor.hryhorevskiy@thinkmobiles.com", "vitya9595");
        TestCase testCase = new TestCase();
        testCase.addTestCaseEmpty(driver, "Plan", "Module","");
        Thread.sleep(2000);
        WebElement errorMessage = driver.findElement(By.className("message"));
        assertTrue(errorMessage.getText().contains("can't be blank"));
    }
}
