package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {

    public Base()
    {
        System.out.println("Base-CONSTRUCTOR "+this.hashCode());
    }
    public WebDriver webDriver;
    private static Properties prop = new Properties();

    @BeforeTest
    @Parameters({"browser"})
    public void init(String browser) throws IOException {
        System.out.println("BeforeTest");

        prop.load(new FileInputStream("Env/config.properties"));

        if (browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\amanv\\Downloads\\MockAPI\\TestNG\\chrome-win64\\chromedriver.exe");
            webDriver=new ChromeDriver();
        }
        else {
            webDriver = new FirefoxDriver();

        }
    }

    @AfterTest
    public void destroy() {
        System.out.println("destroy");

        webDriver.quit();
    }

}
