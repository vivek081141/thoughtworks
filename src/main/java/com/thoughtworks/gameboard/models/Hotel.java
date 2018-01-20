package com.thoughtworks.gameboard.models;

import com.thoughtworks.gameboard.play.Player;

/**
 * Created by Vivek on 20-01-2018.
 */
public class Hotel extends Model  {

    private static Integer RENT = 50;
    private Player owner;

    public boolean isAcquired(Player player){
        if(owner==null){
            this.owner=player;
        }
        if(this.owner!=player){
            return false;
        }
        return true;
    }

    public boolean payRent(Player player){
        if(owner==null){
            throw new IllegalArgumentException("No owner exists");
        }
        owner.getRent(RENT);
        player.payRent(RENT);
        return true;
    }
}
