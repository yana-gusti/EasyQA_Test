package Tests.TestRuns;


import Methods.Profile.LoginPage;
import Methods.TestRuns.CreateTestRun;
import Methods.TestRuns.TestRunChanges;
import Tests.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


/**
 * Created by Rena on 23.02.2017.
 */
public class EditTestRun extends BaseTest {

    String login = "renata.iyber@thinkmobiles.com";
    String pass = "130613renata";

    @Test
    public void EditTestRun() throws InterruptedException {

        LoginPage logInPage = new LoginPage();
        logInPage.login(driver, login, pass);
        Thread.sleep(4000);

        CreateTestRun createTestRun = new CreateTestRun();
        createTestRun.newtestrun(driver);
        Thread.sleep(4000);

        TestRunChanges testRunChanges = new TestRunChanges();
        testRunChanges.changesintestrun(driver);
        Thread.sleep(4000);

        driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.xpath(".//*/div[1]/div[1]/h3")).isDisplayed();
        Thread.sleep(4000);
        driver.findElement(By.id("test_run_title")).click();
        driver.findElement(By.id("test_run_title")).clear();
        driver.findElement(By.id("test_run_title")).sendKeys("Edit test run");
        Thread.sleep(4000);
        driver.findElement(By.id("test_run_title")).submit();
        Thread.sleep(4000);
        assertEquals("Edit test run", driver.findElement(By.linkText("Edit test run")).getText());
    }
}
