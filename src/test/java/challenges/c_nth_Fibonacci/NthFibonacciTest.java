package challenges.c_nth_Fibonacci;

import org.junit.Assert;
import org.junit.Test;

public class NthFibonacciTest {

    NthFibonacci nthFibonacci = new NthFibonacci();

    @Test
    public void negativeNTest(){
        Assert.assertEquals(-1, nthFibonacci.nthFibonacci(-1));
    }

    @Test
    public void zeroNTest(){
        Assert.assertEquals(0, nthFibonacci.nthFibonacci(0));
    }

    @Test
    public void firstNTest(){
        Assert.assertEquals(1, nthFibonacci.nthFibonacci(1));
    }

    @Test
    public void seventhNTest(){
        Assert.assertEquals(13, nthFibonacci.nthFibonacci(7));
    }

    @Test
    public void fifteenthNTest(){
        Assert.assertEquals(610, nthFibonacci.nthFibonacci(15));
    }
}
