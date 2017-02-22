package Methods.Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AttachFile {

    public void attachFileToLead(WebDriver driver) throws InterruptedException {
        WebElement attach = driver.findElement(By.xpath("//input[@type='file']"));
        Thread.sleep(4000);
        attach.sendKeys("C:\\Users\\Grigorevskiy\\Desktop\\ttttt.png");
        Thread.sleep(4000);
    }
}

