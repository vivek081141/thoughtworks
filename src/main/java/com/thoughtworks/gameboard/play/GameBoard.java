package com.thoughtworks.gameboard.play;

import com.thoughtworks.gameboard.models.*;

import java.util.ArrayList;

/**
 * Created by Vivek on 20-01-2018.
 */
public class GameBoard {
     private ArrayList<Model> board;
     private Integer length = 45;

    public void addHotel(){
        board.add(new Hotel());
    }

    public void addTreasure(){
        board.add(new Treasure());
    }

    public void addEmpty(){
        board.add(new Empty());
    }

    public void addJail(){
        board.add(new Jail());
    }

    public void initialize(){
        board = new ArrayList<>();
        this.append("E")
                .append("E")
                .append("J")
                .append("H")
                .append("E")
                .append("T")
                .append("J")
                .append("T")
                .append("E")
                .append("E")
                .append("H")
                .append("J")
                .append("T")
                .append("H")
                .append("E")
                .append("E")
                .append("J")
                .append("H")
                .append("E")
                .append("T")
                .append("J")
                .append("T")
                .append("E")
                .append("E")
                .append("H")
                .append("J")
                .append("T")
                .append("H")
                .append("J")
                .append("E")
                .append("E")
                .append("J")
                .append("H")
                .append("E")
                .append("T")
                .append("J")
                .append("T")
                .append("E")
                .append("E")
                .append("H")
                .append("J")
                .append("T")
                .append("E")
                .append("H")
                .append("E");
    }

    public GameBoard append(String s){
        if(s.equals("E")){
            addEmpty();
        }
        if(s.equals("J")){
            addJail();
        }
        if(s.equals("T")){
            addTreasure();
        }

        if(s.equals("H")){
            addHotel();
        }
        return this;
    }


    /**
     * mod is used to get away with the cyclic nature of the board
     */
    public Model getPosition(Integer i) {
        return board.get(i%length);
    }
}
