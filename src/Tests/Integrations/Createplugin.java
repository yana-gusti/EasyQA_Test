package Tests.Integrations;

import Methods.Integrations.*;
import Methods.Profile.LoginPage;
import Tests.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Sasha on 19.02.2017.
 */
public class Createplugin extends BaseTest {

    @Test
    public void creategitlub() throws InterruptedException {
        LoginPage login = new LoginPage();
        login.login(driver, "alex.yevtushenko@thinkmobiles.com", "qwerasd1995");
        Integration addlub = new Integration();
        addlub.addIntegration(driver);
        GitLub gitLub = new GitLub();
        gitLub.addlub(driver);
        driver.findElement(By.className("plans-item-inner-left")).isDisplayed();
    }

    @Test
    public void creategithub() throws InterruptedException {
        LoginPage login = new LoginPage();
        login.login(driver, "alex.yevtushenko@thinkmobiles.com", "qwerasd1995");
        Integration hubplus = new Integration();
        hubplus.addIntegration(driver);
        GitHub gitHub = new GitHub();
        gitHub.addHub(driver);
        driver.findElement(By.className("plans-item-inner-left")).isDisplayed();
    }

    @Test
    public void createpivotal() throws InterruptedException {
        LoginPage login = new LoginPage();
        login.login(driver, "alex.yevtushenko@thinkmobiles.com", "qwerasd1995");
        Integration pivotalplus = new Integration();
        pivotalplus.addIntegration(driver);
        Pivotal pivotal = new Pivotal();
        pivotal.addPivotal(driver);
        driver.findElement(By.className("plans-item-inner-left")).isDisplayed();
    }

    @Test
    public void createjira() throws InterruptedException {
        LoginPage login = new LoginPage();
        login.login(driver, "alex.yevtushenko@thinkmobiles.com", "qwerasd1995");
        Integration jiraplus = new Integration();
        jiraplus.addIntegration(driver);
        Jira jira = new Jira();
        jira.addJira(driver);
        driver.findElement(By.className("plans-item-inner-left")).isDisplayed();
    }

    @Test
    public void createredmine() throws InterruptedException {
        LoginPage login = new LoginPage();
        login.login(driver, "alex.yevtushenko@thinkmobiles.com", "qwerasd1995");
        Integration redmineplus = new Integration();
        redmineplus.addIntegration(driver);
        RedMine redmine = new RedMine();
        redmine.addredmine(driver);
        driver.findElement(By.className("plans-item-inner-left")).isDisplayed();
    }
    @Test
    public void createyoutrack() throws InterruptedException {
        LoginPage login = new LoginPage();
        login.login (driver, "alex.yevtushenko@thinkmobiles.com", "qwerasd1995");
        Integration trackplus = new Integration();
        trackplus.addIntegration(driver);
        YouTrack track = new YouTrack();
        track.addtrack(driver);
        driver.findElement(By.className("plans-item-inner-left")).isDisplayed();
    }

}


