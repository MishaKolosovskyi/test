package com.task.model;

public class Comment {

    private int score;
    private String time;
    private String summary;
    private String text;
    private int helpfulnessNumerator;
    private int helpfulnessDenominator;

    public Comment(int score, String time, String summary, String text,
                   int helpfulnessNumerator, int helpfulnessDenominator) {
        this.score = score;
        this.time = time;
        this.summary = summary;
        this.text = text;
        this.helpfulnessNumerator = helpfulnessNumerator;
        this.helpfulnessDenominator = helpfulnessDenominator;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getHelpfulnessNumerator() {
        return helpfulnessNumerator;
    }

    public void setHelpfulnessNumerator(int helpfulnessNumerator) {
        this.helpfulnessNumerator = helpfulnessNumerator;
    }

    public int getHelpfulnessDenominator() {
        return helpfulnessDenominator;
    }

    public void setHelpfulnessDenominator(int helpfulnessDenominator) {
        this.helpfulnessDenominator = helpfulnessDenominator;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "score=" + score +
                ", time='" + time + '\'' +
                ", summary='" + summary + '\'' +
                ", text='" + text + '\'' +
                ", helpfulnessNumerator=" + helpfulnessNumerator +
                ", helpfulnessDenominator=" + helpfulnessDenominator +
                '}';
    }
}
