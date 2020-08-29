package com.sample.stargroups.config;

import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StarGroupsConfig {

    public static RestTemplate getRestTemplate(){
        final List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
        final MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
        messageConverters.add(converter);
        final RestTemplate restTemplate = new RestTemplate();
        restTemplate.setMessageConverters(messageConverters);

        return restTemplate;
    }

}
