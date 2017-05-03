package com.example.spring.testjunit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

@RunWith(RobolectricTestRunner.class)
public class ComplexCalculationTest {
    ComplexCalculation cc = new ComplexCalculation();

    @Test
    public void DivisionTest() {
        int c = cc.Division(100, 5);
        assertEquals(20, c);
    }

    @Test
    public void MultiplyTest() {
        int c = cc.Multiply(100, 5);
        assertEquals(500, c);
    }
}

//    public class SimpleCalculationTest {
//        SimpleCalculation sc = new SimpleCalculation();
//        @Test
//        public void AddTest() {
//            int c = sc.Add(3, 5);
//            assertEquals(8, c);
//        }
//        @Test
//        public void SubtrationTest() {
//            int c = sc.Subtration(20, 5);
//            assertEquals(15, c);
//        }
//}