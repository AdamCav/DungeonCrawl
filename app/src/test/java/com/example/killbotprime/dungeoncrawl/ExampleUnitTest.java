package com.example.killbotprime.dungeoncrawl;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void randomizer_isCorrect(){
                int max=0;
                int min=1000;
                for (int i=0;i<1000;i++){
                    int roll=Randomizer.roll(1,10,5);
                    max=Math.max(max,roll);
                    min=Math.min(min,roll);
                }
                assertEquals(max,15);
                assertEquals(min,5);


    }
}