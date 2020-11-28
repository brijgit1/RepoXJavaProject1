package com.xorJavaTraining;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test(priority = 3)
    public void test1()
    {
        Assert.assertEquals(true, true);
    }
    
    @Test(priority = 2)
    public void test2()
    {
        Assert.assertEquals(true, true);
    }
    
    @Test(priority = 1)
    public void test3()
    {
        Assert.assertEquals(true, true);
    }
}
