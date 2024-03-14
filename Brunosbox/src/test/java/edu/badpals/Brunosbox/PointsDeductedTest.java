package edu.badpals.Brunosbox;

import edu.badpals.Brunosbox.Round.PointsDeducted;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PointsDeductedTest {
    @Test
    public void roundScoreTest(){
        PointsDeducted pointsDeducted = new PointsDeducted("10 - 8 ,1");
        assertNotNull(pointsDeducted);
        pointsDeducted.boxerRoundScore();
        assertEquals(10,pointsDeducted.getRedBoxerScore());
        assertEquals(8,pointsDeducted.getBlueBoxerScore());
    }

    @Test
    public void roundScoreTwoTest(){
        PointsDeducted pointsDeducted = new PointsDeducted("8, 1 - 10");
        assertNotNull(pointsDeducted);
        pointsDeducted.boxerRoundScore();
        assertEquals(8,pointsDeducted.getRedBoxerScore());
        assertEquals(10,pointsDeducted.getBlueBoxerScore());
    }
}
