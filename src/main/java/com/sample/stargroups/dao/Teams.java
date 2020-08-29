package com.sample.stargroups.dao;


public class Teams {
    private String teamId;
    private String name;
    private String association;

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAssociation(String association) {
        this.association = association;
    }

    public String getAssociation() {
        return association;
    }
}