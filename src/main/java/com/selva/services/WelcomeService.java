package com.selva.services;

import org.springframework.stereotype.Component;

/**
 * Created by Selva on 4/5/17.
 */
@Component
public class WelcomeService {

    public String retreiveMessage(){
        return "Welcome Service is Running..... Welcome Nandy Selva :)";
    }


}
