package be.jeroendruwe.k8s.developer.controller;

import be.jeroendruwe.k8s.developer.model.DeveloperResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jdruwe on 07/10/16.
 */

@RestController
public class DevelopmentController {

    @RequestMapping("/develop")
    public DeveloperResponse develop() {
        return new DeveloperResponse("Put it in the backlog!");
    }

}
