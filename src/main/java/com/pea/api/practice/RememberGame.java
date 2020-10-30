package com.pea.api.practice;

public class RememberGame {

    private final static String[][] answers = {{"G","G","A","A"},{"Y","Y","W","W"},{"S","S","Z","Z"},{"L","L","F","F"}};

    public static void main(String[] args) {
        if(args.length > 1) {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            GameBoard board = new GameBoard(x,y,answers);

            new Runner(board);
        }
    }
}
