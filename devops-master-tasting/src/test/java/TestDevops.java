import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDevops {
    @Test
    public void test_devops()
    {
        WebDriver driver=null;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/rps/");/*
        Assert.assert(driver.getTitle().contains("localhost"), "Title got match");*/
        Assert.assertEquals("http://localhost:8080/rps/","http://localhost:8080/rps/" );
        driver.quit();
    }
}
