package GoogleTests;

import Utils.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AccessGoogle extends Base
{
    public AccessGoogle()
    {
        System.out.println("AccessGoogle-CONSTRUCTOR");
    }
    @Test(priority = 1)
    @Parameters({"url"})
    public void openGoogle(String url)
    {
        System.out.println(url);
        System.out.println("openGoogle");

        webDriver.get(url);
    }
    @Test(priority = 2)
    public void searchType()
    {
        System.out.println("openGoogle-search");

        webDriver.findElement(By.xpath("//input[@placeholder='Search the web']")).sendKeys("hello");
    }

}
