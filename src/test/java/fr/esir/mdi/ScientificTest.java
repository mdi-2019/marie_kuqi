package fr.esir.mdi;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
/**
 * Created by 16007303 on 11/02/19.
 */
public class ScientificTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void cosinusPI()
    {
        assertTrue( Scientifique.cosinus(Math.PI) == -1.0);
    }
    @Test
    public void p2puissance2(){
        assertTrue( Scientifique.puissance(2, 2) == 4);
    }
    @Test
    public void p0puissance0(){
        assertTrue( Scientifique.puissance(0, 0) == 1);
    }

}

