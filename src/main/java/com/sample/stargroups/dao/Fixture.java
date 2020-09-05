package com.sample.stargroups.dao;

public class Fixture {
    private String fixtureId;
    private FixtureStatus fixtureStatus;
    private FootballFullState footballFullState;

    public void setFootballFullState(FootballFullState footballFullState) {
        this.footballFullState = footballFullState;
    }

    public FootballFullState getFootballFullState() {
        return footballFullState;
    }

    public String getFixtureId() {
        return fixtureId;
    }

    public void setFixtureId(String fixtureId) {
        this.fixtureId = fixtureId;
    }

    public void setFixtureStatus(FixtureStatus fixtureStatus) {
        this.fixtureStatus = fixtureStatus;
    }

    public FixtureStatus getFixtureStatus() {
        return fixtureStatus;
    }
}