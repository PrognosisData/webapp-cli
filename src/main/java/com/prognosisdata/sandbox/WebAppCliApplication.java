/*
 * Copyright (c) 2019 Prognosis Data Corp.
 * All rights reserved.
 */

package com.prognosisdata.sandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;

@SpringBootApplication(exclude = RepositoryRestMvcAutoConfiguration.class)
public class WebAppCliApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebAppCliApplication.class, args);
    }

}
