package com.sample.stargroups.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sample.stargroups.dao.Fixture;
import com.sample.stargroups.dao.FootballFullState;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.io.IOException;
import java.util.List;

class FixtureServiceImplTest {

    @Test
    public void getFixtureById() {
        FixtureServiceImpl fixtureService = new FixtureServiceImpl();
        Fixture fixtureById = fixtureService.getFixtureById(5);
    }

    /**
     * Retrieve all fixtures.
     * Assert that there are 3 fixtures within the returned object.
     * Assert that each of the 3 fixtures has a fixtureId value.
     */
    @Test
    public void testScenario1() {
        FixtureServiceImpl fixtureService = new FixtureServiceImpl();
        List<Fixture> allFixture = fixtureService.getAllFixture();
        Assertions.assertEquals(3, allFixture.size());
        allFixture.stream().forEach(fixture -> {
            Assertions.assertNotNull(fixture.getFixtureId());
        });
    }

    /**
     * Using the model guide in apiDocs.html, store a new fixture in the database.
     * Get the new fixture.
     * Assert, within the teams array, that the first object has a teamId of 'HOME'.
     */
    @Test
    public void testScenario2() throws IOException {
        FixtureServiceImpl fixtureService = new FixtureServiceImpl();
        Fixture fixture = new Fixture();
        fixture.setFixtureId(5);
        fixture.setFixtureId(6);
        FootballFullState footballFullState = new FootballFullState();
        footballFullState.setHomeTeam("New Kamal Home Team");
        footballFullState.setAwayTeam("New Kamal Away Team");
        fixture.setFootballFullState(footballFullState);
        fixtureService.createFixture(fixture);

        Fixture fixtureById = fixtureService.getFixtureById(6);
        Assertions.assertNotNull(fixtureById);

        fixtureService.deleteFixture("6");

        Fixture fixtureById2 = fixtureService.getFixtureById(6);
        Assertions.assertNull(fixtureById2);

    }

    public Fixture getFixtureTemplate() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue("/fixture_template.json", Fixture.class);
    }

}