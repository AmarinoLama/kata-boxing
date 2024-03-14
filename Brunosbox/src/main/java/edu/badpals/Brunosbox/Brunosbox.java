package edu.badpals.Brunosbox;

import edu.badpals.Brunosbox.Round.KnockdownRound;
import edu.badpals.Brunosbox.Round.RegularRound;
import edu.badpals.Brunosbox.Round.PointsDeducted;

public class Brunosbox
{
    public static void main( String[] args ) {

        RegularRound round = new RegularRound("10 - 9");
        round.boxerRoundScore();
        System.out.println("\n\t Regular round\t" + round.getRedBoxerScore() +
                " - " + round.getBlueBoxerScore());

        KnockdownRound knockdownRound = new KnockdownRound("10 - 8");
        knockdownRound.boxerRoundScore();
        System.out.println("\n\t knockdown round\t" + knockdownRound.getRedBoxerScore() +
                " - " + knockdownRound.getBlueBoxerScore());

        PointsDeducted deducted = new PointsDeducted("10 - 8 ,1");
        deducted.boxerRoundScore();
        System.out.println("\n\t points deducted round\t" + deducted.getRedBoxerScore() +
                " - " + deducted.getBlueBoxerScore());

    }
}