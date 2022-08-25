package TestNGReview;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class assertions {
    // open https://demoqa.com/text-box
    // enter your name
    // get the text with username and make sure  it is full name
    // get the text with email fiedl and make sure it is Email



WebDriver driver;
    @BeforeMethod
    public void openBrowser(){
        // setubg up the webdriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//        getting the particular url
        driver.get("https://demoqa.com/text-box");
 driver.manage().window().maximize();

    }
    @Test
    public void Task1() throws InterruptedException {
//        get the webelement with userName field
        WebElement text_userName = driver.findElement(By.xpath("//label[@id='userName-label']"));
        String actualText = text_userName.getText();
//        print the text on string
        System.out.println(actualText);

    String expectedText = "Full Name";
//        Hard Assertion
        Assert.assertEquals(actualText,expectedText);
//        locating the webElement Email
        WebElement email = driver.findElement(By.xpath("//label[@id='userEmail-label']"));
        String actualEmail=email.getText();

//        expected email
        String expectedEmail="Email";
//        make assertion
        Assert.assertEquals(actualEmail,expectedEmail);
    }
}
