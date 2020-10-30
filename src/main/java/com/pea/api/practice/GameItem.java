package com.pea.api.practice;

/**
 * GameItem
 *
 * Note : 2020253059 JeonGaBae
 */
public class GameItem {
    private int value; //number value
    private String answer; //char answer
    private String display; //use display on board
    private boolean completed; //use check answer completed

    /**
     * GameItem Constructor
     */
    public GameItem(int value, String answer) {
        this.value = value;
        this.answer = answer;
        this.display = String.valueOf(value);
        this.completed = false;
    }

    /**
     *
     * NOTE: value getter
     */
    public int getValue() {
        return value;
    }

    /**
     *
     * NOTE: answer getter
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * NOTE: display setter
     */
    public void setDisplay(String display) {
        this.display = display;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public boolean isCompleted() {
        return completed;
    }

    @Override
    public String toString() {
        return "GameItem{" +
                "value=" + value +
                ", answer='" + answer + '\'' +
                '}';
    }
}
