package parser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/conditions")
public class ConditionsController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String DOWNSTREAM_URL = "https://downstream.api/endpoint";

    @PostMapping
    public ResponseEntity<String> processConditions(@RequestBody ConditionsWrapper request) {
        // Log the incoming request
        System.out.println("Received conditions: " + request);

        // Forward the request to a downstream API
        ResponseEntity<String> downstreamResponse = restTemplate.postForEntity(
            DOWNSTREAM_URL,
            request,
            String.class
        );

        return ResponseEntity.ok("Downstream Response: " + downstreamResponse.getBody());
    }
}
