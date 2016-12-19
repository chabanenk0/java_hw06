package com.github.chabanenk0;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by dmitry on 19.12.16.
 */
public class MainTest
{
    @Test
    public void testMain()
    {
        try {
            Main main = new Main();
            assertTrue(true);
        } catch (Exception e) {
            assertTrue(false);
        }
    }
}
