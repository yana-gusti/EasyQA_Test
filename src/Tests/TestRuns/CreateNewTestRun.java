package Tests.TestRuns;

import Methods.Profile.LoginPage;
import Methods.TestRuns.CreateTestRun;
import Tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Created by Rena on 08.02.2017.
 */
public class CreateNewTestRun extends BaseTest {
    String login = "renata.iyber@thinkmobiles.com";
    String pass = "130613renata";
    @Test
    public void CreateNewTestRun() throws InterruptedException {

        LoginPage logInPage = new LoginPage();
        logInPage.login(driver, login, pass);
        Thread.sleep(4000);

        CreateTestRun createTestRun = new CreateTestRun();
        createTestRun.newtestrun(driver);
        Thread.sleep(4000);

        driver.findElement(By.id("test_run_title")).sendKeys("New Test run");
        driver.findElement(By.cssSelector("span.dd-pointer.dd-pointer-down")).click();
        driver.findElement(By.xpath("//div[@id='testRunSelect']/ul/li[2]/a/label")).click();
        driver.findElement(By.linkText("choose assigned user")).click();
        driver.findElement(By.xpath("//div[@id='assignedTestRun']/ul/li[2]/a/label")).click();
        driver.findElement(By.xpath("//div[@id='assignedTestRun']/ul/li[2]/a/label")).submit();
        Thread.sleep(4000);
        assertEquals("New Test run", driver.findElement(By.linkText("New Test run")).getText());
    }

    @Test
    public void NegativeEmptyCreateNewTestRun() throws InterruptedException {

        LoginPage logInPage = new LoginPage();
        logInPage.login(driver, login, pass);
        Thread.sleep(4000);

        CreateTestRun createTestRun = new CreateTestRun();
        createTestRun.newtestrun(driver);
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("span.dd-pointer.dd-pointer-down")).click();
        driver.findElement(By.xpath("//div[@id='testRunSelect']/ul/li[2]/a/label")).click();
        driver.findElement(By.linkText("choose assigned user")).click();
        driver.findElement(By.xpath("//div[@id='assignedTestRun']/ul/li[2]/a/label")).click();
        driver.findElement(By.xpath("//div[@id='assignedTestRun']/ul/li[2]/a/label")).submit();
        WebElement errorMessage = driver.findElement(By.className("message"));
        assertTrue(errorMessage.getText().contains("can't be blank"));
    }
}
