package tek.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseSetup {
    //Making driver instance static to share with all the objects
    //Using encapsulation we are limiting direct access to the WebDrive
    //Variable so no other can change directly
    public  WebDriver driver;
    public void setupBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://retail.tekschool-students.com/");
    }
    public WebDriver getDriver(){
        return driver;
    }

    public void quiteBrowser(){
        //null check is to avoid Null Pointer Exception
        //if for any reason driver does not instantiate
        if(driver!=null)
            driver.quit();
    }
}
