package edu.badpals.Brunosbox;

import edu.badpals.Brunosbox.Round.RegularRound;

public class Brunosbox
{
    public static void main( String[] args ) {

        RegularRound round = new RegularRound("10 - 9");
        round.boxerRoundScore();
        System.out.println("\n\t Regular round\t" + round.getRedBoxerScore() +
                " - " + round.getBlueBoxerScore());

    }
}