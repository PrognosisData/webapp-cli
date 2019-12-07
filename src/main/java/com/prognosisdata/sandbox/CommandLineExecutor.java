/*
 * Copyright (c) 2019 Prognosis Data Corp.
 * All rights reserved.
 */

package com.prognosisdata.sandbox;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

@Component
@Order(value = 2)
@Slf4j
public class CommandLineExecutor implements ApplicationRunner {

    @Autowired
    private TestService testService;

    public void run(ApplicationArguments args) throws IOException, ParseException {
        if (args.containsOption("cli")) {
            List<String> commands = args.getNonOptionArgs();
            if (commands.size() > 1 && "test".equals(commands.get(0).toLowerCase()) ) {
                System.out.println(testService.test(commands.get(1)));
            } else {
                usage();
            }
            System.exit(1);
        }
    }

    private void usage() {
        System.out.println("usage: java -jar webapp-cli --spring.main.web-application-type=none --cli test <arg>");
    }

}
