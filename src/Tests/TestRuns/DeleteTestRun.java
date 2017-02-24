package Tests.TestRuns;


import Methods.Profile.LoginPage;
import Methods.TestRuns.CreateTestRun;
import Tests.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Rena on 21.02.2017.
 */
public class DeleteTestRun extends BaseTest {
    String login = "renata.iyber@thinkmobiles.com";
    String pass = "130613renata";
    @Test

    public void DeleteTestRun () throws InterruptedException {
        LoginPage logInPage = new LoginPage();
        logInPage.login(driver, login, pass);
        Thread.sleep(4000);

        CreateTestRun createTestRun = new CreateTestRun();
        createTestRun.newtestrun(driver);
        Thread.sleep(4000);

        driver.findElement(By.id("test_run_title")).sendKeys("New Test run for delete test");
        driver.findElement(By.cssSelector("span.dd-pointer.dd-pointer-down")).click();
        driver.findElement(By.xpath("//div[@id='testRunSelect']/ul/li[2]/a/label")).click();
        driver.findElement(By.linkText("choose assigned user")).click();
        driver.findElement(By.xpath("//div[@id='assignedTestRun']/ul/li[2]/a/label")).click();
        driver.findElement(By.xpath("//div[@id='assignedTestRun']/ul/li[2]/a/label")).submit();
        Thread.sleep(6000);
        //driver.findElement(By.xpath("//div[@id='test-run-89']/div[2]/a[3]")).click();
        driver.findElement(By.linkText("Delete")).click();
        driver.switchTo().alert().accept();
        Thread.sleep(4000);
    }


}
