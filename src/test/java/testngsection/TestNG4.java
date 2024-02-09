package testngsection;

import org.testng.annotations.Test;

public class TestNG4
{
    @Test
    public void T1() throws Exception {
        System.out.println("T1");
        throw new Exception("hi");
    }
    @Test(dependsOnMethods = "T1")
    public void T2()
    {
        System.out.println("T2");
    }
    @Test(dependsOnMethods = "T2")
    public void T3()
    {
        System.out.println("T3");
    }
}
