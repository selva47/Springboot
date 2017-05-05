package com.selva.springboot;

import com.selva.services.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Selva on 4/5/17.
 */
@RestController
public class WelcomeController {

    @Autowired
    public WelcomeService service;

    @RequestMapping("/welcome")
    public String welcome(){
        return service.retreiveMessage();
    }

}
