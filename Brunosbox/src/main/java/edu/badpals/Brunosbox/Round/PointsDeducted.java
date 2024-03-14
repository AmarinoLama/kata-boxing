package edu.badpals.Brunosbox.Round;

public class PointsDeducted implements Round {
    private String roundScore;
    private byte redBoxerScore;
    private byte blueBoxerScore;

    public PointsDeducted(String roundScore) {
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

    public PointsDeducted PointsDeducted (String roundScore) {
        return null;
    }
}
