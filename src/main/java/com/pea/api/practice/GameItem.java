package com.pea.api.practice;

public class GameItem {
    private int value;
    private String answer;
    private String display;
    private boolean completed;

    public GameItem(int value, String answer) {
        this.value = value;
        this.answer = answer;
        this.display = String.valueOf(value);
        this.completed = false;
    }

    public int getValue() {
        return value;
    }

    public String getAnswer() {
        return answer;
    }

    public String getDisplay() {
        return display;
    }

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
