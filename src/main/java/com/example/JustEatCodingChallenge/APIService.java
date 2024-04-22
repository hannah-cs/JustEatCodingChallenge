package com.example.JustEatCodingChallenge;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class APIService {
    private static final String api_url = "https://uk.api.just-eat.io/discovery/uk/restaurants/enriched/bypostcode/";
    private RestTemplate restTemplate;
    public APIService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public String fetchData(String postcode){
        String requestUrl = api_url+postcode;
        String response =restTemplate.getForObject(requestUrl, String.class);
        return response;
    }
}
