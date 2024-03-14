package edu.badpals.Brunosbox;


import edu.badpals.Brunosbox.Round.RegularRound;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RegularRoundTest {

    @Test // este para el alumnado
    public void boxerRoundScoreToIntTest() {
        RegularRound round = new RegularRound("10 - 9");
        round.boxerRoundScore();
        assertEquals(10, round.getRedBoxerScore());
        assertEquals(9, round.getBlueBoxerScore());
    }
}
