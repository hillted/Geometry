package com.hillt;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by thill on 6/1/16.
 */
public class TriangleTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testTriangleMethods() throws Exception {
        System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
        Triangle triangle = new Triangle(2.0,3.0);
        Assert.assertEquals(triangle.getHeight().equals(2.0),true);
        Assert.assertEquals(triangle.getLength()==3.0,true);
        Assert.assertEquals(triangle.getArea()==3.0,true);
        System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @After
    public void tearDown() throws Exception {
    }
}