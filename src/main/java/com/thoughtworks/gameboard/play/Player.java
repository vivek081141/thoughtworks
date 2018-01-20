package com.thoughtworks.gameboard.play;

/**
 * Created by Vivek on 20-01-2018.
 */
public class Player {
    private static final Integer INITIAL_AMOUNT=1000;

    private String name;
    private Integer currentAmount;

    private Integer currentPosition;


    public Player(String name){
        this.name=name;
        currentAmount=INITIAL_AMOUNT;
        currentPosition=0;
    }


    public void getRent(Integer rent) {
        this.currentAmount= this.currentAmount + rent;
    }


    public void payRent(Integer rent) {
        if(currentAmount<rent){
            throw new IllegalArgumentException("No money to pay rent");
        }
        this.currentAmount = this.currentAmount - rent;
    }

    public void payFine(Integer fine) {
        if(currentAmount<fine){
            throw new IllegalArgumentException("No money to pay fine");
        }

        this.currentAmount = this.currentAmount - fine;
    }

    public void getReward(Integer award) {
        this.currentAmount = this.currentAmount - award;
    }

    public void updateCurrentPosition(Integer currentPosition) {
        this.currentPosition = this.currentPosition + currentPosition;
    }

    public Integer getCurrentPosition() {
        return currentPosition;
    }
}
