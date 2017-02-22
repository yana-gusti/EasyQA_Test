package Tests.Project;

import Methods.Profile.LoginPage;
import Methods.Project.AttachFile;
import Methods.Project.Project;
import Tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.InterruptedIOException;

import static org.testng.Assert.assertTrue;


public class ProjectTests extends BaseTest {
    @Test
    public void project() throws InterruptedIOException {

        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, "viktor.hryhorevskiy@thinkmobiles.com", "vitya9595");
        Project project = new Project();
        project.project(driver);
    }

    @Test
    public void createwithoutorgan() throws InterruptedIOException {

        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, "viktor.hryhorevskiy@thinkmobiles.com", "vitya9595");
        Project project = new Project();
        project.createwithoutorgan(driver);
        WebElement errorMessage = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div/div[1]/div[1]/div/label"));
        assertTrue(errorMessage.getText().contains("can't be blank"));
    }

    @Test
    public void MaxSymbolsproject() throws InterruptedIOException {

        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, "viktor.hryhorevskiy@thinkmobiles.com", "vitya9595");
        Project project = new Project();
        project.MaxSymbolsproject(driver);
        WebElement errorMessage = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div/div[1]/div[3]/div[2]/label"));
        assertTrue(errorMessage.getText().contains("is too long (maximum is 150 characters)"));
    }

    @Test
    public void Upload() throws InterruptedIOException, InterruptedException {

        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, "viktor.hryhorevskiy@thinkmobiles.com", "vitya9595");
        Project project = new Project();
        project.Upload(driver);
        AttachFile attachFile = new AttachFile();
        attachFile.attachFileToLead(driver);
    }

    @Test
    public void changeDescription() throws InterruptedIOException, InterruptedException {

        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, "viktor.hryhorevskiy@thinkmobiles.com", "vitya9595");
        Project project = new Project();
        project.changeDescription(driver);

    }
}
