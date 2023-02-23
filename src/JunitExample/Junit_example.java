package JunitExample;


import org.junit.Before;
import org.junit.Test;

public class Junit_example {
    @Test
    public void testjunit()
    {
        System.out.println("Test Junit");


    }
    @Before
    public void m1()
    {
        System.out.println("In M1 method");
    }

    @After
    public void m2()
    {
        System.out.println("In M2 method");
    }
}

