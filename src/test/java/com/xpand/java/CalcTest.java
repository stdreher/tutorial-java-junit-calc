package com.xpand.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

// import org.hamcrest.Matcher;

public class CalcTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

	@Test
    public void CanAddNumbers()
    {
        assertThat(Calculator.Add(1, 1), is(2));
        assertThat(Calculator.Add(-1, 1), is(0));
        assertThat(Calculator.Add(0.5, -0.5), is(0.0));
    }


    @Test
    public void CanSubtract()
    {
        assertThat(Calculator.Subtract(1, 1), is(0));
        assertThat(Calculator.Subtract(-1, -1), is(0));
        assertThat(Calculator.Subtract(100, 5), is(95));
        assertThat(Calculator.Subtract(10, 5), is(5));
    }


    @Test
    public void CanMultiply()
    {
        assertThat(Calculator.Multiply(1, 1), is(1));
        assertThat(Calculator.Multiply(-1, -1), is(1));
        assertThat(Calculator.Multiply(100, 5), is(500));
        assertThat(Calculator.Multiply(3, 5), is(15));
    }

    @Test
    public void CanDivide()
    {
        assertThat(Calculator.Divide(1, 1), is(1));
        assertThat(Calculator.Divide(-1, -1), is(1));
        assertThat(Calculator.Divide(100, 5), is(20));
    }


    @Test
    public void CanDoStuff()
    {
        assertThat(true, is(true));
    }

    @Test
    public void CanSquare()
    {
        assertThat(Calculator.Square(2), is(4));
        assertThat(Calculator.Square(3), is(9));
        assertThat(Calculator.Square(4), is(16));
    }

    @Test
    public void Exponent()
    {
        assertThat(Calculator.Exponent(2, 3), is(8.0));
        assertThat(Calculator.Exponent(3, 3), is(27.0));
        assertThat(Calculator.Exponent(10, 3), is(1000.0));
        
    }
}
