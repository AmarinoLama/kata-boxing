package edu.badpals.Brunosbox.Round;

public class RegularRound implements Round {
    private String roundScore;
    private byte redBoxerScore;
    private byte blueBoxerScore;

    public RegularRound(String roundScore) {
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
        String[] parts = this.roundScore.split("-");
        /*
        this.blueBoxerScore = (byte) parts[0];

        this.redBoxerScore = (byte) parts[1];
        */
        return null;
    }

    public RegularRound RegularRound (String roundScore) {
        return null;
    }
}
