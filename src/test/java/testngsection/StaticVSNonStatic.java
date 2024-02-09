package testngsection;

import org.testng.annotations.Test;

public class StaticVSNonStatic
{
    private String name="Aman";
    public static void m3()
    {
        //System.out.println(name);
    }
    public void m1()
    {
        System.out.println("m1");
        System.out.println(this.hashCode());
        m2();
    }
    public void m2()
    {
        System.out.println("m2");
        System.out.println(this.hashCode());
        System.out.println(name);
        m3();


    }
    @Test
    public void Test()
    {
        System.out.println(this.hashCode());

        m1();
    }
}
