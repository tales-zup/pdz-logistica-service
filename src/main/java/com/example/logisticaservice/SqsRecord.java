package com.example.logisticaservice;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SqsRecord {


    @JsonProperty("MessageId")
    private String messageId;

    @JsonProperty("Message")
    private String message;

    public SqsRecord() {
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "SqsRecord{" +
                "messageId='" + messageId + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
