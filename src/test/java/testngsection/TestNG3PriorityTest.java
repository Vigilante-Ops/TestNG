package testngsection;

import org.testng.annotations.Test;

public class TestNG3PriorityTest
{
    @Test
    public void a()
    {
        System.out.println("a");
    }
    @Test(priority = -1)
    public void b()
    {
        System.out.println("b");

    }
}
