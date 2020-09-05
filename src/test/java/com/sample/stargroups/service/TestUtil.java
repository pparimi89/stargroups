package com.sample.stargroups.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sample.stargroups.dao.Fixture;

import java.io.File;
import java.io.IOException;

public class TestUtil {

    public static Fixture getFixture(String fileName) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        ClassLoader classLoader = TestUtil.class.getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());
        return objectMapper.readValue(file, Fixture.class);
    }

}
