package com.saj.unoscoreboard.models;

import android.arch.persistence.room.PrimaryKey;

/**
 * Created by sathyajith on 23/01/18.
 */

public class UserModel {
    @PrimaryKey
    public String userId;

    public String userName;

    public String name;

    public String profilePic;

    public String[] groupIds;

    public int matchesPlayed;

    public int matchesWon;

    public int matchesLost;
}
