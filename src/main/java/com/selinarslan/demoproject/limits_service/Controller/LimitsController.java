package com.selinarslan.demoproject.limits_service.Controller;

import com.selinarslan.demoproject.limits_service.Configuration.Configuration;
import com.selinarslan.demoproject.limits_service.Entity.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}
