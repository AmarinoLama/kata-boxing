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

    @Override
    public void boxerRoundScore() {
        String[] parts = this.roundScore.replace(", 1", "").replace("1, ","").split(" ");
        this.blueBoxerScore = (byte) Integer.parseInt(parts[2]);
        this.redBoxerScore = (byte) Integer.parseInt(parts[0]);
    }
}