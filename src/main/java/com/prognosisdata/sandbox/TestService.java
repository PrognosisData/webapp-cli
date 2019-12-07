/*
 * Copyright (c) 2019 Prognosis Data Corp.
 * All rights reserved.
 */

package com.prognosisdata.sandbox;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String test(String arg) {
        return String.format("%1$s", arg);
    }

}
