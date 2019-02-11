package fr.esir.mdi;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;

/**
 * Unit test for simple App.
 */
public class NormalTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void addPositiveNumbers() {
        assertTrue(Normal.add(3,3) == 6);
    }

    @Test
    public void addNegativeNumbers() {
        assertTrue(Normal.add(-3,-3) == -6);
    }
}
