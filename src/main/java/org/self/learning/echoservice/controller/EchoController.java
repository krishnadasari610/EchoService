package org.self.learning.echoservice.controller;

import org.self.learning.echoservice.model.Message;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @ResponseBody
    @GetMapping(path = "/echo", produces = MediaType.APPLICATION_JSON_VALUE)
    public Message echo(@RequestParam(required = false, defaultValue = "Hello World!") final String message) {
        return Message.builder().message(message).build();
    }
}
