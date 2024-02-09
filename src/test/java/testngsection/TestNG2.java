package testngsection;

import org.openqa.selenium.ElementClickInterceptedException;
import org.testng.annotations.Test;

public class TestNG2
{

    @Test(expectedExceptions = ElementClickInterceptedException.class)
    public void T1()
    {
        System.out.println("t1 called");
        throw new ElementClickInterceptedException("T1 is not clickable");
    }
}
