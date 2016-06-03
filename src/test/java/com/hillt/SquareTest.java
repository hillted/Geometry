package com.hillt;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by thill on 6/1/16.
 */
public class SquareTest {
    
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testSquareMethods() throws Exception {
        System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
        Square square = new Square(2.0,3.0);
        Assert.assertEquals(square.getHeight().equals(2.0),true);
        Assert.assertEquals(square.getLength()==3.0,true);
        Assert.assertEquals(square.getArea()==6.0,true);
        System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @After
    public void tearDown() throws Exception {
    }
}