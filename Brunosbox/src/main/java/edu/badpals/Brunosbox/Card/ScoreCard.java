package edu.badpals.Brunosbox.Card;

import edu.badpals.Brunosbox.Round.Round;
import edu.badpals.Brunosbox.Round.RoundFactory;

import java.util.ArrayList;
import java.util.List;

public class ScoreCard {
    private String color;
    private String redCorner = "";
    private String blueCorner = "";
    private List<String> judgeScoreCard = new ArrayList<String>();
    private List<String> rounds = new ArrayList<String>();
    private RoundFactory roundFactory;

    public ScoreCard(String color) {
        this.color = color;
    }

    public void setRedCorner(String redCorner) {
        this.redCorner = redCorner;
    }

    public void setBlueCorner(String blueCorner) {
        this.blueCorner = blueCorner;
    }

    public byte getNumRounds() {
        return (byte) rounds.size();
    }

    public void loadJudgeScoreCard(String[] judgeScorecard) {
        for (String round : judgeScorecard) {
            rounds.add(round);
        }
    }

    public int getRedCornerFinalScore() {
        int sumPoints = 0;
        for (String round : rounds) {
            String[] parts = round.split(" - ");
            int puntuation = Integer.parseInt(parts[0]);
            sumPoints += puntuation;
        }
        return sumPoints;
    }

    public int getBlueCornerFinalScore() {
        int sumPoints = 0;
        for (String round : rounds) {
            String[] parts = round.split(" ");
            int puntuation = Integer.parseInt(parts[2]);
            sumPoints += puntuation;
        }
        return sumPoints;
    }

    @Override
    public String toString() {
        String output = "---------------   " + color + "   ---------------" + "\n" +
                "\t" + redCorner + "\t\t" + blueCorner + "\n" +
                "\t\t\t\t" + getNumRounds() + " rounds" + "\n" +
                "Round   " + "Score   " + "  Round     " + "Score   " + "Round   " + "\n" +
                "Score   " + "Total   " + "            " + "Total   " + "Score   " + "\n";

        byte redSumPuntuation = 0;
        byte blueSumPuntuation = 0;
        int numRound = 1;

        for (String round : this.rounds) {
            String[] parts = round.split(" - ");
            redSumPuntuation += (byte) Integer.parseInt(parts[0]);
            blueSumPuntuation += (byte) Integer.parseInt(parts[1]);
            output += parts[0] + " \t\t" + redSumPuntuation + " \t\t\t" + numRound + "\t\t" + parts[1] + " \t\t" + blueSumPuntuation + "\n";
            numRound += 1;
        }
        return output;
    }
}
