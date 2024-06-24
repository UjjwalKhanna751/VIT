package com.example.vit;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
    //onCreate
    Calculator calculator; //declare
    @Override
    protected void setUp() throws Exception {
        super.setUp();
       calculator= new Calculator(); //inint
    }
    public void testAdd() {
        int expect=40;  //test fails
        int actual=calculator.add(10,20);
        assertEquals(expect,actual);
    }
    public void testmul(){
        int expect = 200;   //test passes
        int actual= calculator.mul(10,20);
        assertEquals(expect,actual);
    }
    //onDestroy
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}