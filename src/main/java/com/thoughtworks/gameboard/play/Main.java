package com.thoughtworks.gameboard.play;

/**
 * Created by Vivek on 20-01-2018.
 */
public class Main {

    public static void main(String[] args){
        Player one =new Player("player-one");
        Player two =new Player("player-two");
        Player three =new Player("player-three");

        GameBoard gameBoard =new GameBoard();
        gameBoard.initialize();

        PlayGame playGame = new PlayGame();
        playGame.setGameBoard(gameBoard);

        playGame.addPlayer(one);
        playGame.addPlayer(two);
        playGame.addPlayer(three);

        playGame.advance(one,4);
        playGame.advance(two,4);
        playGame.advance(three,4);
        playGame.advance(one,6);
        playGame.advance(two,7);
        playGame.advance(three,8);
        playGame.advance(one,5);
        playGame.advance(two,11);
        playGame.advance(three,10);
        playGame.advance(one,12);
        playGame.advance(two,2);
        playGame.advance(three,3);
        playGame.advance(one,5);
        playGame.advance(two,6);
        playGame.advance(three,7);
        playGame.advance(one,8);
        playGame.advance(two,5);
        playGame.advance(three,11);
        playGame.advance(one,10);
        playGame.advance(two,12);
        playGame.advance(three,2);
        playGame.advance(one,3);
        playGame.advance(two,5);
        playGame.advance(three,6);
        playGame.advance(one,7);
        playGame.advance(two,8);
        playGame.advance(three,5);
        playGame.advance(one,11);
        playGame.advance(two,10);
        playGame.advance(three,12);
    }
}
