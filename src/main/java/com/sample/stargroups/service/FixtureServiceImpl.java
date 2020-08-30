package com.sample.stargroups.service;

import com.sample.stargroups.config.StarGroupsConfig;
import com.sample.stargroups.dao.Fixture;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

import static com.sample.stargroups.AppConstants.*;

public class FixtureServiceImpl {

    public String createFixture(final Fixture fixture){
        final String url = DOMAIN_URL + STORE_NEW_FIXTURE;
        return StarGroupsConfig.postForEntity(url, fixture);
    }

    public List<Fixture> getAllFixture(){
        final RestTemplate restTemplate = StarGroupsConfig.getRestTemplate();
        final String url = DOMAIN_URL + GET_ALL;
        Fixture[] fixtures = restTemplate.getForObject(url, Fixture[].class);
        return Arrays.asList(fixtures);
    }


    public void deleteFixture(String id){
        final RestTemplate restTemplate = StarGroupsConfig.getRestTemplate();
        String url = DOMAIN_URL + DELETE_BY_ID;
        url = url.replace("{id}", id);
        restTemplate.delete(url);
    }

    public Fixture getFixtureById(final int id){
        final RestTemplate restTemplate = StarGroupsConfig.getRestTemplate();
        String url = DOMAIN_URL + GET_BY_ID;
        url = url.replace("{id}", Integer.toString(id));
        return restTemplate.getForObject(url, Fixture.class);
    }
}
