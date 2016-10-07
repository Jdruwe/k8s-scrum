package be.jeroendruwe.k8s.productowner.controller;

import be.jeroendruwe.k8s.productowner.model.DeveloperResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jdruwe on 07/10/16.
 */

@RestController
public class SprintController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/meeting")
    public DeveloperResponse addToActiveSprint() {
        return restTemplate.getForObject("http://localhost:8080/develop", DeveloperResponse.class);
    }

}
