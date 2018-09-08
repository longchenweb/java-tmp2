package com.service.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectjava2 {

        Projectjava2Delegate projectjava2Delegate = new Projectjava2Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectjava2Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}