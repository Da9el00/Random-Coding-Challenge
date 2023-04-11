package challenges.b_factorial_finder;

import org.junit.Assert;
import org.junit.Test;

public class FactorialFinderTest {

    FactorialFinder factorialFinder = new FactorialFinder();

    @Test
    public void factorialNegative(){
        Assert.assertEquals(-1, factorialFinder.factorial(-1));
    }

    @Test
    public void factorialZero(){
        Assert.assertEquals(1, factorialFinder.factorial(0));
    }

    @Test
    public void factorialOne(){
        Assert.assertEquals(1, factorialFinder.factorial(1));
    }

    @Test
    public void factorialTwo(){
        Assert.assertEquals(2, factorialFinder.factorial(2));
    }

    @Test
    public void factorialThree(){
        Assert.assertEquals(6, factorialFinder.factorial(3));
    }

    @Test
    public void factorialSeven(){
        Assert.assertEquals(5040, factorialFinder.factorial(7));
    }
}
