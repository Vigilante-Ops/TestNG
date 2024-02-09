package NaveenAutomationLab;

import Utils.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AccessNAL extends Base
{
    public AccessNAL()
    {
        System.out.println("AccessNAL-CONSTRUCTOR");
    }
    @Test(priority = 1)
    public void openNVN()
    {
        System.out.println("openNVN");

        webDriver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
    }
    @Test(priority = 2)
    public void NVNSearchType()
    {
        System.out.println("NVNSearchType");

        webDriver.findElement(By.xpath("//input[@name='email']")).sendKeys("hello");
    }
}
