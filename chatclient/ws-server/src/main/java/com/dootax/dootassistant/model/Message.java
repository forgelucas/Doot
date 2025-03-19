package com.dootax.dootassistant.model;

import jdk.jshell.Snippet;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Message {
    private String senderName;
    private String receiverName;
    private String Message;
    private String date;
    private Status status;
}
