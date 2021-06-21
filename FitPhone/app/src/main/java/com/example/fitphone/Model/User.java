package com.example.fitphone.Model;

import java.util.ArrayList;
import java.util.List;

public class User {
    String username;
    List<Integer> articles;
    List<Integer> completedChallenges;
    List<Integer> progressChallenges;
    int score;


    public User(String username, List<Integer> articles, List<Integer> completedChallenges, List<Integer> progressChallenges, int score) {
        this.username = username;
        this.articles = articles;
        this.completedChallenges = completedChallenges;
        this.progressChallenges = progressChallenges;
        this.score = score;
    }

    public User() {
        this.articles = new ArrayList<Integer>();
        this.completedChallenges = new ArrayList<Integer>();
        this.progressChallenges = new ArrayList<Integer>();
    }


    public List<Integer> getArticles() {
        return articles;
    }

    public List<Integer> getCompletedChallenges() {
        return completedChallenges;
    }

    public List<Integer> getProgressChallenges() {
        return progressChallenges;
    }

    public int getScore() {
        return score;
    }

    public void setArticles(List<Integer> articles) {
        this.articles = articles;
    }

    public void setCompletedChallenges(List<Integer> completedChallenges) {
        this.completedChallenges = completedChallenges;
    }

    public void setProgressChallenges(List<Integer> progressChallenges) {
        this.progressChallenges = progressChallenges;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getUsername() {
        return username;
    }
}
