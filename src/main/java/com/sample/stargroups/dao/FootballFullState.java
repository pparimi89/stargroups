package com.sample.stargroups.dao;

import java.util.List;

public class FootballFullState {
    private String period;
    private List<Teams> teams;
    private String awayTeam;
    private Boolean finished;
    private Boolean started;
    private List<Object> redCards;
    private List<Object> possibles;
    private Integer gameTimeInSeconds;
    private List<Object> corners;
    private String startDateTime;
    private String homeTeam;
    private List<Object> yellowCards;
    private List<Goals> goals;

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getPeriod() {
        return period;
    }

    public void setTeams(List<Teams> teams) {
        this.teams = teams;
    }

    public List<Teams> getTeams() {
        return teams;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setStarted(Boolean started) {
        this.started = started;
    }

    public Boolean getStarted() {
        return started;
    }

    public void setGameTimeInSeconds(Integer gameTimeInSeconds) {
        this.gameTimeInSeconds = gameTimeInSeconds;
    }

    public Integer getGameTimeInSeconds() {
        return gameTimeInSeconds;
    }

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    public String getStartDateTime() {
        return startDateTime;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setGoals(List<Goals> goals) {
        this.goals = goals;
    }

    public List<Goals> getGoals() {
        return goals;
    }

    public List<Object> getRedCards() {
        return redCards;
    }

    public void setRedCards(List<Object> redCards) {
        this.redCards = redCards;
    }

    public List<Object> getPossibles() {
        return possibles;
    }

    public void setPossibles(List<Object> possibles) {
        this.possibles = possibles;
    }

    public List<Object> getCorners() {
        return corners;
    }

    public void setCorners(List<Object> corners) {
        this.corners = corners;
    }

    public List<Object> getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(List<Object> yellowCards) {
        this.yellowCards = yellowCards;
    }
}