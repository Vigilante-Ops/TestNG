package testngsection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestNG6 {
    private WebDriver webDriver;

    @BeforeTest
    public void init() {
        webDriver = new FirefoxDriver();
        webDriver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
    }

    @Test(testName = "test login feature",dataProvider = "getLoginData")
    public void loginTest(String fname,String password,String demo) throws InterruptedException {
        System.out.println(demo);
        webDriver.findElement(By.cssSelector("input[name='email']")).sendKeys(fname);
        webDriver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
        webDriver.findElement(By.cssSelector("input[type='submit']")).click();
        Thread.sleep(4000);
        webDriver.findElement(By.cssSelector("input[name='email']")).clear();
        webDriver.findElement(By.cssSelector("input[name='password']")).clear();


    }
    @Test(dataProvider = "getRegisterData")
    public void registerTest(String fname,String password) throws InterruptedException {
        System.out.println(fname+" "+password);


    }

    @AfterTest
    public void quit() {
        webDriver.quit();
    }

    @DataProvider
    public Object[][] getLoginData()
    {
        Object[][] data=new Object[][]{
                {"dixitaman8@gmail.com","aman123","dd1"},
                {"adarsh@gmail.com","adadty","dd2"},
                {"","","dd3"}

        };

        return data;

    }
    @DataProvider
    public Object[][] getRegisterData()
    {
        Object[][] data=new Object[][]{
                {"dixitaman8@gmail.com","aman123"},
                {"adarsh@gmail.com","adadty"}

        };

        return data;

    }

}
