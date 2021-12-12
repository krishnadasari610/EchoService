package org.self.learning.echoservice.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Message {

    private String message;
}
