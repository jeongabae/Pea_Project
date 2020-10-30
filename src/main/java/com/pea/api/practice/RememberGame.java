package com.pea.api.practice;

/**
 * Remember Game with game board
 * Note : 2020253059 JeonGaBae
 */
public class RememberGame {

    private final static String[][] answers = {{"G","G","A","A"},{"Y","Y","W","W"},{"S","S","Z","Z"},{"L","L","F","F"}}; // 4 x 4 answers

    public static void main(String[] args) {
        if(args.length > 1) {
            int x = Integer.parseInt(args[0]); //row
            int y = Integer.parseInt(args[1]); //column

            GameBoard board = new GameBoard(x,y,answers); //create game board

            new Runner(board);
        }
    }
}
