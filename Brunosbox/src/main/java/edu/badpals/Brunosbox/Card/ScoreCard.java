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

    public void setColor(String color) {
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

    }

    public int getRedCornerFinalScore() {
        return 0;
    }

    public int getBlueCornerFinalScore() {
        return 0;
    }
}
