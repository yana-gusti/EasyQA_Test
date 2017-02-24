package Tests.Project;
import Methods.Profile.LoginPage;
import Methods.Project.AttachFile;
import Methods.Project.Project;
import Tests.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import java.io.InterruptedIOException;

public class ProjectTests extends BaseTest {
    @Test
    public void project() throws InterruptedIOException {
        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, "viktor.hryhorevskiy@thinkmobiles.com", "vitya9595");
        Project project = new Project();
        project.project(driver);
    }
    @Test
    public void withoutOrgan() throws InterruptedIOException, InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, "viktor.hryhorevskiy@thinkmobiles.com", "vitya9595");
        Project project = new Project();
        project.withoutOrgan(driver);
    }
    @Test
    public void MaxSymbols() throws InterruptedIOException, InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, "viktor.hryhorevskiy@thinkmobiles.com", "vitya9595");
        Project project = new Project();
        project.MaxSymbols(driver);
    }
    @Test
    public void Upload() throws InterruptedIOException, InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, "viktor.hryhorevskiy@thinkmobiles.com", "vitya9595");
        Project project = new Project();
        project.Upload(driver);
        AttachFile attachFile = new AttachFile();
        attachFile.attachFileToLoad(driver);
        Thread.sleep(4000);
        driver.findElement(By.name("commit")).click();
    }
    @Test
    public void UploadAndDelete() throws InterruptedIOException, InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, "viktor.hryhorevskiy@thinkmobiles.com", "vitya9595");
        Project project = new Project();
        project.UploadAndDelete(driver);
        AttachFile attachFile = new AttachFile();
        attachFile.attachFileToLoad(driver);
    }
    @Test
    public void changeDescription() throws InterruptedIOException, InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, "viktor.hryhorevskiy@thinkmobiles.com", "vitya9595");
        Project project = new Project();
        project.changeDescription(driver);
    }
    @Test
    public void AddPlatform() throws InterruptedIOException, InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, "viktor.hryhorevskiy@thinkmobiles.com", "vitya9595");
        Project project = new Project();
        project.AddPlatform(driver);
        driver.findElement(By.name("commit"));
    }
    @Test
    public void addMembers() throws InterruptedIOException, InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, "viktor.hryhorevskiy@thinkmobiles.com", "vitya9595");
        Project project = new Project();
        project.addMembers(driver);
    }
    @Test
    public void changeViewer() throws InterruptedIOException, InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, "viktor.hryhorevskiy@thinkmobiles.com", "vitya9595");
        Project project = new Project();
        project.changeViewer(driver);
    }
    @Test
    public void changeDeveloper() throws InterruptedIOException, InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, "viktor.hryhorevskiy@thinkmobiles.com", "vitya9595");
        Project project = new Project();
        project.changeDeveloper(driver);
    }
    @Test
    public void changeTester() throws InterruptedIOException, InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, "viktor.hryhorevskiy@thinkmobiles.com", "vitya9595");
        Project project = new Project();
        project.changeTester(driver);
    }
    @Test
    public void changeManager() throws InterruptedIOException, InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, "viktor.hryhorevskiy@thinkmobiles.com", "vitya9595");
        Project project = new Project();
        project.changeManager(driver);
    }
    @Test
    public void deleteProject() throws InterruptedIOException, InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, "viktor.hryhorevskiy@thinkmobiles.com", "vitya9595");
        Project project = new Project();
        project.deleteProject(driver);
    }
}