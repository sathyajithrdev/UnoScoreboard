package com.saj.unoscoreboard.models;

/**
 * Created by sathyajith on 23/01/18.
 */

public class MatchModel {
    public String matchId;
    public String matchName;
    public String winnerId;
    public String loserId;
    public boolean isCompleted;
    public int finishingScore;
    public GameModel[] games;
}
