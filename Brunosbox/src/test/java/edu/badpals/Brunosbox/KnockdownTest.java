package edu.badpals.Brunosbox;


import edu.badpals.Brunosbox.Round.KnockdownRound;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class KnockdownTest {
    @Test
    public void roundScoreTest(){
        KnockdownRound knockdownRound = new KnockdownRound("10 - 8");
        assertNotNull(knockdownRound);
        knockdownRound.boxerRoundScore();
        assertEquals(10,knockdownRound.getRedBoxerScore());
        assertEquals(8,knockdownRound.getBlueBoxerScore());
    }
}