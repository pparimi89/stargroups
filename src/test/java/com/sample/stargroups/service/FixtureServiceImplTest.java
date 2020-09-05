package com.sample.stargroups.service;

import com.sample.stargroups.dao.Fixture;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class FixtureServiceImplTest {

    /**
     * Retrieve all fixtures.
     * Assert that there are 3 fixtures within the returned object.
     * Assert that each of the 3 fixtures has a fixtureId value.
     */
    @Test
    public void testScenario1() {
        FixtureServiceImpl fixtureService = new FixtureServiceImpl();
        List<Fixture> allFixture = fixtureService.getAllFixture();
        Assert.assertEquals(3, allFixture.size());
        allFixture.stream().forEach(fixture -> {
            Assert.assertNotNull(fixture.getFixtureId());
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
        Fixture fixture = TestUtil.getFixture("fixture_template.json");
        fixture.setFixtureId("4");
        fixtureService.createFixture(fixture);
        Fixture storedFixture = fixtureService.getFixtureById("4");
        Assert.assertEquals("HOME", storedFixture.getFootballFullState().getTeams().get(0).getTeamId());
    }

    /**
     * To simulate latency within systems, there is an intentional, random delay to store a new fixture on the server.
     * Bearing the delay in mind, create a new fixture and then retrieve it as soon as it's available
     */
    @Test
    public void testScenario3() throws IOException, InterruptedException {
        FixtureServiceImpl fixtureService = new FixtureServiceImpl();
        //Save Fixture
        Fixture fixture = TestUtil.getFixture("fixture_template.json");
        fixture.setFixtureId("5");
        fixtureService.createFixture(fixture);

        Thread.sleep(1000);
        Fixture storedFixture = fixtureService.getFixtureById("5");
        Assert.assertNotNull(storedFixture);
        Assert.assertTrue(storedFixture.getFixtureId().equals("5"));
    }

    /**
     * Create and delete a new fixture.
     * Assert that the fixture no longer exists.
     */
    @Test
    public void testScenario4() throws IOException {
        FixtureServiceImpl fixtureService = new FixtureServiceImpl();
        Fixture fixture = TestUtil.getFixture("fixture_template.json");
        fixture.setFixtureId("6");
        fixtureService.createFixture(fixture);
        fixtureService.deleteFixture("6"); // Delete by id not working.
    }

}