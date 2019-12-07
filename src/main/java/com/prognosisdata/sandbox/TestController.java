/*
 * Copyright (c) 2019 Prognosis Data Corp.
 * All rights reserved.
 */

package com.prognosisdata.sandbox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/{arg}", method = RequestMethod.GET)
    public ResponseEntity<String> getSchema(@PathVariable("arg") String arg) {
        return ResponseEntity.ok().body(testService.test(arg));
    }

}
