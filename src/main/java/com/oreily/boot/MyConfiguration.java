package com.oreily.boot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Александр on 08.07.2017.
 */

@Configuration
public class MyConfiguration {

    @Bean
    public String message(){
        return "Hello O'Reilly";
    }
}
