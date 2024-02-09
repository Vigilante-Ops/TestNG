package testngsection;

import org.testng.annotations.Test;

public class TestInvocationCount
{
    @Test(invocationCount = 1000000000)
    public void create()
    {
        System.out.println("create");
    }
}
