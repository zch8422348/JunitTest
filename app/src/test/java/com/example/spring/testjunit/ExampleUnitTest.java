package com.example.spring.testjunit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        System.out.print("11111111");
        assertEquals(4, 2 + 2);
    }

    @Test
    public  void name() throws  Exception{
        HelloWold helloWold=new HelloWold();
        assertEquals("haha", helloWold.printtest("haha"));
    }
}