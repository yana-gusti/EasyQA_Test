package Tests;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by asus on 09.02.17.
 */
public class BaseTest {

    public WebDriver driver;
    public String baseUrl = "http://qa_dashboard.test.thinkmobiles.com:8085";
    public String email = "renata.iyber@thinkmobiles.com";
    public String password = "130613renata";
//    public String email = "vasiliy.fedortsi@thinkmobiles.com";
//    public String password = "111111";

    @BeforeMethod
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver", "./drivers/for mac/chromedriver");
        driver = new ChromeDriver();
        driver.get(baseUrl + "/users/sign_in");
        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(1280, 768));
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.close();
    }

}
