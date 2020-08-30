package com.sample.stargroups.dao;

public class Fixture {
    private Integer fixtureId;
    private FixtureStatus fixtureStatus;
    private FootballFullState footballFullState;

    public void setFootballFullState(FootballFullState footballFullState) {
        this.footballFullState = footballFullState;
    }

    public FootballFullState getFootballFullState() {
        return footballFullState;
    }

    public void setFixtureId(Integer fixtureId) {
        this.fixtureId = fixtureId;
    }

    public Integer getFixtureId() {
        return fixtureId;
    }

    public void setFixtureStatus(FixtureStatus fixtureStatus) {
        this.fixtureStatus = fixtureStatus;
    }

    public FixtureStatus getFixtureStatus() {
        return fixtureStatus;
    }
}