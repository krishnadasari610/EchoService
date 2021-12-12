package org.self.learning.echoservice.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @ResponseBody
    @GetMapping(path = "/ping", produces = MediaType.TEXT_PLAIN_VALUE)
    public String ping() {
        return "Healthy";
    }
}
