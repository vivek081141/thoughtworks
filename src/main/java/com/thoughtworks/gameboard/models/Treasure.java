package com.thoughtworks.gameboard.models;

import com.thoughtworks.gameboard.play.Player;

/**
 * Created by Vivek on 20-01-2018.
 */
public class Treasure extends Model {

    private static Integer AWARD = 200;
    private Player player;


    public boolean payReward(Player player){
        player.getReward(AWARD);
        return true;
    }
}
