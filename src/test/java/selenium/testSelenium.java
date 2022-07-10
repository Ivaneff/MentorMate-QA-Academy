package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import javafx.scene.layout.Priority;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class testSelenium {
    WebDriver driver;
    private final String basUri = "http://training.skillo-bg.com:4300/posts/all";

    @BeforeClass
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\Chrome\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(basUri);
    }

    @Test(priority = 2)
    public void logIn() {
        WebElement login = driver.findElement(By.id("nav-link-login"));
        login.click();
        WebElement signIn = driver.findElement(By.cssSelector(".h4.mb-4"));
        Assert.assertTrue(signIn.isDisplayed());
    }

    @Test(priority = 3)
    public void signIn(){
        WebElement user = driver.findElement(By.id("defaultLoginFormUsername"));
        user.click();
        user.sendKeys("Ivo1");
        WebElement password = driver.findElement(By.id("defaultLoginFormPassword"));
        password.click();
        password.sendKeys("ivoivo1");
        WebElement signIn = driver.findElement(By.id("sign-in-button"));
        signIn.click();
        WebElement signOut = driver.findElement(By.cssSelector(".fas.fa-sign-out-alt.fa-lg"));
        Assert.assertTrue(signOut.isDisplayed());
    }

    @Test(priority = 1)
    public void showFirstTreePosts(){
        List<WebElement> posts = driver.findElements(By.className("post-feed-img"));
        Assert.assertEquals(posts.size(), 3);
    }

    @Test(priority = 4)
    public void logOut(){
        WebElement signOut = driver.findElement(By.cssSelector(".fas.fa-sign-out-alt.fa-lg"));
        signOut.click();
        WebElement signIn = driver.findElement(By.id("sign-in-button"));
        Assert.assertTrue(signIn.isDisplayed());
    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }
}
