package edu.badpals.Brunosbox.Round;

import java.sql.Ref;

public class RoundFactory {

    private Round round;

    public static Round getRound(String round) {
        if (round.indexOf(',') != -1) {
            PointsDeducted roundPointsDeducted = new PointsDeducted(round);
            return roundPointsDeducted;
        } else {
            if (round.indexOf('8') != -1) {
                KnockdownRound roundKnockdown = new KnockdownRound(round);
                return roundKnockdown;
            }
        }
        RegularRound roundRegular = new RegularRound(round);
        return roundRegular;
    }
}