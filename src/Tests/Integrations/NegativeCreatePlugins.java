package Tests.Integrations;

import Methods.Integrations.*;
import Methods.Profile.LoginPage;
import Tests.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Sasha on 24.02.2017.
 */
public class NegativeCreatePlugins extends BaseTest {

    @Test
    public void failaddhub() throws InterruptedException {
        LoginPage loginplus = new LoginPage();
        loginplus.login(driver, "alex.yevtushenko@thinkmobiles.com", "qwerasd1995");
        Integration integration = new Integration();
        integration.addIntegration(driver);
        GitHub github = new GitHub();
        github.failHub(driver);
        Thread.sleep(4000);
        driver.findElement(By.className("description")).isDisplayed();

    }

    @Test
    public void failaddlub() throws InterruptedException {
        LoginPage loginplus = new LoginPage();
        loginplus.login(driver, "alex.yevtushenko@thinkmobiles.com", "qwerasd1995");
        Integration integration = new Integration();
        integration.addIntegration(driver);
        GitLub gitlub = new GitLub();
        gitlub.failaddlub(driver);
        driver.findElement(By.className("description")).isDisplayed();
    }

    @Test
    public void failJira() throws InterruptedException {
        LoginPage loginplus = new LoginPage();
        loginplus.login(driver, "alex.yevtushenko@thinkmobiles.com", "qwerasd1995");
        Integration integration = new Integration();
        integration.addIntegration(driver);
        Jira jira = new Jira();
        jira.failJira(driver);
        driver.findElement(By.className("description")).isDisplayed();
    }

    @Test
    public void failPivotal() throws InterruptedException {
        LoginPage loginplus = new LoginPage();
        loginplus.login(driver, "alex.yevtushenko@thinkmobiles.com", "qwerasd1995");
        Integration integration = new Integration();
        integration.addIntegration(driver);
        Pivotal pivotal = new Pivotal();
        pivotal.failPivotal(driver);
        driver.findElement(By.className("description")).isDisplayed();
    }

    @Test
    public void failRedMine() throws InterruptedException {
        LoginPage loginplus = new LoginPage();
        loginplus.login(driver, "alex.yevtushenko@thinkmobiles.com", "qwerasd1995");
        Integration integration = new Integration();
        integration.addIntegration(driver);
        RedMine redMine = new RedMine();
        redMine.failRedMine(driver);
        driver.findElement(By.className("description")).isDisplayed();
    }

    @Test
    public void failYouTrack() throws InterruptedException {
        LoginPage loginplus = new LoginPage();
        loginplus.login(driver, "alex.yevtushenko@thinkmobiles.com", "qwerasd1995");
        Integration integration = new Integration();
        integration.addIntegration(driver);
        YouTrack youtrack = new YouTrack();
        youtrack.failtrack(driver);
        driver.findElement(By.className("description")).isDisplayed();


    }
}

