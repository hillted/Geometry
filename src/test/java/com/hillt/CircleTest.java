package com.hillt;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by thill on 6/1/16.
 */
public class CircleTest {
    
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testCircleMethods() throws Exception {
        System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
        Circle circle = new Circle(2.0);
        Assert.assertEquals(circle.getRadius().equals(2.0),true);
        //Double area =  circle.getArea();
        Assert.assertEquals(circle.getArea().equals(12.566370614359172),true);
        System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @After
    public void tearDown() throws Exception {
    }
}