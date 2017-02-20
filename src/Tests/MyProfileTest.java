package Tests;

import Methods.LoginPage;
import Methods.MyProfile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by asus on 09.02.17.
 */
public class MyProfileTest extends BaseTest {

    @Test
    public void openPersonalInfo() {
        LoginPage loginPage=new LoginPage();
        loginPage.login(driver,"focus5080+44@gmail.com", "focus5080");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        MyProfile myProfile = new MyProfile();
        myProfile.openPersonalInfo(driver);

    }

    @Test
    public void changePersonalInfo() {
        LoginPage loginPage=new LoginPage();
        loginPage.login(driver,"focus5080+44@gmail.com", "focus5080");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        MyProfile myProfile = new MyProfile();
        myProfile.changePersonalInfo(driver);
    }

    @Test
    public void emptyPersonalInfo() {
        LoginPage loginPage=new LoginPage();
        loginPage.login(driver,"focus5080+44@gmail.com", "focus5080");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        MyProfile myProfile = new MyProfile();
        myProfile.emptyPersonalInfo(driver);
    }
}
