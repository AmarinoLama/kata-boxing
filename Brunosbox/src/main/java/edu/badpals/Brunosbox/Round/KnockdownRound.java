package edu.badpals.Brunosbox.Round;

public class KnockdownRound implements Round {

    private String roundScore;
    private byte redBoxerScore;
    private byte blueBoxerScore;

    public KnockdownRound(String roundScore) {
        this.roundScore = roundScore;
    }

    @Override
    public byte getRedBoxerScore() {
        return this.redBoxerScore;
    }

    @Override
    public byte getBlueBoxerScore() {
        return this.blueBoxerScore;
    }

    /* no entiendo estos dos de abajo */

    @Override
    public String boxerRoundScore() {
        return this.roundScore;
    }

    public KnockdownRound KnockdownRound (String roundScore) {
        return null;
    }
}
