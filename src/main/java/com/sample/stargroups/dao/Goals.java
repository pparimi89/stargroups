package com.sample.stargroups.dao;


public class Goals {
    private String period;
    private Boolean penalty;
    private Integer teamId;
    private Integer id;
    private Boolean confirmed;
    private Boolean ownGoal;
    private Integer clockTime;
    private Integer playerId;

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getPeriod() {
        return period;
    }

    public void setPenalty(Boolean penalty) {
        this.penalty = penalty;
    }

    public Boolean getPenalty() {
        return penalty;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }

    public Boolean getConfirmed() {
        return confirmed;
    }

    public void setOwnGoal(Boolean ownGoal) {
        this.ownGoal = ownGoal;
    }

    public Boolean getOwnGoal() {
        return ownGoal;
    }

    public void setClockTime(Integer clockTime) {
        this.clockTime = clockTime;
    }

    public Integer getClockTime() {
        return clockTime;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public Integer getPlayerId() {
        return playerId;
    }
}