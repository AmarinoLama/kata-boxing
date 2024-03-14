package edu.badpals.Brunosbox.Round;

import java.sql.Ref;

public class RoundFactory {

    private Round round;

    public Round getRound(String round) {
        if (round.length() > 7) {
            /* es de tipo PointsDeducted */
            PointsDeducted roundPointsDeducted = new PointsDeducted(round);
            return roundPointsDeducted;
        } else if (round.replace("8","").length() > 5) {
            /* es de tipo knockdownround */
            KnockdownRound roundKnockdown = new KnockdownRound(round);
            return roundKnockdown;
        }
        /* es de tipo regularround */
        RegularRound roundRegular = new RegularRound(round);
        return roundRegular;
    }
}