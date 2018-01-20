package com.thoughtworks.gameboard.models;

import com.thoughtworks.gameboard.play.Player;

/**
 * Created by Vivek on 20-01-2018.
 */
public class Jail extends Model  {
    private static Integer FINE = 150;
    private Player player;


    public boolean payFine(Player player){
        player.payFine(FINE);
        return true;
    }


}
