package com.thoughtworks.gameboard.play;

import com.thoughtworks.gameboard.models.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vivek on 20-01-2018.
 */
public class PlayGame {

    private GameBoard gameBoard;

    private List<Player> playerList;


    public void addPlayer(Player player){
        if(playerList!=null){
            playerList=new ArrayList<>();
        }

        playerList.add(player);
    }

    public GameBoard getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(GameBoard gameBoard) {
        this.gameBoard = gameBoard;
    }

    public void advance(Player player, Integer i) {
        //updating the current position of the player in the board
        player.updateCurrentPosition(i);

        //getting the object stored in the GameBoard for the current position of the player
        Model model = gameBoard.getPosition(player.getCurrentPosition());

        //perform operation for the player
        model.performOperation(player);

    }
}
