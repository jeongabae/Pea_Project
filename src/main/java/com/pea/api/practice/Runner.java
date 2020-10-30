package com.pea.api.practice;

import java.util.List;
import java.util.Scanner;

public class Runner {

    public Runner(GameBoard board) {
        playGame(board);
    }

    public void playGame(GameBoard board) {
        long startTime = System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("두 수를 입력하시오 :");
            int first = scanner.nextInt();
            int second = scanner.nextInt();

            if (board.isAnswer(first, second)) {
                board.changeGameAnswer(first, second);
            }

        } while (!validateCompleted(board.getItems()));

        outputPlayTime(startTime);
    }

    private void outputPlayTime(long startTime) {
        long endTime = System.currentTimeMillis();

        System.out.println("Game Completed ==> Play Time is : " + (endTime - startTime) + " ms");
    }

    private boolean validateCompleted(List<List<GameItem>> gameItemList) {
        boolean validated = true;

        for(List<GameItem> gameItems : gameItemList) {
            for(GameItem item : gameItems) {
                if (!item.isCompleted()) {
                    validated = false;
                    break;
                }
            }
        }
        return validated;
    }

}
