package com.sample.stargroups.service;

import com.sample.stargroups.config.StarGroupsConfig;
import com.sample.stargroups.dao.Fixture;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.sample.stargroups.AppConstants.*;

public class FixtureServiceImpl {

    public String createFixture(final Fixture fixture){
        final RestTemplate restTemplate = StarGroupsConfig.getRestTemplate();
        final String url = DOMAIN_URL + STORE_NEW_FIXTURE;
        return restTemplate.postForObject(url, fixture, String.class);
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
        final String url = DOMAIN_URL + GET_BY_ID;
        return restTemplate.getForObject(url, Fixture.class);
    }
}
