package com.pea.api.practice;

import java.util.ArrayList;
import java.util.List;

public class GameBoard {
    private List<List<GameItem>> items;

    public GameBoard(int x, int y, String[][] answers) {
        createBoard(x,y,answers);
    }

    private void createBoard(int x, int y,  String[][] answers) {
        List<List<GameItem>> board = new ArrayList<>();

        int num =0;

        for(int i=0; i < x; i++) {
            List<GameItem> gameItems = new ArrayList<>();
            for(int j=0; j < y; j++) {
                GameItem item = new GameItem(num++, answers[i][j]);
                gameItems.add(item);
            }
            board.add(gameItems);
        }
        this.items = board;
    }

    public List<List<GameItem>> getItems() {
        return items;
    }

    public boolean isAnswer(int x, int y) {
        String check1="",check2="";

        for(List<GameItem> gameItems : items) {
            for(GameItem gameItem : gameItems) {
                if(gameItem.getValue() == x) {
                    check1 = gameItem.getAnswer();
                }

                if(gameItem.getValue() == y) {
                    check2 = gameItem.getAnswer();
                }
            }

            if(!check1.isEmpty() && !check2.isEmpty()){
                break;
            }
        }

        return check1.equals(check2);
    }

    public void changeGameAnswer(int x, int y) {
        int checkCount=0;

        for(List<GameItem> gameItems : items) {
            for(GameItem gameItem : gameItems) {
                if(gameItem.getValue() == x) {
                    gameItem.setCompleted(true);
                    gameItem.setDisplay(gameItem.getAnswer());
                    checkCount++;
                }

                if(gameItem.getValue() == y) {
                    gameItem.setCompleted(true);
                    gameItem.setDisplay(gameItem.getAnswer());
                    checkCount++;
                }

                if(checkCount > 1) {
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "GameBoard{" +
                "items=" + items +
                '}';
    }
}
