package be.jeroendruwe.k8s.developer.controller;

import be.jeroendruwe.k8s.developer.model.DeveloperResponse;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jdruwe on 07/10/16.
 */

@RestController
public class DevelopmentController {

    private static final Logger LOG = Logger.getLogger(DevelopmentController.class);

    @RequestMapping("/develop")
    public DeveloperResponse develop() {
        LOG.info("Received new develop request during an active sprint");
        return new DeveloperResponse("Put it on the backlog!");
    }

}
