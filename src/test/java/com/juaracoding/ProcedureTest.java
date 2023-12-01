package com.juaracoding;

import org.testng.annotations.*;

public class ProcedureTest {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @Test
    public void testTwo() {
        System.out.println("Test two");
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }
}
