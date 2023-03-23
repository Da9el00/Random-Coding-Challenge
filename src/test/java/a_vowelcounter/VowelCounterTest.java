package a_vowelcounter;

import challenges.a_vowelcounter.VowelCounter;
import org.junit.Assert;
import org.junit.Test;

public class VowelCounterTest {

    VowelCounter vowelCounter = new VowelCounter();

    @Test
    public void singleVowelTest(){
        Assert.assertEquals(1, vowelCounter.countVowels("Funky!"));
    }

    @Test
    public void multipleVowelTest1(){
        Assert.assertEquals(11, vowelCounter.countVowels("The quick brown fox jumps over the lazy dog"));
    }

    @Test
    public void multipleVowelTest2(){
        Assert.assertEquals(10, vowelCounter.countVowels("sentence containing all vowels"));
    }

    @Test
    public void noVowelTest(){
        Assert.assertEquals(1, vowelCounter.countVowels("Myths fly by dry sky"));
    }

    @Test
    public void aVowelTest(){
        Assert.assertEquals(1, vowelCounter.countVowels("a"));
    }
    @Test
    public void eVowelTest(){
        Assert.assertEquals(1, vowelCounter.countVowels("e"));
    }

    @Test
    public void iVowelTest(){
        Assert.assertEquals(1, vowelCounter.countVowels("i"));
    }

    @Test
    public void oVowelTest(){
        Assert.assertEquals(1, vowelCounter.countVowels("o"));
    }

    @Test
    public void uVowelTest(){
        Assert.assertEquals(1, vowelCounter.countVowels("u"));
    }


}
