package testngsection;

import org.testng.annotations.Test;

public class TestNG5CRUD
{
    public void create()
    {
        System.out.println("create");
    }
    public void read()
    {
        System.out.println("read");

    }
    public void update()
    {
        System.out.println("update");

    }
    public void delete()
    {
        System.out.println("delete");

    }


    @Test
    public void Testcreate()
    {
        create();
    }
    @Test
    public void Testread()
    {
      create();
      read();
    }
    @Test
    public void Testupdate()
    {
        create();
        read();
        update();

    }
    @Test
    public void Testdelete()
    {
        create();
        read();
        update();
        delete();

    }
}
