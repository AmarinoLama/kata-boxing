package edu.badpals.Brunosbox.Card;

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

    public void loadJudgeScoreCard() {
        /* roundFactory.getRound(); */
    }

    public int getRedCornerFinalScore() {
        int sumPoints = 0;
        for (String round : rounds) {
            String[] parts = round.split(" ");
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
}
