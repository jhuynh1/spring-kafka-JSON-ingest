package com.github.jhuynh1.sample.spring.kafka.ingestgithub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class IngestController {
    private static final String githubEventsUrl = "https://api.github.com/events";
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @GetMapping(path = "/ingest/github/{topic}")
    public List ingestGithub(RestTemplate restTemplate, @PathVariable String topic) {
        //We didn't model our json and instead will just pass them in as strings
        List events = restTemplate.getForObject(
                githubEventsUrl, List.class);
        for(Object event:events) {
            kafkaTemplate.send(topic, event);
        }
        return events;
    }
}
