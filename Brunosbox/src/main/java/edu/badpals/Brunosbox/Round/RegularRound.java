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

    @Override
    public void boxerRoundScore() {
        String[] parts = this.roundScore.split(" ");
        this.blueBoxerScore = (byte) Integer.parseInt(parts[2]);
        this.redBoxerScore = (byte) Integer.parseInt(parts[0]);
    }
}
