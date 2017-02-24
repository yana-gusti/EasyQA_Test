package Tests.Profile;

import Methods.Profile.LoginPage;
import Methods.Profile.MyProfile;
import Tests.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.InterruptedIOException;

/**
 * Created by asus on 09.02.17.
 */
public class MyProfileTest extends BaseTest {

    @Test
    public void openPersonalInfo() throws InterruptedIOException, InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, email, password);
        MyProfile myProfilePage = new MyProfile();
        myProfilePage.showProfile(driver);
        loginPage.logout(driver);
    }

    @Test
    public void changePersonalInfo() throws InterruptedIOException, InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, email, password);
        MyProfile myProfilePage = new MyProfile();
        myProfilePage.changeProfile(driver);
        loginPage.logout(driver);
    }

    @Test
    public void emptyPersonalInfo() throws InterruptedIOException, InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, email, password);
        MyProfile myProfilePage = new MyProfile();
        myProfilePage.errorProfile(driver);
        loginPage.logout(driver);
    }

    @Test
    public void uploadPhotoPersonalInfo() throws InterruptedIOException, InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, email, password);
        MyProfile myProfilePage = new MyProfile();
        myProfilePage.showProfile(driver);
        myProfilePage.uploadFile(driver);
        loginPage.logout(driver);
    }

    @Test
    public void deletePhotoPersonalInfo() throws InterruptedIOException, InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, email, password);
        MyProfile myProfilePage = new MyProfile();
        myProfilePage.showProfile(driver);
        driver.findElement(By.id("destroy_avatar")).click();
        driver.switchTo().alert().accept();
        // the rest of the scripts can be added here
        Thread.sleep(2000);
        loginPage.logout(driver);
    }

    @Test
    public void changePassword() throws InterruptedIOException, InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, email, password);
        MyProfile myProfilePage = new MyProfile();
        myProfilePage.showProfile(driver);
        myProfilePage.changePassword(driver);
        Thread.sleep(5000);
        loginPage.logout(driver);
    }

    @Test
    public void emptyPasswordField() throws InterruptedIOException, InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, email, password);
        MyProfile myProfilePage = new MyProfile();
        myProfilePage.showProfile(driver);
        myProfilePage.errorMessage(driver);
        loginPage.logout(driver);
    }

    @Test
    public void incorrectCurrentPass() throws InterruptedIOException, InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, email, password);
        MyProfile myProfilePage = new MyProfile();
        myProfilePage.showProfile(driver);
        myProfilePage.incorrectCurrent(driver);
        loginPage.logout(driver);
    }

    @Test
    public void myOrganization() throws InterruptedIOException, InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, email, password);
        MyProfile myProfilePage = new MyProfile();
        myProfilePage.showProfile(driver);
        driver.findElement(By.xpath(".//*/div/ul/li[3]/a")).click();
        driver.findElement(By.id("my_organization")).isDisplayed();
        loginPage.logout(driver);
    }

    @Test
    public void notificationShows() throws InterruptedIOException, InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, email, password);
        MyProfile myProfilePage = new MyProfile();
        myProfilePage.showProfile(driver);
        driver.findElement(By.xpath(".//*/div/ul/li[4]/a")).click();
        driver.findElement(By.xpath("//div[@class='tab']")).isDisplayed();
        loginPage.logout(driver);
    }

    @Test
    public void notificationsAllOff() throws InterruptedIOException, InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, email, password);
        MyProfile myProfilePage = new MyProfile();
        myProfilePage.showProfile(driver);
        myProfilePage.notificationOff(driver);
        loginPage.logout(driver);
    }

    @Test
    public void notificationsAllOn() throws InterruptedIOException, InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, email, password);
        MyProfile myProfilePage = new MyProfile();
        myProfilePage.showProfile(driver);
        myProfilePage.notificationOn(driver);
        loginPage.logout(driver);
    }
}
