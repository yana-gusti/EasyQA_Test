package Methods.Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AttachFile {

    public void attachFileToLoad(WebDriver driver) throws InterruptedException {
        WebElement attach = driver.findElement(By.xpath("//input[@type='file']"));
        attach.sendKeys("./drivers/test.png");
        Thread.sleep(4000);
    }
}

